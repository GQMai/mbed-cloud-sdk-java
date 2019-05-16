package com.arm.mbed.cloud.sdk;

import com.arm.mbed.cloud.sdk.annotations.API;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Module;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.certificates.adapters.CertificateAdapter;
import com.arm.mbed.cloud.sdk.certificates.model.Certificate;
import com.arm.mbed.cloud.sdk.certificates.model.CertificateListOptions;
import com.arm.mbed.cloud.sdk.certificates.model.CertificateType;
import com.arm.mbed.cloud.sdk.common.AbstractModule;
import com.arm.mbed.cloud.sdk.common.CloudCaller;
import com.arm.mbed.cloud.sdk.common.CloudRequest.CloudCall;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.PageRequester;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.DeveloperCertificateResponseData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ServerCredentialsResponseData;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.TrustedCertificateRespList;
import com.arm.mbed.cloud.sdk.security.model.SecurityEndpoints;

import retrofit2.Call;

@Preamble(description = "Specifies Certificates API")
@Module
@Deprecated
/**
 * API exposing functionality for dealing with certificates.
 * <p>
 * 
 * @deprecated Use foundation interface or {@link Security} instead.
 */
public class Certificates extends AbstractModule {

    private static final String TAG_CERTIFICATE = "certificate";
    private static final String TAG_CERTIFICATE_ID = "certificateId";
    private final SecurityEndpoints endpoint;

    /**
     * Certificates module constructor.
     *
     * @param options
     *            connection options @see {@link ConnectionOptions}.
     */
    public Certificates(@NonNull ConnectionOptions options) {
        super(options);
        endpoint = new SecurityEndpoints(this.serviceRegistry);
    }

    /**
     * Constructor.
     * 
     * @param context
     *            SDK context
     */
    public Certificates(SdkContext context) {
        super(context);
        endpoint = new SecurityEndpoints(this.serviceRegistry);
    }

    @Override
    public Certificates clone() {
        return new Certificates(this);
    }

    @SuppressWarnings("unchecked")
    @Internal
    private @Nullable Certificate fetchConnectorInformation(@Nullable CertificateType type,
                                                            @Nullable String certificateId) throws MbedCloudException {
        if (type == null) {
            return null;
        }
        CloudCall<?> caller = null;
        switch (type) {
            case BOOTSTRAP:
                caller = new CloudCall<ServerCredentialsResponseData>() {

                    @Override
                    public Call<ServerCredentialsResponseData> call() {
                        return endpoint.getServiceSecurityServerCredentialsApi().getBootstrapServerCredentials();
                    }

                };
                break;
            case LWM2M:
                caller = new CloudCall<ServerCredentialsResponseData>() {

                    @Override
                    public Call<ServerCredentialsResponseData> call() {
                        return endpoint.getServiceSecurityServerCredentialsApi().getL2M2MServerCredentials();
                    }

                };
                break;
            case DEVELOPER:
                final String finalCertificateId = certificateId;
                caller = (certificateId == null) ? null : new CloudCall<DeveloperCertificateResponseData>() {

                    @Override
                    public Call<DeveloperCertificateResponseData> call() {
                        return endpoint.getDeviceSecurityDeveloperClassCertificatesApi()
                                       .getDeveloperCertificate(finalCertificateId);
                    }

                };
                break;
            default:
                break;
        }
        if (caller == null) {
            return null;
        }
        if (type == CertificateType.DEVELOPER) {
            return CloudCaller.call(this, "getDeveloperCredentials()", CertificateAdapter.getDeveloperMapper(),
                                    (CloudCall<DeveloperCertificateResponseData>) caller);
        }
        return CloudCaller.call(this, "getConnectorCredentials()", CertificateAdapter.getServerMapper(),
                                (CloudCall<ServerCredentialsResponseData>) caller);
    }

    @Internal
    private Certificate
            performCertificateAction(final String actionName,
                                     final CloudCall<TrustedCertificateResp> action) throws MbedCloudException {
        final Certificate accountCertificate = CloudCaller.call(this, actionName, CertificateAdapter.getMapper(),
                                                                action);
        return Certificate.merge(accountCertificate,
                                 fetchConnectorInformation((accountCertificate == null) ? null
                                                                                        : accountCertificate.getType(),
                                                           (accountCertificate == null) ? null
                                                                                        : accountCertificate.getId()));
    }

    /**
     * Lists all certificates according to filter options.
     * <p>
     * Note: This method returns only partially complete certificate objects.
     * <p>
     * In order to see the full information about a particular certificate, use {@link #getCertificate(String)} instead.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     CertificateListOptions options = new CertificateListOptions();
     *     String ownerId = "015f4ac587f500000000000100100249";
     *     options.setOwnerIdFilter(ownerId);
     *     options.setTypeFilter(CertificateType.DEVELOPER);
     *
     *     ListResponse<Certificate> certificates = certificateApi.listCertificates(options);
     *     for (Certificate certificate : certificates) {
     *         System.out.println("Certificate name: " + certificate.getName());
     *         System.out.println("Certificate server URI: " + certificate.getServerUri());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return The list of certificates corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<Certificate>
           listCertificates(@Nullable CertificateListOptions options) throws MbedCloudException {
        final CertificateListOptions finalOptions = (options == null) ? new CertificateListOptions() : options;
        final String serviceEq = finalOptions.getTypeFilter() == CertificateType.DEVELOPER ? CertificateType.BOOTSTRAP.toString()
                                                                                           : ListOptionsEncoder.encodeSingleEqualFilter(CertificateListOptions.TYPE_FILTER,
                                                                                                                                        finalOptions);
        return CloudCaller.call(this, "listCertificates()", CertificateAdapter.getListMapper(),
                                new CloudCall<TrustedCertificateRespList>() {
                                    @Override
                                    public Call<TrustedCertificateRespList> call() {
                                        return endpoint.getDeviceSecurityCertificatesApi()
                                                       .getAllCertificates(finalOptions.getPageSize(),
                                                                           finalOptions.getAfter(),
                                                                           finalOptions.getOrder().toString(),
                                                                           ListOptionsEncoder.encodeInclude(finalOptions),
                                                                           ListOptionsEncoder.encodeSingleEqualFilter(CertificateListOptions.NAME_FILTER,
                                                                                                                      finalOptions),
                                                                           serviceEq,
                                                                           TranslationUtils.toInteger(ListOptionsEncoder.encodeSingleEqualFilter(CertificateListOptions.EXPIRES_FILTER,
                                                                                                                                                 finalOptions),
                                                                                                      null),
                                                                           finalOptions.getExecutionModeFilter(),
                                                                           finalOptions.getExecutionModeNotEqualFilter(),
                                                                           ListOptionsEncoder.encodeSingleEqualFilter(CertificateListOptions.OWNER_ID_FILTER,
                                                                                                                      finalOptions),
                                                                           finalOptions.getEnrollmentFilter(),
                                                                           ListOptionsEncoder.encodeSingleEqualFilter(CertificateListOptions.STATUS_FILTER,
                                                                                                                      finalOptions),
                                                                           ListOptionsEncoder.encodeSingleLikeFilter(CertificateListOptions.ISSUER_FILTER,
                                                                                                                     finalOptions),
                                                                           ListOptionsEncoder.encodeSingleLikeFilter(CertificateListOptions.SUBJECT_FILTER,
                                                                                                                     finalOptions),
                                                                           // FIXME
                                                                           null);
                                        // FIXME do encodeSingleEqualFilter(CertificateListOptions.VALID_FILTER);

                                    }
                                });
    }

    /**
     * Gets an iterator over all certificates according to filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     CertificateListOptions options = new CertificateListOptions();
     *     String ownerId = "015f4ac587f500000000000100100249";
     *     options.setOwnerIdFilter(ownerId);
     *     options.setTypeFilter(CertificateType.DEVELOPER);
     *
     *     Paginator<Certificate> certificates = certificateApi.listAllCertificates(options);
     *     while (certificates.hasNext()) {
     *         Certificate certificate = certificates.next();
     *         System.out.println("Certificate name: " + certificate.getName());
     *         System.out.println("Certificate server URI: " + certificate.getServerUri());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of certificates corresponding to filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<Certificate>
           listAllCertificates(@Nullable CertificateListOptions options) throws MbedCloudException {
        return new Paginator<>((options == null) ? new CertificateListOptions() : options,
                               new PageRequester<Certificate>() {

                                   @Override
                                   public ListResponse<Certificate>
                                          requestNewPage(ListOptions opt) throws MbedCloudException {
                                       return listCertificates((CertificateListOptions) opt);
                                   }
                               });
    }

    /**
     * Gets details of a certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String certificateId = "015f4ac587f500000000000100100249";
     *     Certificate certificate = certificateApi.getCertificate(certificateId);
     *     System.out.println("Certificate name: " + certificates.getName());
     *     assert certificateId == certificate.getId();
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificateId
     *            The certificate ID.
     * @return certificate.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Certificate getCertificate(@NonNull String certificateId) throws MbedCloudException {
        checkNotNull(certificateId, TAG_CERTIFICATE_ID);
        final String id = certificateId;
        return performCertificateAction("getCertificate()", new CloudCall<TrustedCertificateResp>() {

            @Override
            public Call<TrustedCertificateResp> call() {
                return endpoint.getDeviceSecurityCertificatesApi().getCertificate(id);
            }
        });
    }

    /**
     * Adds a new certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Certificate certificate = new Certificate();
     *     certificate.setName("Test Cert");
     *     certificate.setType(CertificateType.BOOTSTRAP);
     *     certificate.setSignature("wqEhG6BzgHWAyFXXXX....XXX");
     *     certificate.setCertificateData("rFEr1cRvLS1MmA....XXX");
     *
     *     Certificate newCertificate = certificateApi.addCertificate(certificate);
     *     System.out.println("Certificate ID: " + certificates.getId());
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificate
     *            Certificate request.
     * @return added certificate.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Certificate addCertificate(@NonNull Certificate certificate) throws MbedCloudException {
        checkNotNull(certificate, TAG_CERTIFICATE);
        checkModelValidity(certificate, TAG_CERTIFICATE);
        final Certificate finalCertificate = certificate;
        return performCertificateAction("addCertificate()", new CloudCall<TrustedCertificateResp>() {

            @Override
            public Call<TrustedCertificateResp> call() {
                return endpoint.getDeviceSecurityCertificatesApi()
                               .addCertificate(CertificateAdapter.reverseMapAdd(finalCertificate));
            }
        });
    }

    /**
     * Adds a new developer certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     final Certificate certificate = new Certificate();
     *     certificate.setName("Test Cert");
     *     certificate.setType(CertificateType.DEVELOPER);
     *     certificate.setSignature("wqEhG6BzgHWAyFXXXX....XXX");
     *     certificate.setCertificateData("rFEr1cRvLS1MmA....XXX");
     *
     *     Certificate newCertificate = certificateApi.addDeveloperCertificate(certificate);
     *     System.out.println("Certificate ID: " + certificates.getId());
     *     assert newCertificate == certificate;
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificate
     *            certificate Certificate request.
     * @return added certificate.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Certificate addDeveloperCertificate(@NonNull Certificate certificate) throws MbedCloudException {
        checkNotNull(certificate, TAG_CERTIFICATE);
        // To run this method, the certificate must be a developer certificate.
        certificate.setType(CertificateType.DEVELOPER);
        checkModelValidity(certificate, TAG_CERTIFICATE);
        final Certificate finalCertificate = certificate;
        final Certificate addedPartialCertificate1 = CloudCaller.call(this, "addDeveloperCertificate()",
                                                                      CertificateAdapter.getDeveloperMapper(),
                                                                      new CloudCall<DeveloperCertificateResponseData>() {

                                                                          @Override
                                                                          public Call<DeveloperCertificateResponseData>
                                                                                 call() {
                                                                              return endpoint.getDeviceSecurityDeveloperClassCertificatesApi()
                                                                                             .createDeveloperCertificate(CertificateAdapter.reverseDeveloperMap(finalCertificate));
                                                                          }
                                                                      });
        if (addedPartialCertificate1 == null) {
            return null;
        }
        final Certificate addedPartialCertificate2 = performCertificateAction("addDeveloperCertificate()",
                                                                              new CloudCall<TrustedCertificateResp>() {

                                                                                  @Override
                                                                                  public Call<TrustedCertificateResp>
                                                                                         call() {
                                                                                      return endpoint.getDeviceSecurityCertificatesApi()
                                                                                                     .getCertificate(addedPartialCertificate1.getId());
                                                                                  }
                                                                              });
        return Certificate.merge(addedPartialCertificate1, addedPartialCertificate2);
    }

    /**
     * Updates a certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Certificate certificate = new Certificate();
     *     String certificateId = "015f4ac587f500000000000100100249";
     *     certificate.setId(certificateId);
     *     certificate.setName("Changed Cert name");
     *     certificate.setType(CertificateType.DEVELOPER);
     *
     *     Certificate newCertificate = certificateApi.updateCertificate(certificate);
     *     System.out.println("New cert name: " + newCertificate.getName());
     *     assert certificateId == newCertificate.getId();
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificate
     *            certificate to update.
     * @return updated certificate.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Certificate updateCertificate(@NonNull Certificate certificate) throws MbedCloudException {
        checkNotNull(certificate, TAG_CERTIFICATE);
        checkNotNull(certificate.getId(), TAG_CERTIFICATE_ID);
        checkModelValidity(certificate, TAG_CERTIFICATE);
        final Certificate finalCertificate = certificate;
        return performCertificateAction("updateCertificate()", new CloudCall<TrustedCertificateResp>() {

            @Override
            public Call<TrustedCertificateResp> call() {
                return endpoint.getDeviceSecurityCertificatesApi()
                               .updateCertificate(finalCertificate.getId(),
                                                  CertificateAdapter.reverseMapUpdate(finalCertificate));
            }
        });
    }

    /**
     * Deletes a certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String certificateId = "015f4ac587f500000000000100100249";
     *     certificateApi.deleteCertificate(certificateId);
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificateId
     *            The certificate ID.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteCertificate(@NonNull String certificateId) throws MbedCloudException {
        checkNotNull(certificateId, TAG_CERTIFICATE_ID);
        final String id = certificateId;
        CloudCaller.call(this, "deleteCertificate()", null, new CloudCall<Void>() {

            @Override
            public Call<Void> call() {
                return endpoint.getDeviceSecurityCertificatesApi().deleteCertificate(id);
            }
        });
    }

    /**
     * Deletes a certificate.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Certificate certificate = certificateApi.getCertificate("015f4ac587f500000000000100100249");
     *     if (certificate != null){
     *      certificateApi.deleteCertificate(certificate);
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param certificate
     *            The certificate to delete.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteCertificate(@NonNull Certificate certificate) throws MbedCloudException {
        checkNotNull(certificate, TAG_CERTIFICATE);
        deleteCertificate(certificate.getId());
    }

    /**
     * Retrieves module name.
     *
     * @return module name.
     */
    @Override
    public String getModuleName() {
        return "Certificates";
    }

}
