// This file was generated by the Pelion SDK foundation code generator.
// This model class was autogenerated on Fri Jan 11 01:52:40 GMT 2019. Feel free to change its contents as you wish.
package com.arm.mbed.cloud.sdk.accounts.model;

import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.NotImplementedException;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;

/**
 * Data Access Object (DAO) for listing user invitations.
 * <p>
 * 
 * @see <a href="http://www.corej2eepatterns.com/Patterns/DataAccessObject.htm">Core J2EE Patterns - Data Access
 *      Object</a>
 */
@Preamble(description = "Data Access Object (DAO) for listing user invitations.")
public class UserInvitationListDao extends AbstractUserInvitationListDao {
    /**
     * Constructor.
     */
    public UserInvitationListDao() throws MbedCloudException {
        super();
    }

    /**
     * Lists user invitations matching filter options.
     * <p>
     * Similar to
     * {@link com.arm.mbed.cloud.sdk.accounts.model.UserInvitation#listUserInvitations(String,UserInvitationListOptions)}
     * 
     * @param options
     *            list options.
     * @return one page of user invitations
     */
    @Override
    protected ListResponse<UserInvitation> requestOnePage(UserInvitationListOptions options) throws MbedCloudException,
                                                                                             NotImplementedException {
        // TODO Auto-generated method stub.;
        throw new NotImplementedException();
        // The following code is auto-generated and can be used if carrying out what requestOnePage() intends/is meant
        // to do.

        /*
         * checkDaoConfiguration(); return ((Accounts)module).listUserInvitations(null, options);
         */
    }

    /**
     * Clones this instance.
     * <p>
     * 
     * @see java.lang.Object#clone()
     * @return a cloned instance
     */
    @Override
    public UserInvitationListDao clone() {
        try {
            return new UserInvitationListDao().configureAndGet(getModule() == null ? null : getModule().clone());
        } catch (MbedCloudException exception) {
            return null;
        }
    }
}
