// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.IdentityProviderPublicKey;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.IdpPublicKey;
import java.util.List;

/**
 * Adapter for identity provider public keys.
 */
@Preamble(description = "Adapter for identity provider public keys.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class IdentityProviderPublicKeyAdapter {
    /**
     * Constructor.
     */
    private IdentityProviderPublicKeyAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps an identity provider public key into an idp public key.
     * 
     * @param toBeMapped
     *            an identity provider public key.
     * @return mapped an idp public key
     */
    @Internal
    public static IdpPublicKey reverseMapAddRequest(IdentityProviderPublicKey toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdpPublicKey idpPublicKey = new IdpPublicKey();
        idpPublicKey.setKey(toBeMapped.getKey());
        idpPublicKey.setKid(toBeMapped.getKid());
        return idpPublicKey;
    }

    /**
     * Maps a list of identity provider public key into a list of idp public key.
     * 
     * @param toBeMapped
     *            a list of identity provider public key.
     * @return mapped simple list
     */
    @Internal
    public static List<IdpPublicKey> reverseMapAddSimpleList(List<IdentityProviderPublicKey> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, IdentityProviderPublicKeyAdapter.getAddMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<IdentityProviderPublicKey, IdpPublicKey> getAddMapper() {
        return new GenericAdapter.Mapper<IdentityProviderPublicKey, IdpPublicKey>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public IdpPublicKey map(IdentityProviderPublicKey toBeMapped) {
                return IdentityProviderPublicKeyAdapter.reverseMapAddRequest(toBeMapped);
            }
        };
    }

    /**
     * Maps an idp public key into an identity provider public key.
     * 
     * @param toBeMapped
     *            an idp public key.
     * @return mapped an identity provider public key
     */
    @Internal
    public static IdentityProviderPublicKey map(IdpPublicKey toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdentityProviderPublicKey identityProviderPublicKey = new IdentityProviderPublicKey(toBeMapped.getKey(),
                                                                                                  toBeMapped.getKid());
        return identityProviderPublicKey;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<IdpPublicKey, IdentityProviderPublicKey> getMapper() {
        return new GenericAdapter.Mapper<IdpPublicKey, IdentityProviderPublicKey>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public IdentityProviderPublicKey map(IdpPublicKey toBeMapped) {
                return IdentityProviderPublicKeyAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a list of idp public key into a list of identity provider public key.
     * 
     * @param toBeMapped
     *            a list of idp public key.
     * @return mapped simple list
     */
    @Internal
    public static List<IdentityProviderPublicKey> mapSimpleList(List<IdpPublicKey> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, IdentityProviderPublicKeyAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<List<IdpPublicKey>, List<IdentityProviderPublicKey>> getSimpleListMapper() {
        return new GenericAdapter.Mapper<List<IdpPublicKey>, List<IdentityProviderPublicKey>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public List<IdentityProviderPublicKey> map(List<IdpPublicKey> toBeMapped) {
                return IdentityProviderPublicKeyAdapter.mapSimpleList(toBeMapped);
            }
        };
    }

    /**
     * Maps an identity provider public key into an idp public key.
     * 
     * @param toBeMapped
     *            an identity provider public key.
     * @return mapped an idp public key
     */
    @Internal
    public static IdpPublicKey reverseMapUpdateRequest(IdentityProviderPublicKey toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final IdpPublicKey idpPublicKey = new IdpPublicKey();
        idpPublicKey.setKey(toBeMapped.getKey());
        idpPublicKey.setKid(toBeMapped.getKid());
        return idpPublicKey;
    }

    /**
     * Maps a list of identity provider public key into a list of idp public key.
     * 
     * @param toBeMapped
     *            a list of identity provider public key.
     * @return mapped simple list
     */
    @Internal
    public static List<IdpPublicKey> reverseMapUpdateSimpleList(List<IdentityProviderPublicKey> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, IdentityProviderPublicKeyAdapter.getUpdateMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<IdentityProviderPublicKey, IdpPublicKey> getUpdateMapper() {
        return new GenericAdapter.Mapper<IdentityProviderPublicKey, IdpPublicKey>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public IdpPublicKey map(IdentityProviderPublicKey toBeMapped) {
                return IdentityProviderPublicKeyAdapter.reverseMapUpdateRequest(toBeMapped);
            }
        };
    }
}
