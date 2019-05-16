package com.arm.mbed.cloud.sdk;

import com.arm.mbed.cloud.sdk.accountmanagement.adapters.AccountAdapter;
import com.arm.mbed.cloud.sdk.accountmanagement.adapters.ApiKeyAdapter;
import com.arm.mbed.cloud.sdk.accountmanagement.adapters.GroupAdapter;
import com.arm.mbed.cloud.sdk.accountmanagement.adapters.UserAdapter;
import com.arm.mbed.cloud.sdk.accountmanagement.model.Account;
import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKey;
import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKeyListOptions;
import com.arm.mbed.cloud.sdk.accountmanagement.model.EndPoints;
import com.arm.mbed.cloud.sdk.accountmanagement.model.Group;
import com.arm.mbed.cloud.sdk.accountmanagement.model.GroupListOptions;
import com.arm.mbed.cloud.sdk.accountmanagement.model.User;
import com.arm.mbed.cloud.sdk.accountmanagement.model.UserListOptions;
import com.arm.mbed.cloud.sdk.annotations.API;
import com.arm.mbed.cloud.sdk.annotations.Module;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.AbstractModule;
import com.arm.mbed.cloud.sdk.common.CloudCaller;
import com.arm.mbed.cloud.sdk.common.CloudRequest.CloudCall;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.SdkContext;
import com.arm.mbed.cloud.sdk.common.listing.ListOptions;
import com.arm.mbed.cloud.sdk.common.listing.ListOptionsEncoder;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.common.listing.PageRequester;
import com.arm.mbed.cloud.sdk.common.listing.Paginator;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.AccountInfo;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyInfoResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.ApiKeyInfoRespList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.GroupSummary;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.GroupSummaryList;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UserInfoResp;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.UserInfoRespList;

import retrofit2.Call;

@Preamble(description = "Specifies account management API")
@Module
@Deprecated
/**
 * API exposing functionality for creating and managing accounts, users, groups and API keys in the organisation.
 * <p>
 * 
 * @deprecated Use foundation interface or {@link Accounts} instead.
 */
public class AccountManagement extends AbstractModule {

    private static final String TAG_USER_UUID = "user UUID";
    private static final String TAG_API_KEY_UUID = "apiKey UUID";
    private static final String TAG_API_KEY = "apiKey";
    private static final String TAG_ACCOUNT = "account";
    private static final String TAG_API_KEY_ID = "apiKeyId";
    private static final String TAG_USER_ID = "userId";
    private static final String TAG_USER = "user";
    private static final String TAG_GROUP_ID = "groupId";
    private static final String TAG_GROUP = "group";
    private final EndPoints endpoint;

    /**
     * Account management module constructor.
     *
     * @param options
     *            connection options @see {@link ConnectionOptions}.
     */
    public AccountManagement(@NonNull ConnectionOptions options) {
        super(options);
        endpoint = new EndPoints(this.serviceRegistry);
    }

    /**
     * Constructor.
     * 
     * @param context
     *            SDK context
     */
    public AccountManagement(SdkContext context) {
        super(context);
        endpoint = new EndPoints(this.serviceRegistry);
    }

    @Override
    public AccountManagement clone() {
        return new AccountManagement(this);
    }

    /**
     * Gets details of account associated with current API key.
     * <p>
     * Example:
     *
     * <pre>
     * {
     *     &#64;code
     *     Account account = accountManagementApi.getAccount(null);
     *     System.out.println("User account ID: " + account.getId());
     *     System.out.println("Associated user email: " + account.getEmail());
     * }
     *
     * </pre>
     *
     * @param propertyName
     *            Property name to be returned from account specific properties.
     * @return account details.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Account getAccount(@Nullable String propertyName) throws MbedCloudException {
        final String finalPropertyName = propertyName;
        return CloudCaller.call(this, "getAccount()", AccountAdapter.getMapper(), new CloudCall<AccountInfo>() {

            @Override
            public Call<AccountInfo> call() {
                return endpoint.getAccountProfileApi().getMyAccountInfo("limits, policies", finalPropertyName);
            }
        });
    }

    /**
     * Gets details of account associated with current API key.
     * <p>
     * Example:
     *
     * <pre>
     * {
     *     &#64;code
     *     Account account = accountManagementApi.getAccount();
     *     System.out.println("User account ID: " + account.getId());
     *     System.out.println("Associated user email: " + account.getEmail());
     * }
     *
     * </pre>
     *
     * @return account details.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Account getAccount() throws MbedCloudException {
        return getAccount(null);
    }

    /**
     * Updates details of account associated with current API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code Account account = accountManagementApi.getAccount()
     *     account.setCity("Austin");
     *     accoujnt.setState("Texas");
     *     account.setCountry("US");
     *
     *     accountManagementApi.updateAccount(account);
     * }
     * </pre>
     *
     * @param account
     *            The account object to update.
     * @return updated account.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Account updateAccount(@NonNull Account account) throws MbedCloudException {
        checkNotNull(account, TAG_ACCOUNT);
        checkModelValidity(account, TAG_ACCOUNT);
        final Account finalAccount = account;
        return CloudCaller.call(this, "updateAccount()", AccountAdapter.getMapper(), new CloudCall<AccountInfo>() {

            @Override
            public Call<AccountInfo> call() {
                return endpoint.getAccountProfileApi().updateMyAccount(AccountAdapter.reverseMap(finalAccount));
            }
        });
    }

    /**
     * Lists all API keys according to filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     ApiKeyListOptions options = new ApiKeyListOptions();
     *     String ownerId = "015f4ac587f500000000000100100249";
     *     options.setOwnerIdFilter(ownerId);
     *
     *     ListResponse<ApiKey> apiKeys = accountManagementApi.listApiKeys(options);
     *     for (ApiKey apiKey : apiKeys) {
     *         System.out.println("API key: " + apiKey.getKey());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return The list of API keys corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<ApiKey> listApiKeys(@Nullable ApiKeyListOptions options) throws MbedCloudException {
        final ApiKeyListOptions finalOptions = (options == null) ? new ApiKeyListOptions() : options;

        return CloudCaller.call(this, "listApiKeys()", ApiKeyAdapter.getListMapper(),
                                new CloudCall<ApiKeyInfoRespList>() {

                                    @Override
                                    public Call<ApiKeyInfoRespList> call() {
                                        return endpoint.getAccountApiKeysApi()
                                                       .getAllApiKeys(finalOptions.getPageSize(),
                                                                      finalOptions.getAfter(),
                                                                      finalOptions.getOrder().toString(),
                                                                      ListOptionsEncoder.encodeInclude(finalOptions),
                                                                      ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.KEY_FILTER,
                                                                                                                 finalOptions),
                                                                      ListOptionsEncoder.encodeSingleEqualFilter(ApiKeyListOptions.OWNER_ID_FILTER,
                                                                                                                 finalOptions));
                                    }
                                });
    }

    /**
     * Gets an iterator over all API keys according to filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     ApiKeyListOptions options = new ApiKeyListOptions();
     *     String ownerId = "015f4ac587f500000000000100100249";
     *     options.setOwnerIdFilter(ownerId);
     *
     *     Paginator<ApiKey> apiKeys = accountManagementApi.listAllApiKeys(options);
     *     while (apiKeys.hasNext()) {
     *         ApiKey apiKey = apiKeys.next();
     *         System.out.println("API key: " + apiKey.getKey());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of API keys corresponding to filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<ApiKey> listAllApiKeys(@Nullable ApiKeyListOptions options) throws MbedCloudException {
        return new Paginator<>((options == null) ? new ApiKeyListOptions() : options, new PageRequester<ApiKey>() {

            @Override
            public ListResponse<ApiKey> requestNewPage(ListOptions opt) throws MbedCloudException {
                return listApiKeys((ApiKeyListOptions) opt);
            }
        });
    }

    /**
     * Get details of an API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String apiKeyId = "015f4ac587f500000000000100109294";
     *     ApiKey apiKey = accountManagementApi.getApiKey(apiKeyId);
     *     System.out.println("Api Key: " + apiKey.getKey());
     *     assert apiKeyId == apiKey.getId();
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param apiKeyId
     *            The API key ID (if not specified, returns current API key).
     * @return the API key.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ApiKey getApiKey(@NonNull String apiKeyId) throws MbedCloudException {
        checkNotNull(apiKeyId, TAG_API_KEY_ID);
        final String finalApiKeyId = apiKeyId;
        return CloudCaller.call(this, "getApiKey()", ApiKeyAdapter.getMapper(), new CloudCall<ApiKeyInfoResp>() {

            @Override
            public Call<ApiKeyInfoResp> call() {
                return finalApiKeyId == null || finalApiKeyId.isEmpty() ? endpoint.getAccountApiKeysApi().getMyApiKey()
                                                                        : endpoint.getAccountApiKeysApi()
                                                                                  .getApiKey(finalApiKeyId);
            }
        });
    }

    /**
     * Adds an API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     ApiKey apiKey = new ApiKey();
     *     apiKey.setName("QuickstartKey");
     *
     *     ApiKey newApiKey = accountManagementApi.addApiKey(apiKey);
     *     System.out.println("Api Key: " + newApiKey.getKey());
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param apiKey
     *            The API key to add.
     * @return added API Key.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @NonNull ApiKey addApiKey(@NonNull ApiKey apiKey) throws MbedCloudException {
        checkNotNull(apiKey, TAG_API_KEY);
        checkModelValidity(apiKey, TAG_API_KEY);
        final ApiKey finalApiKey = apiKey;
        return CloudCaller.call(this, "addApiKey()", ApiKeyAdapter.getMapper(), new CloudCall<ApiKeyInfoResp>() {

            @Override
            public Call<ApiKeyInfoResp> call() {
                return endpoint.getAccountApiKeysApi().createApiKey(ApiKeyAdapter.reverseMapAdd(finalApiKey));
            }
        });
    }

    /**
     * Updates an API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     ApiKey apiKey = new ApiKey();
     *     String apiKeyId = "015f4ac587f500000000000100100249";
     *     apiKey.setId(apiKeyId);
     *     apiKey.setName("NewKeyName");
     *
     *     ApiKey newApiKey = accountManagementApi.updateApiKey(apiKey);
     *     System.out.println("New Api Key name: " + newApiKey.getName());
     *     assert apiKeyId == newApiKey.getId();
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param apiKey
     *            The API key to update.
     * @return updated API key.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ApiKey updateApiKey(@NonNull ApiKey apiKey) throws MbedCloudException {
        checkNotNull(apiKey, TAG_API_KEY);
        checkNotNull(apiKey.getId(), TAG_API_KEY_UUID);
        checkModelValidity(apiKey, TAG_API_KEY);
        ApiKey updatedApiKey = null;
        if (apiKey.hasStatusBeenUpdated()) {
            updatedApiKey = apiKey;
        } else {
            updatedApiKey = apiKey.clone();
            updatedApiKey.setStatus(null);
        }
        final ApiKey finalApiKey = updatedApiKey;
        return CloudCaller.call(this, "updateApiKey()", ApiKeyAdapter.getMapper(), new CloudCall<ApiKeyInfoResp>() {

            @Override
            public Call<ApiKeyInfoResp> call() {
                return endpoint.getAccountApiKeysApi().updateApiKey(finalApiKey.getId(),
                                                                    ApiKeyAdapter.reverseMapUpdate(finalApiKey));
            }
        });
    }

    /**
     * Deletes an API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String apiKeyId = "015f4ac587f500000000000100109294";
     *     accountManagementApi.deleteApiKey(apiKeyId);
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param apiKeyId
     *            The API key ID.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteApiKey(@NonNull String apiKeyId) throws MbedCloudException {
        checkNotNull(apiKeyId, TAG_API_KEY_ID);
        final String finalApiKeyId = apiKeyId;
        CloudCaller.call(this, "deleteApiKey()", null, new CloudCall<Void>() {

            @Override
            public Call<Void> call() {
                return endpoint.getAccountApiKeysApi().deleteApiKey(finalApiKeyId);
            }
        });
    }

    /**
     * Deletes an API key.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     ApiKey apiKey = accountManagementApi.getApiKey("015f4ac587f500000000000100109294");
     *     if( apiKey != null){
     *          accountManagementApi.deleteApiKey(apiKey);
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param apiKey
     *            The API key.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteApiKey(@NonNull ApiKey apiKey) throws MbedCloudException {
        checkNotNull(apiKey, TAG_API_KEY);
        deleteApiKey(apiKey.getId());
    }

    /**
     * Lists users according to filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     UserListOptions options = new UserListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<User> users = accountManagementApi.listUsers(options);
     *     for (User user : users) {
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return list of users (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<User> listUsers(@Nullable UserListOptions options) throws MbedCloudException {
        final UserListOptions finalOptions = (options == null) ? new UserListOptions() : options;
        return CloudCaller.call(this, "listUsers()", UserAdapter.getListMapper(), new CloudCall<UserInfoRespList>() {

            @Override
            public Call<UserInfoRespList> call() {
                return endpoint.getAccountUsersApi()
                               .getAllUsers(finalOptions.getPageSize(), finalOptions.getAfter(),
                                            finalOptions.getOrder().toString(),
                                            ListOptionsEncoder.encodeInclude(finalOptions),
                                            ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.EMAIL_FILTER,
                                                                                       finalOptions),
                                            ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.STATUS_FILTER,
                                                                                       finalOptions),
                                            ListOptionsEncoder.encodeSingleInFilter(UserListOptions.STATUS_FILTER,
                                                                                    finalOptions),
                                            ListOptionsEncoder.encodeSingleNotInFilter(UserListOptions.STATUS_FILTER,
                                                                                       finalOptions),
                                            ListOptionsEncoder.encodeSingleNotInFilter(UserListOptions.LOGIN_PROFILE_FILTER,
                                                                                       finalOptions));
            }
        });
    }

    /**
     * Gets an iterator over all users according to filter options.
     * <p>
     * Example:
     *
     * <pre>
     *  {@code try {
     *     UserListOptions options = new UserListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<User> users = accountManagementApi.listAllUsers(options);
     *     while (users.hasNext()) {
     *         User user = users.next();
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of users corresponding to filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<User> listAllUsers(@Nullable UserListOptions options) throws MbedCloudException {
        return new Paginator<>((options == null) ? new UserListOptions() : options, new PageRequester<User>() {

            @Override
            public ListResponse<User> requestNewPage(ListOptions opt) throws MbedCloudException {
                return listUsers((UserListOptions) opt);
            }
        });
    }

    /**
     * Gets details about a user.
     * <p>
     * Note: Use {@link #getUser(String)} instead. The property parameter is no longer taken into account.
     *
     * @param userId
     *            The user ID.
     * @param property
     *            Request to return account specific user property values according to the given property name.
     * @return a user.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    @Deprecated
    public @Nullable User getUser(@NonNull String userId, @Nullable String property) throws MbedCloudException {
        return getUser(userId);
    }

    /**
     * Gets details about a user.
     *
     * @param userId
     *            The user ID.
     * @return a user.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable User getUser(@NonNull String userId) throws MbedCloudException {
        checkNotNull(userId, TAG_USER_ID);
        final String finalUserId = userId;
        return CloudCaller.call(this, "getUser()", UserAdapter.getMapper(), new CloudCall<UserInfoResp>() {

            @Override
            public Call<UserInfoResp> call() {
                return endpoint.getAccountUsersApi().getUser(finalUserId);
            }
        });
    }

    /**
     * Adds a user.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     User user = new User();
     *     user.setEmail("javaSDK@arm.com");
     *     user.setUsername("javaSDK");
     *     user.setFullName("Java SDK");
     *
     *     User newUser = accountManagementApi.addUser(user);
     *     System.out.println("User ID: " + newUser.getId());
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param user
     *            User to add.
     * @return added user.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @NonNull User addUser(@NonNull User user) throws MbedCloudException {
        checkNotNull(user, TAG_USER);
        checkModelValidity(user, TAG_USER);
        final User finalUser = user;
        return CloudCaller.call(this, "addUser()", UserAdapter.getMapper(), new CloudCall<UserInfoResp>() {

            @Override
            public Call<UserInfoResp> call() {
                return endpoint.getAccountUsersApi().createUser(UserAdapter.reverseMapAdd(finalUser), "create");
            }
        });
    }

    /**
     * Updates a user.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     User user = new User();
     *     String userId = "015f4ac587f500000000000100109294";
     *     user.setId(userId);
     *     user.setEmail("javaSDK@arm.com");
     *     user.setUsername("javaSDK");
     *     user.setFullName("New JavaSDK");
     *
     *     User newUser = accountManagementApi.updateUser(user);
     *     System.out.println("New User name: " + newUser.getFullName());
     *     assert userId == newUser.getId();
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param user
     *            User to update.
     * @return updated user.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable User updateUser(@NonNull User user) throws MbedCloudException {
        checkNotNull(user, TAG_USER);
        checkNotNull(user.getId(), TAG_USER_UUID);
        // checkModelValidity(user, TAG_USER);
        User updatedUser = null;
        if (user.hasEmailBeenUpdated()) {
            updatedUser = user;
        } else {
            updatedUser = user.clone();
            updatedUser.setEmail(null);
        }
        final User finalUser = updatedUser;
        return CloudCaller.call(this, "updateUser()", UserAdapter.getMapper(), new CloudCall<UserInfoResp>() {

            @Override
            public Call<UserInfoResp> call() {
                return endpoint.getAccountUsersApi().updateUser(finalUser.getId(),
                                                                UserAdapter.reverseMapUpdate(finalUser));
            }
        });
    }

    /**
     * Deletes a user.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String userId = "015f4ac587f500000000000100109294";
     *     accountManagementApi.deleteUser(userId);
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param userId
     *            The user ID of the user to delete.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteUser(@NonNull String userId) throws MbedCloudException {
        checkNotNull(userId, TAG_USER_ID);
        final String finalUserId = userId;
        CloudCaller.call(this, "deleteUser()", null, new CloudCall<Void>() {

            @Override
            public Call<Void> call() {
                return endpoint.getAccountUsersApi().deleteUser(finalUserId);
            }
        });
    }

    /**
     * Deletes a user.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     User user = accountManagementApi.getUser("015f4ac587f500000000000100109294");
     *     if(user != null){
     *      accountManagementApi.deleteUser(user);
     *      }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param user
     *            The user to delete.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public void deleteUser(@NonNull User user) throws MbedCloudException {
        checkNotNull(user, TAG_USER);
        deleteUser(user.getId());
    }

    /**
     * Lists available groups depending on filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     GroupListOptions options = new GroupListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<Group> groups = accountManagementApi.listGroups(options);
     *     for (Group group : groups) {
     *         System.out.println("Group ID: " + group.getId());
     *         System.out.println("Group name: " + group.getName());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return The list of groups corresponding to filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<Group> listGroups(@Nullable GroupListOptions options) throws MbedCloudException {
        final GroupListOptions finalOptions = (options == null) ? new GroupListOptions() : options;
        return CloudCaller.call(this, "listGroups()", GroupAdapter.getListMapper(), new CloudCall<GroupSummaryList>() {

            @Override
            public Call<GroupSummaryList> call() {
                return endpoint.getAccountPolicyGroupApi().getAllGroups(finalOptions.getPageSize(),
                                                                        finalOptions.getAfter(),
                                                                        finalOptions.getOrder().toString(),
                                                                        ListOptionsEncoder.encodeInclude(finalOptions),
                                                                        finalOptions.getNameFilter());
            }
        });
    }

    /**
     * Gets an iterator over all available groups depending on filter options.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     GroupListOptions options = new GroupListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<Group> groups = accountManagementApi.listAllGroups(options);
     *     while (groups.hasNext()) {
     *         Group group = groups.next();
     *         System.out.println("Group ID: " + group.getId());
     *         System.out.println("Group name: " + group.getName());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the groups corresponding to filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<Group> listAllGroups(@Nullable GroupListOptions options) throws MbedCloudException {
        return new Paginator<>((options == null) ? new GroupListOptions() : options, new PageRequester<Group>() {

            @Override
            public ListResponse<Group> requestNewPage(ListOptions opt) throws MbedCloudException {
                return listGroups((GroupListOptions) opt);
            }
        });
    }

    /**
     * Get details of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String groupId = "015f4ac587f500000000000100109294";
     *     Group group = accountManagementApi.getGroup(groupId);
     *     System.out.println("Group name: " + group.getName());
     *     assert groupId == group.getId();
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param groupId
     *            The group ID to look for.
     * @return corresponding group.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Group getGroup(@NonNull String groupId) throws MbedCloudException {
        checkNotNull(groupId, TAG_GROUP_ID);
        final String finalGroupId = groupId;
        return CloudCaller.call(this, "getGroup()", GroupAdapter.getMapper(), new CloudCall<GroupSummary>() {

            @Override
            public Call<GroupSummary> call() {
                return endpoint.getAccountPolicyGroupApi().getGroupSummary(finalGroupId);
            }
        });
    }

    /**
     * Lists users of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String groupId = "015f4ac587f500000000000100109294";
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<User> users = accountManagementApi.listGroupUsers(groupId, options);
     *     for (User user : users) {
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param groupId
     *            The group ID.
     * @param options
     *            filter options.
     * @return The list of users corresponding to groupId and filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<User> listGroupUsers(@NonNull String groupId,
                                                       @Nullable UserListOptions options) throws MbedCloudException {
        checkNotNull(groupId, TAG_GROUP_ID);
        final UserListOptions finalOptions = (options == null) ? new UserListOptions() : options;
        final String finalGroupId = groupId;
        return CloudCaller.call(this, "listGroupUsers()", UserAdapter.getListMapper(),
                                new CloudCall<UserInfoRespList>() {

                                    @Override
                                    public Call<UserInfoRespList> call() {
                                        return endpoint.getAccountPolicyGroupApi()
                                                       .getUsersOfGroup(finalGroupId, finalOptions.getPageSize(),
                                                                        finalOptions.getAfter(),
                                                                        finalOptions.getOrder().toString(),
                                                                        ListOptionsEncoder.encodeInclude(finalOptions),
                                                                        ListOptionsEncoder.encodeSingleEqualFilter(UserListOptions.STATUS_FILTER,
                                                                                                                   finalOptions),
                                                                        ListOptionsEncoder.encodeSingleInFilter(UserListOptions.STATUS_FILTER,
                                                                                                                finalOptions),
                                                                        ListOptionsEncoder.encodeSingleNotInFilter(UserListOptions.STATUS_FILTER,
                                                                                                                   finalOptions));
                                    }
                                });
    }

    /**
     * Lists users of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Group group = accountManagementApi.getGroup("015f4ac587f500000000000100109294");
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<User> users = accountManagementApi.listGroupUsers(group, options);
     *     for (User user : users) {
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param group
     *            The group to consider.
     * @param options
     *            filter options.
     * @return The list of users corresponding to the group and filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<User> listGroupUsers(@NonNull Group group,
                                                       @Nullable UserListOptions options) throws MbedCloudException {
        checkNotNull(group, TAG_GROUP);
        return listGroupUsers(group.getId(), options);
    }

    /**
     * Gets an iterator over all users of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String groupId = "015f4ac587f500000000000100109294";
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<User> users = accountManagementApi.listAllGroupUsers(groupId,options);
     *     while (users.hasNext()) {
     *         User user = users.next();
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param groupId
     *            The group ID of the group.
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of users corresponding to groupId and filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<User> listAllGroupUsers(@NonNull String groupId,
                                                       @Nullable UserListOptions options) throws MbedCloudException {
        final String finalGroupId = groupId;
        return new Paginator<>((options == null) ? new UserListOptions() : options, new PageRequester<User>() {

            @Override
            public ListResponse<User> requestNewPage(ListOptions opt) throws MbedCloudException {
                return listGroupUsers(finalGroupId, (UserListOptions) opt);
            }
        });
    }

    /**
     * Gets an iterator over all users of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Group group = accountManagementApi.getGroup("015f4ac587f500000000000100109294");
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<User> users = accountManagementApi.listAllGroupUsers(group, options);
     *     while (users.hasNext()) {
     *         User user = users.next();
     *         System.out.println("User ID: " + user.getId());
     *         System.out.println("User name: " + user.getFullName());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param group
     *            The group to consider.
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of users corresponding to the group and filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<User> listAllGroupUsers(@NonNull Group group,
                                                       @Nullable UserListOptions options) throws MbedCloudException {
        checkNotNull(group, TAG_GROUP);
        return listAllGroupUsers(group.getId(), options);
    }

    /**
     * Lists API keys of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String groupId = "015f4ac587f500000000000100109294";
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<ApiKey> apiKeys = accountManagementApi.listGroupApiKeys(groupId, options);
     *     for (ApiKey apiKey : apiKeys) {
     *         System.out.println("ApiKey: " + apiKey.getKey());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param groupId
     *            The group ID of the group.
     * @param options
     *            filter options.
     * @return The list of API keys corresponding to groupId and filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<ApiKey>
           listGroupApiKeys(@NonNull String groupId, @Nullable ApiKeyListOptions options) throws MbedCloudException {
        checkNotNull(groupId, TAG_GROUP_ID);
        final ListOptions finalOptions = (options == null) ? new ListOptions() : options;
        final String finalGroupId = groupId;
        return CloudCaller.call(this, "listGroupApiKeys()", ApiKeyAdapter.getListMapper(),
                                new CloudCall<ApiKeyInfoRespList>() {

                                    @Override
                                    public Call<ApiKeyInfoRespList> call() {
                                        return endpoint.getAccountPolicyGroupApi()
                                                       .getApiKeysOfGroup(finalGroupId, finalOptions.getPageSize(),
                                                                          finalOptions.getAfter(),
                                                                          finalOptions.getOrder().toString(),
                                                                          ListOptionsEncoder.encodeInclude(finalOptions));
                                    }
                                });
    }

    /**
     * Lists API keys of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Group group = accountManagementApi.getGroup("015f4ac587f500000000000100109294");
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     ListResponse<ApiKey> apiKeys = accountManagementApi.listGroupApiKeys(group, options);
     *     for (ApiKey apiKey : apiKeys) {
     *         System.out.println("ApiKey: " + apiKey.getKey());
     *     }
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param group
     *            The group to consider.
     * @param options
     *            filter options.
     * @return The list of API keys corresponding to the group and filter options (One page).
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable ListResponse<ApiKey>
           listGroupApiKeys(@NonNull Group group, @Nullable ApiKeyListOptions options) throws MbedCloudException {
        checkNotNull(group, TAG_GROUP);
        return listGroupApiKeys(group.getId(), options);
    }

    /**
     * Gets an iterator over all API keys of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     String groupId = "015f4ac587f500000000000100109294";
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<ApiKey> apiKeys = accountManagementApi.listAllGroupApiKeys(groupId,options);
     *     while (apiKeys.hasNext()) {
     *         ApiKey apiKey = apiKeys.next();
     *         System.out.println("ApiKey: " + apiKey.getKey());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param groupId
     *            The group ID of the group.
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of API keys corresponding to groupId and filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<ApiKey>
           listAllGroupApiKeys(@NonNull String groupId, @Nullable ApiKeyListOptions options) throws MbedCloudException {
        final String finalGroupId = groupId;
        return new Paginator<>((options == null) ? new ApiKeyListOptions() : options, new PageRequester<ApiKey>() {

            @Override
            public ListResponse<ApiKey> requestNewPage(ListOptions opt) throws MbedCloudException {
                return listGroupApiKeys(finalGroupId, (ApiKeyListOptions) opt);
            }
        });
    }

    /**
     * Gets an iterator over all API keys of a group.
     * <p>
     * Example:
     *
     * <pre>
     * {@code
     * try {
     *     Group group = accountManagementApi.getGroup("015f4ac587f500000000000100109294");
     *     ListOptions options = new ListOptions();
     *     options.setLimit(10);
     *
     *     Paginator<ApiKey> apiKeys = accountManagementApi.listAllGroupApiKeys(group,options);
     *     for (ApiKey apiKey:apiKeys) {
     *         System.out.println("ApiKey: " + apiKey.getKey());
     *     }
     *
     * } catch (MbedCloudException e) {
     *     e.printStackTrace();
     * }
     * }
     * </pre>
     *
     * @param group
     *            The group to consider.
     * @param options
     *            filter options.
     * @return paginator @see {@link Paginator} for the list of API keys corresponding to the group and filter options.
     * @throws MbedCloudException
     *             if a problem occurred during request processing.
     */
    @API
    public @Nullable Paginator<ApiKey>
           listAllGroupApiKeys(@NonNull Group group, @Nullable ApiKeyListOptions options) throws MbedCloudException {
        checkNotNull(group, TAG_GROUP);
        return listAllGroupApiKeys(group.getId(), options);
    }

    /**
     * Retrieves module name.
     *
     * @return module name.
     */
    @Override
    public String getModuleName() {
        return "Account Management";
    }

}
