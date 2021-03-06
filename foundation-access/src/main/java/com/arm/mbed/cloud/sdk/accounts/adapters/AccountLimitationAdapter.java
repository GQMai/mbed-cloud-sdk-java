// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.AccountLimitation;
import com.arm.mbed.cloud.sdk.accounts.model.AccountLimitationInheritedType;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import java.util.List;

/**
 * Adapter for account limitations.
 */
@Preamble(description = "Adapter for account limitations.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class AccountLimitationAdapter {
    /**
     * Constructor.
     */
    private AccountLimitationAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps an account limitation into an account limitation.
     * 
     * @param toBeMapped
     *            an account limitation.
     * @return mapped an account limitation
     */
    @Internal
    public static AccountLimitation
           map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final AccountLimitation accountLimitation = new AccountLimitation(TranslationUtils.toInt(toBeMapped.getBillingPeriod(),
                                                                                                 1),
                                                                          TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                          toBeMapped.getDescription(),
                                                                          TranslationUtils.toBool(toBeMapped.isInherited()),
                                                                          toBeMapped.getInheritedFrom(),
                                                                          translateToAccountLimitationInheritedType(toBeMapped.getInheritedType()),
                                                                          toBeMapped.getInheritedValue(),
                                                                          TranslationUtils.toLong(toBeMapped.getLimit()),
                                                                          toBeMapped.getName(),
                                                                          TranslationUtils.toLong(toBeMapped.getQuota()),
                                                                          TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        accountLimitation.setId(toBeMapped.getId());
        return accountLimitation;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static
           GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation,
                                 AccountLimitation>
           getMapper() {
        return new GenericAdapter.Mapper<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation,
                                         AccountLimitation>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public AccountLimitation
                   map(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation toBeMapped) {
                return AccountLimitationAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            an inherited type enum.
     * @return mapped enum value
     */
    @Internal
    protected static AccountLimitationInheritedType
              translateToAccountLimitationInheritedType(com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation.InheritedTypeEnum toBeMapped) {
        if (toBeMapped == null) {
            return AccountLimitationInheritedType.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ACCOUNT:
                return AccountLimitationInheritedType.ACCOUNT;
            case TEMPLATE:
                return AccountLimitationInheritedType.TEMPLATE;
            case TIER_TEMPLATE:
                return AccountLimitationInheritedType.TIER_TEMPLATE;
            default:
                return AccountLimitationInheritedType.getUnknownEnum();
        }
    }

    /**
     * Maps a list of account limitation into a list of account limitation.
     * 
     * @param toBeMapped
     *            a list of account limitation.
     * @return mapped simple list
     */
    @Internal
    public static List<AccountLimitation>
           mapSimpleList(List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation> toBeMapped) {
        return GenericAdapter.mapList(toBeMapped, AccountLimitationAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static
           GenericAdapter.Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation>,
                                 List<AccountLimitation>>
           getSimpleListMapper() {
        return new GenericAdapter.Mapper<List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation>,
                                         List<AccountLimitation>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public List<AccountLimitation>
                   map(List<com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountLimitation> toBeMapped) {
                return AccountLimitationAdapter.mapSimpleList(toBeMapped);
            }
        };
    }
}
