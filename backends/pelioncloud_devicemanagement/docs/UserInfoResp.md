
# UserInfoResp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | The ID of the account. | 
**activeSessions** | [**List&lt;ActiveSession&gt;**](ActiveSession.md) | List of active user sessions. |  [optional]
**address** | **String** | Address. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation UTC time RFC3339. |  [optional]
**creationTime** | **Long** | A timestamp of the user creation in the storage, in milliseconds. |  [optional]
**customFields** | **Map&lt;String, String&gt;** | User&#39;s account-specific custom properties. The value is a string. |  [optional]
**email** | **String** | The email address. | 
**emailVerified** | **Boolean** | A flag indicating whether the user&#39;s email address has been verified or not. |  [optional]
**etag** | **String** | API resource entity version. | 
**fullName** | **String** | The full name of the user. |  [optional]
**groups** | **List&lt;String&gt;** | A list of IDs of the groups this user belongs to. |  [optional]
**id** | **String** | The ID of the user. | 
**isGtcAccepted** | **Boolean** | A flag indicating that the user has accepted General Terms and Conditions. |  [optional]
**isMarketingAccepted** | **Boolean** | A flag indicating that the user has consented to receive marketing information. |  [optional]
**isTotpEnabled** | **Boolean** | A flag indicating whether two-factor authentication (TOTP) has been enabled. |  [optional]
**lastLoginTime** | **Long** | A timestamp of the latest login of the user, in milliseconds. |  [optional]
**loginHistory** | [**List&lt;LoginHistory&gt;**](LoginHistory.md) | Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format. |  [optional]
**loginProfiles** | [**List&lt;LoginProfile&gt;**](LoginProfile.md) | A list of login profiles for the user. Specified as the identity providers the user is associated with. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Entity name: always &#x60;user&#x60;. | 
**password** | **String** | The password when creating a new user. It will be generated when not present in the request. |  [optional]
**passwordChangedTime** | **Long** | A timestamp of the latest change of the user password, in milliseconds. |  [optional]
**phoneNumber** | **String** | Phone number. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system. | 
**totpScratchCodes** | **List&lt;String&gt;** | A list of scratch codes for the two-factor authentication. Visible only when 2FA is requested to be enabled or the codes regenerated. |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | Last update UTC time RFC3339. |  [optional]
**username** | **String** | A username. |  [optional]


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
USER | &quot;user&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENROLLING | &quot;ENROLLING&quot;
INVITED | &quot;INVITED&quot;
ACTIVE | &quot;ACTIVE&quot;
RESET | &quot;RESET&quot;
INACTIVE | &quot;INACTIVE&quot;



