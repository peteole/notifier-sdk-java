# CrateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleAddEmailChannel**](CrateApi.md#handleAddEmailChannel) | **POST** /add_channel/email | Add email channel |
| [**handleAddTelegramChannel**](CrateApi.md#handleAddTelegramChannel) | **POST** /add_channel/telegram | Add telegram channel |
| [**handleSendNotification**](CrateApi.md#handleSendNotification) | **POST** /notify | Send notification |


<a name="handleAddEmailChannel"></a>
# **handleAddEmailChannel**
> handleAddEmailChannel(addEmailChannelBody)

Add email channel

Add email channel  Add email notification channel for user 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CrateApi apiInstance = new CrateApi(defaultClient);
    AddEmailChannelBody addEmailChannelBody = new AddEmailChannelBody(); // AddEmailChannelBody | 
    try {
      apiInstance.handleAddEmailChannel(addEmailChannelBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleAddEmailChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addEmailChannelBody** | [**AddEmailChannelBody**](AddEmailChannelBody.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel added successfully |  -  |

<a name="handleAddTelegramChannel"></a>
# **handleAddTelegramChannel**
> handleAddTelegramChannel(addTelegramChannelBody)

Add telegram channel

Add telegram channel  Add telegram notification channel for user 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CrateApi apiInstance = new CrateApi(defaultClient);
    AddTelegramChannelBody addTelegramChannelBody = new AddTelegramChannelBody(); // AddTelegramChannelBody | 
    try {
      apiInstance.handleAddTelegramChannel(addTelegramChannelBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleAddTelegramChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addTelegramChannelBody** | [**AddTelegramChannelBody**](AddTelegramChannelBody.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel added successfully |  -  |

<a name="handleSendNotification"></a>
# **handleSendNotification**
> handleSendNotification(sendNotificationBody)

Send notification

Send notification  send notification to user with given id on all channels registered for that user 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CrateApi apiInstance = new CrateApi(defaultClient);
    SendNotificationBody sendNotificationBody = new SendNotificationBody(); // SendNotificationBody | 
    try {
      apiInstance.handleSendNotification(sendNotificationBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleSendNotification");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sendNotificationBody** | [**SendNotificationBody**](SendNotificationBody.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Notification sent successfully |  -  |

