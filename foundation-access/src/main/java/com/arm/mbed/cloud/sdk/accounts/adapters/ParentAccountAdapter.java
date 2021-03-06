// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.ParentAccount;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ParentAccountInfo;

/**
 * Adapter for parent accounts.
 */
@Preamble(description = "Adapter for parent accounts.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class ParentAccountAdapter {
    /**
     * Constructor.
     */
    private ParentAccountAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a parent account info into a parent account.
     * 
     * @param toBeMapped
     *            a parent account info.
     * @return mapped a parent account
     */
    @Internal
    public static ParentAccount map(ParentAccountInfo toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final ParentAccount parentAccount = new ParentAccount(toBeMapped.getAdminEmail(), toBeMapped.getAdminName());
        parentAccount.setId(toBeMapped.getId());
        return parentAccount;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<ParentAccountInfo, ParentAccount> getMapper() {
        return new GenericAdapter.Mapper<ParentAccountInfo, ParentAccount>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ParentAccount map(ParentAccountInfo toBeMapped) {
                return ParentAccountAdapter.map(toBeMapped);
            }
        };
    }
}
