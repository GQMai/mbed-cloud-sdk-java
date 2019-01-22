// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated abstract class. Do not modify its contents.
// Code customisation should happen in the child class [AccountDao]
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.Accounts;
import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.ApiClientWrapper;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.dao.AbstractModelDao;
import com.arm.mbed.cloud.sdk.common.dao.CreateDao;
import com.arm.mbed.cloud.sdk.common.dao.ReadDao;
import com.arm.mbed.cloud.sdk.common.dao.UpdateDao;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;
import com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificate;
import com.arm.mbed.cloud.sdk.security.model.SubtenantTrustedCertificateListOptions;

/**
 * Data Access Object (DAO) for accounts.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for accounts.")
public abstract class AbstractAccountDao extends AbstractModelDao<Account>
                                         implements CreateDao<Account>, UpdateDao<Account>, ReadDao<Account> {
    /**
     * Constructor.
     */
    public AbstractAccountDao() throws MbedCloudException {
        super();
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant trusted certificates matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allTrustedCertificates(String,String,Integer,Integer,Integer,String,Boolean,String,String,String,SubtenantTrustedCertificateListOptions,Account)}
     * 
     * @param nameEq
     *            null
     * @param serviceEq
     *            null
     * @param expireEq
     *            null
     * @param deviceExecutionModeEq
     *            null
     * @param deviceExecutionModeNeq
     *            null
     * @param ownerEq
     *            null
     * @param enrollmentModeEq
     *            null
     * @param statusEq
     *            null
     * @param issuerLike
     *            null
     * @param subjectLike
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant trusted certificates
     */
    public Paginator<SubtenantTrustedCertificate>
           allTrustedCertificates(@Nullable String nameEq, @Nullable String serviceEq, @Nullable Integer expireEq,
                                  @Nullable Integer deviceExecutionModeEq, @Nullable Integer deviceExecutionModeNeq,
                                  @Nullable String ownerEq, @Nullable Boolean enrollmentModeEq,
                                  @Nullable String statusEq, @Nullable String issuerLike, @Nullable String subjectLike,
                                  @Nullable SubtenantTrustedCertificateListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allTrustedCertificates(nameEq, serviceEq, expireEq, deviceExecutionModeEq,
                                                               deviceExecutionModeNeq, ownerEq, enrollmentModeEq,
                                                               statusEq, issuerLike, subjectLike, options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant trusted certificates matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allTrustedCertificates(String,String,String,Integer,Integer,Integer,String,Boolean,String,String,String,SubtenantTrustedCertificateListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param nameEq
     *            null
     * @param serviceEq
     *            null
     * @param expireEq
     *            null
     * @param deviceExecutionModeEq
     *            null
     * @param deviceExecutionModeNeq
     *            null
     * @param ownerEq
     *            null
     * @param enrollmentModeEq
     *            null
     * @param statusEq
     *            null
     * @param issuerLike
     *            null
     * @param subjectLike
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant trusted certificates
     */
    public Paginator<SubtenantTrustedCertificate>
           allTrustedCertificates(@NonNull String id, @Nullable String nameEq, @Nullable String serviceEq,
                                  @Nullable Integer expireEq, @Nullable Integer deviceExecutionModeEq,
                                  @Nullable Integer deviceExecutionModeNeq, @Nullable String ownerEq,
                                  @Nullable Boolean enrollmentModeEq, @Nullable String statusEq,
                                  @Nullable String issuerLike, @Nullable String subjectLike,
                                  @Nullable SubtenantTrustedCertificateListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allTrustedCertificates(id, nameEq, serviceEq, expireEq, deviceExecutionModeEq,
                                                               deviceExecutionModeNeq, ownerEq, enrollmentModeEq,
                                                               statusEq, issuerLike, subjectLike, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant user invitations matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allUserInvitations(String,String,SubtenantUserInvitationListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant user invitations
     */
    public Paginator<SubtenantUserInvitation>
           allUserInvitations(@NonNull String id, @Nullable String loginProfileEq,
                              @Nullable SubtenantUserInvitationListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allUserInvitations(id, loginProfileEq, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant user invitations matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allUserInvitations(String,SubtenantUserInvitationListOptions,Account)}
     * 
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant user invitations
     */
    public Paginator<SubtenantUserInvitation>
           allUserInvitations(@Nullable String loginProfileEq,
                              @Nullable SubtenantUserInvitationListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allUserInvitations(loginProfileEq, options, getModel());
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allUsers(String,String,String,String,String,String,SubtenantUserListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param emailEq
     *            null
     * @param statusEq
     *            null
     * @param statusIn
     *            null
     * @param statusNin
     *            null
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     */
    public Paginator<SubtenantUser> allUsers(@NonNull String id, @Nullable String emailEq, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable String loginProfileEq,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allUsers(id, emailEq, statusEq, statusIn, statusNin, loginProfileEq, options);
    }

    /**
     * Creates a {@link Paginator} for the list of subtenant users matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#allUsers(String,String,String,String,String,SubtenantUserListOptions,Account)}
     * 
     * @param emailEq
     *            null
     * @param statusEq
     *            null
     * @param statusIn
     *            null
     * @param statusNin
     *            null
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return paginator over the list of subtenant users
     */
    public Paginator<SubtenantUser> allUsers(@Nullable String emailEq, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable String loginProfileEq,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).allUsers(emailEq, statusEq, statusIn, statusNin, loginProfileEq, options,
                                                 getModel());
    }

    /**
     * Adds an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#createAccount(String,Account)}
     * 
     * @param action
     *            Action, either 'create' or 'enroll'.
     *            <ul>
     *            <li>'create' creates the account where its admin user has ACTIVE status if admin_password was defined
     *            in the request, or RESET status if no admin_password was defined. If the user already exists, its
     *            status is not modified.</li>
     *            <li>'enroll' creates the account where its admin user has ENROLLING status. If the user already
     *            exists, its status is not modified. Email to finish the enrollment or to notify the existing user
     *            about the new account is sent to the admin_email defined in the request.</li>
     *            </ul>
     *            .
     */
    public void create(@Nullable @DefaultValue("create") String action) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).createAccount(action, getModel()));
    }

    /**
     * Instantiates model.
     * 
     * @return instantiated model
     */
    @Override
    @Internal
    protected Account instantiateModel() {
        return new Account();
    }

    /**
     * Instantiates modules.
     * 
     * @param client
     *            an api client wrapper.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ApiClientWrapper client) {
        return new Accounts(client);
    }

    /**
     * Instantiates modules.
     * 
     * @param options
     *            a connection options.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(ConnectionOptions options) {
        return new Accounts(options);
    }

    /**
     * Instantiates modules.
     * 
     * @param context
     *            an sdk context.
     * @return instantiated module
     */
    @Override
    @Internal
    protected SdkContext instantiateModule(SdkContext context) {
        return new Accounts(context);
    }

    /**
     * Gets my account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#myAccount(String,String)}
     * 
     * @param include
     *            Comma separated additional data to return. Currently supported: limits, policies, sub_accounts.
     * @param properties
     *            Property name to be returned from account specific properties.
     */
    @SuppressWarnings("PMD.ShortMethodName")
    public void me(@Nullable String include, @Nullable String properties) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).myAccount(include, properties));
    }

    /**
     * Gets an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#getAccount(String,String,Account)}
     * 
     * @param include
     *            Comma separated additional data to return. Currently supported: limits, policies, sub_accounts.
     * @param properties
     *            Property name to be returned from account specific properties.
     */
    public void read(@Nullable String include, @Nullable String properties) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).getAccount(include, properties, getModel()));
    }

    /**
     * Gets an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#getAccount(String,String,String)}
     * 
     * @param include
     *            Comma separated additional data to return. Currently supported: limits, policies, sub_accounts.
     * @param properties
     *            Property name to be returned from account specific properties.
     * @param id
     *            Account ID.
     */
    public void read(@Nullable String include, @Nullable String properties,
                     @NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).getAccount(include, properties, id));
    }

    /**
     * Get all trusted certificates.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#trustedCertificates(String,String,Integer,Integer,Integer,String,Boolean,String,String,String,SubtenantTrustedCertificateListOptions,Account)}
     * 
     * @param nameEq
     *            null
     * @param serviceEq
     *            null
     * @param expireEq
     *            null
     * @param deviceExecutionModeEq
     *            null
     * @param deviceExecutionModeNeq
     *            null
     * @param ownerEq
     *            null
     * @param enrollmentModeEq
     *            null
     * @param statusEq
     *            null
     * @param issuerLike
     *            null
     * @param subjectLike
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant trusted certificates corresponding to filter options (One page).
     */
    public ListResponse<SubtenantTrustedCertificate>
           trustedCertificates(@Nullable String nameEq, @Nullable String serviceEq, @Nullable Integer expireEq,
                               @Nullable Integer deviceExecutionModeEq, @Nullable Integer deviceExecutionModeNeq,
                               @Nullable String ownerEq, @Nullable Boolean enrollmentModeEq, @Nullable String statusEq,
                               @Nullable String issuerLike, @Nullable String subjectLike,
                               @Nullable SubtenantTrustedCertificateListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).trustedCertificates(nameEq, serviceEq, expireEq, deviceExecutionModeEq,
                                                            deviceExecutionModeNeq, ownerEq, enrollmentModeEq, statusEq,
                                                            issuerLike, subjectLike, options, getModel());
    }

    /**
     * Get all trusted certificates.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#trustedCertificates(String,String,String,Integer,Integer,Integer,String,Boolean,String,String,String,SubtenantTrustedCertificateListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param nameEq
     *            null
     * @param serviceEq
     *            null
     * @param expireEq
     *            null
     * @param deviceExecutionModeEq
     *            null
     * @param deviceExecutionModeNeq
     *            null
     * @param ownerEq
     *            null
     * @param enrollmentModeEq
     *            null
     * @param statusEq
     *            null
     * @param issuerLike
     *            null
     * @param subjectLike
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant trusted certificates corresponding to filter options (One page).
     */
    public ListResponse<SubtenantTrustedCertificate>
           trustedCertificates(@NonNull String id, @Nullable String nameEq, @Nullable String serviceEq,
                               @Nullable Integer expireEq, @Nullable Integer deviceExecutionModeEq,
                               @Nullable Integer deviceExecutionModeNeq, @Nullable String ownerEq,
                               @Nullable Boolean enrollmentModeEq, @Nullable String statusEq,
                               @Nullable String issuerLike, @Nullable String subjectLike,
                               @Nullable SubtenantTrustedCertificateListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).trustedCertificates(id, nameEq, serviceEq, expireEq, deviceExecutionModeEq,
                                                            deviceExecutionModeNeq, ownerEq, enrollmentModeEq, statusEq,
                                                            issuerLike, subjectLike, options);
    }

    /**
     * Modifies an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#updateAccount(Account)}
     */
    @Override
    public void update() throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).updateAccount(getModel()));
    }

    /**
     * Modifies an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#updateAccount(Account)}
     * 
     * @param account
     *            an account.
     */
    @Override
    public void update(@NonNull Account account) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(account);
        update();
    }

    /**
     * Modifies an account.
     * <p>
     * Similar to {@link com.arm.mbed.cloud.sdk.accounts.model.Account#updateAccount(String,Account)}
     * 
     * @param id
     *            Account ID.
     */
    public void update(@NonNull String id) throws MbedCloudException {
        checkDaoConfiguration();
        setModel(((Accounts) getModule()).updateAccount(id, getModel()));
    }

    /**
     * Get the details of all the user invitations.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#userInvitations(String,String,SubtenantUserInvitationListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant user invitations corresponding to filter options (One page).
     */
    public ListResponse<SubtenantUserInvitation>
           userInvitations(@NonNull String id, @Nullable String loginProfileEq,
                           @Nullable SubtenantUserInvitationListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).userInvitations(id, loginProfileEq, options);
    }

    /**
     * Get the details of all the user invitations.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#userInvitations(String,SubtenantUserInvitationListOptions,Account)}
     * 
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant user invitations corresponding to filter options (One page).
     */
    public ListResponse<SubtenantUserInvitation>
           userInvitations(@Nullable String loginProfileEq,
                           @Nullable SubtenantUserInvitationListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).userInvitations(loginProfileEq, options, getModel());
    }

    /**
     * Get all user details.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#users(String,String,String,String,String,String,SubtenantUserListOptions)}
     * 
     * @param id
     *            Account ID.
     * @param emailEq
     *            null
     * @param statusEq
     *            null
     * @param statusIn
     *            null
     * @param statusNin
     *            null
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     */
    public ListResponse<SubtenantUser> users(@NonNull String id, @Nullable String emailEq, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable String loginProfileEq,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).users(id, emailEq, statusEq, statusIn, statusNin, loginProfileEq, options);
    }

    /**
     * Get all user details.
     * 
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.Account#users(String,String,String,String,String,SubtenantUserListOptions,Account)}
     * 
     * @param emailEq
     *            null
     * @param statusEq
     *            null
     * @param statusIn
     *            null
     * @param statusNin
     *            null
     * @param loginProfileEq
     *            null
     * @param options
     *            list options.
     * @return the list of subtenant users corresponding to filter options (One page).
     */
    public ListResponse<SubtenantUser> users(@Nullable String emailEq, @Nullable String statusEq,
                                             @Nullable String statusIn, @Nullable String statusNin,
                                             @Nullable String loginProfileEq,
                                             @Nullable SubtenantUserListOptions options) throws MbedCloudException {
        checkDaoConfiguration();
        return ((Accounts) getModule()).users(emailEq, statusEq, statusIn, statusNin, loginProfileEq, options,
                                              getModel());
    }
}
