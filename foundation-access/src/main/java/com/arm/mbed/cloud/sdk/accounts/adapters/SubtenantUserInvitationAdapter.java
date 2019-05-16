// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.accounts.adapters;

import com.arm.mbed.cloud.sdk.accounts.model.SubtenantUserInvitation;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UserInvitationReq;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UserInvitationResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UserInvitationRespList;
import java.util.List;

/**
 * Adapter for subtenant user invitations.
 */
@Preamble(description = "Adapter for subtenant user invitations.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class SubtenantUserInvitationAdapter {
    /**
     * Constructor.
     */
    private SubtenantUserInvitationAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a user invitation resp into a subtenant user invitation.
     * 
     * @param toBeMapped
     *            a user invitation resp.
     * @return mapped a subtenant user invitation
     */
    @Internal
    public static SubtenantUserInvitation map(UserInvitationResp toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final SubtenantUserInvitation subtenantUserInvitation = new SubtenantUserInvitation(TranslationUtils.toDate(toBeMapped.getCreatedAt()),
                                                                                            TranslationUtils.toDate(toBeMapped.getExpiration()),
                                                                                            TranslationUtils.toDate(toBeMapped.getUpdatedAt()),
                                                                                            toBeMapped.getUserId());
        subtenantUserInvitation.setAccountId(toBeMapped.getAccountId());
        subtenantUserInvitation.setEmail(toBeMapped.getEmail());
        subtenantUserInvitation.setId(toBeMapped.getId());
        subtenantUserInvitation.setLoginProfiles(LoginProfileAdapter.mapSimpleList(toBeMapped.getLoginProfiles()));
        return subtenantUserInvitation;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<UserInvitationResp, SubtenantUserInvitation> getMapper() {
        return new GenericAdapter.Mapper<UserInvitationResp, SubtenantUserInvitation>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public SubtenantUserInvitation map(UserInvitationResp toBeMapped) {
                return SubtenantUserInvitationAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a subtenant user invitation into a user invitation req.
     * 
     * @param toBeMapped
     *            a subtenant user invitation.
     * @return mapped a user invitation req
     */
    @Internal
    public static UserInvitationReq reverseMapAddRequest(SubtenantUserInvitation toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final UserInvitationReq userInvitationReq = new UserInvitationReq();
        userInvitationReq.setEmail(toBeMapped.getEmail());
        // No field equivalent to groups in UserInvitationReq was found in SubtenantUserInvitation
        userInvitationReq.setLoginProfiles(LoginProfileAdapter.reverseMapAddSimpleList(toBeMapped.getLoginProfiles()));
        // No field equivalent to validForDays in UserInvitationReq was found in SubtenantUserInvitation
        return userInvitationReq;
    }

    /**
     * Maps a user invitation resp list into a subtenant user invitation.
     * 
     * @param toBeMapped
     *            a user invitation resp list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<SubtenantUserInvitation> mapList(UserInvitationRespList toBeMapped) {
        final UserInvitationRespList finalList = toBeMapped;
        final GenericAdapter.RespList<UserInvitationResp> respList = new GenericAdapter.RespList<UserInvitationResp>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<UserInvitationResp> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, SubtenantUserInvitationAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<UserInvitationRespList, ListResponse<SubtenantUserInvitation>> getListMapper() {
        return new GenericAdapter.Mapper<UserInvitationRespList, ListResponse<SubtenantUserInvitation>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<SubtenantUserInvitation> map(UserInvitationRespList toBeMapped) {
                return SubtenantUserInvitationAdapter.mapList(toBeMapped);
            }
        };
    }
}
