
# UserInvitationResp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | The ID of the account the user is invited to. | 
**createdAt** | [**DateTime**](DateTime.md) | Creation UTC time RFC3339. |  [optional]
**email** | **String** | Email address of the invited user. | 
**etag** | **String** | API resource entity version. | 
**expiration** | [**DateTime**](DateTime.md) | Invitation expiration as UTC time RFC3339. |  [optional]
**groups** | **List&lt;String&gt;** | A list of IDs of the groups the user is invited to. |  [optional]
**id** | **String** | The ID of the invitation. | 
**loginProfiles** | [**List&lt;LoginProfile&gt;**](LoginProfile.md) | A list of login profiles for the user. Specified as the identity providers the user is associated with. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Entity name: always &#39;user-invitation&#39; | 
**updatedAt** | [**DateTime**](DateTime.md) | Last update UTC time RFC3339. |  [optional]
**userId** | **String** | The ID of the invited user. | 


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
INVITATION | &quot;user-invitation&quot;



