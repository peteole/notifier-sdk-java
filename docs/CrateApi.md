# CrateApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**handleAddChannel**](CrateApi.md#handleAddChannel) | **POST** /add_channel | Add channel |
| [**handleGetChannels**](CrateApi.md#handleGetChannels) | **GET** /notify/get_channels/{user_id} | Get notification channels for user |
| [**handleGetTelegramChatId**](CrateApi.md#handleGetTelegramChatId) | **POST** /get_telegram_chat_id | Get the chat ID of a telegram username |
| [**handleNotify**](CrateApi.md#handleNotify) | **POST** /notify | Send notification |
| [**handleRemoveChannel**](CrateApi.md#handleRemoveChannel) | **POST** /remove_channel | Remove channel |


<a name="handleAddChannel"></a>
# **handleAddChannel**
> handleAddChannel(addChannelBody)

Add channel

Add channel  Add notification channel for user 

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
    AddChannelBody addChannelBody = new AddChannelBody(); // AddChannelBody | 
    try {
      apiInstance.handleAddChannel(addChannelBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleAddChannel");
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
| **addChannelBody** | [**AddChannelBody**](AddChannelBody.md)|  | |

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

<a name="handleGetChannels"></a>
# **handleGetChannels**
> ChannelsResponse handleGetChannels(userId)

Get notification channels for user

Get notification channels for user  get all channels registered for user with given id 

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
    String userId = "userId_example"; // String | User id to get notification channels for
    try {
      ChannelsResponse result = apiInstance.handleGetChannels(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleGetChannels");
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
| **userId** | **String**| User id to get notification channels for | |

### Return type

[**ChannelsResponse**](ChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Notification channels retrieved successfully |  -  |

<a name="handleGetTelegramChatId"></a>
# **handleGetTelegramChatId**
> handleGetTelegramChatId(getTelegramChatIdBody)

Get the chat ID of a telegram username

Get the chat ID of a telegram username  First call this endpoint, then ask the user to send a message to the bot, then the chat id will be returned 

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
    GetTelegramChatIdBody getTelegramChatIdBody = new GetTelegramChatIdBody(); // GetTelegramChatIdBody | 
    try {
      apiInstance.handleGetTelegramChatId(getTelegramChatIdBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleGetTelegramChatId");
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
| **getTelegramChatIdBody** | [**GetTelegramChatIdBody**](GetTelegramChatIdBody.md)|  | |

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

<a name="handleNotify"></a>
# **handleNotify**
> handleNotify(notifyBody)

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
    NotifyBody notifyBody = new NotifyBody(); // NotifyBody | 
    try {
      apiInstance.handleNotify(notifyBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleNotify");
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
| **notifyBody** | [**NotifyBody**](NotifyBody.md)|  | |

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

<a name="handleRemoveChannel"></a>
# **handleRemoveChannel**
> handleRemoveChannel(removeChannelBody)

Remove channel

Remove channel  Remove notification channel for user 

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
    RemoveChannelBody removeChannelBody = new RemoveChannelBody(); // RemoveChannelBody | 
    try {
      apiInstance.handleRemoveChannel(removeChannelBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrateApi#handleRemoveChannel");
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
| **removeChannelBody** | [**RemoveChannelBody**](RemoveChannelBody.md)|  | |

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
| **200** | Channel removed successfully |  -  |

