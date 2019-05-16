
# BulkResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | ID | 
**completedAt** | [**DateTime**](DateTime.md) | The time the bulk creation task was completed. Null when creating bulk upload or delete. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | The time of receiving the bulk creation task. | 
**errorsCount** | **Integer** | The number of enrollment identities with failed processing. | 
**errorsReportFile** | **String** | Link to error report file. Null when creating bulk upload or delete. | 
**etag** | **String** | etag | 
**fullReportFile** | **String** | Link to full report file. Null when creating bulk upload or delete. | 
**id** | **String** | Bulk ID | 
**object** | [**ObjectEnum**](#ObjectEnum) |  | 
**processedCount** | **Integer** | The number of enrollment identities processed until now. | 
**status** | [**StatusEnum**](#StatusEnum) | The state of the process is &#39;new&#39; at the time of creation. If creation is still in progress, the state shows as &#39;processing&#39;. When the request is fully processed, the state changes to &#39;completed&#39;. | 
**totalCount** | **Integer** | Total number of enrollment identities found in the input CSV. | 


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
UPLOADS | &quot;enrollment-identity-bulk-uploads&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;new&quot;
PROCESSING | &quot;processing&quot;
COMPLETED | &quot;completed&quot;



