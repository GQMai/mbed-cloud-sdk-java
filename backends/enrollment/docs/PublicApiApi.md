# PublicApiApi

All URIs are relative to *http://api.us-east-1.mbedcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceEnrollment**](PublicApiApi.md#createDeviceEnrollment) | **POST** v3/device-enrollments | Place an enrollment claim for one or several devices.
[**deleteDeviceEnrollment**](PublicApiApi.md#deleteDeviceEnrollment) | **DELETE** v3/device-enrollments/{id} | Delete an enrollment by ID.
[**getDeviceEnrollment**](PublicApiApi.md#getDeviceEnrollment) | **GET** v3/device-enrollments/{id} | Get details of an enrollment by ID.
[**getDeviceEnrollments**](PublicApiApi.md#getDeviceEnrollments) | **GET** v3/device-enrollments | Get enrollment list.


<a name="createDeviceEnrollment"></a>
# **createDeviceEnrollment**
> EnrollmentIdentity createDeviceEnrollment(enrollmentIdentity)

Place an enrollment claim for one or several devices.

When the device connects to the bootstrap server and provides the enrollment ID, it will be assigned to your account. 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
EnrollmentId enrollmentIdentity = new EnrollmentId(); // EnrollmentId | 
try {
    EnrollmentIdentity result = apiInstance.createDeviceEnrollment(enrollmentIdentity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#createDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrollmentIdentity** | [**EnrollmentId**](EnrollmentId.md)|  |

### Return type

[**EnrollmentIdentity**](EnrollmentIdentity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceEnrollment"></a>
# **deleteDeviceEnrollment**
> Void deleteDeviceEnrollment(id)

Delete an enrollment by ID.

To free a device from your account you can delete the enrollment claim. To bypass the device ownership, you need to delete the enrollment and do a factory reset for the device. For more information on the ownership trasfer, see [https://github.com/ARMmbed/mbed_Cloud_Docs/blob/restructure/Docs/provisioning/generic_instructions/device-ownership.md#transferring-ownership-using-first-to-claim](TODO put the right link).

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
String id = "id_example"; // String | Enrollment identity internal id
try {
    Void result = apiInstance.deleteDeviceEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#deleteDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Enrollment identity internal id |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceEnrollment"></a>
# **getDeviceEnrollment**
> EnrollmentIdentity getDeviceEnrollment(id)

Get details of an enrollment by ID.

To check the enrollment info in detail, for example claming date and expiration date.

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
String id = "id_example"; // String | Enrollment identity internal id
try {
    EnrollmentIdentity result = apiInstance.getDeviceEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#getDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Enrollment identity internal id |

### Return type

[**EnrollmentIdentity**](EnrollmentIdentity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeviceEnrollments"></a>
# **getDeviceEnrollments**
> EnrollmentIdentities getDeviceEnrollments(limit, after, order, include)

Get enrollment list.

Provides a list of pending and claimed enrollments. Example usage: 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
Integer limit = 56; // Integer | Number of results to be returned. Between 2 and 1000, inclusive.
String after = "after_example"; // String | Entity ID to fetch after.
String order = "ASC"; // String | ASC or DESC
String include = "include_example"; // String | Comma separate additional data to return. Currently supported: total_count
try {
    EnrollmentIdentities result = apiInstance.getDeviceEnrollments(limit, after, order, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#getDeviceEnrollments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to be returned. Between 2 and 1000, inclusive. | [optional]
 **after** | **String**| Entity ID to fetch after. | [optional]
 **order** | **String**| ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **include** | **String**| Comma separate additional data to return. Currently supported: total_count | [optional]

### Return type

[**EnrollmentIdentities**](EnrollmentIdentities.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
