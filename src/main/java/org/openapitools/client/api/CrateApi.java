/*
 * notifier
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.AddChannelBody;
import org.openapitools.client.model.GetTelegramChatIdBody;
import org.openapitools.client.model.NotifyBody;
import org.openapitools.client.model.RemoveChannelBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CrateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CrateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CrateApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for handleAddChannel
     * @param addChannelBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleAddChannelCall(AddChannelBody addChannelBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addChannelBody;

        // create path and map variables
        String localVarPath = "/add_channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleAddChannelValidateBeforeCall(AddChannelBody addChannelBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addChannelBody' is set
        if (addChannelBody == null) {
            throw new ApiException("Missing the required parameter 'addChannelBody' when calling handleAddChannel(Async)");
        }
        

        okhttp3.Call localVarCall = handleAddChannelCall(addChannelBody, _callback);
        return localVarCall;

    }

    /**
     * Add channel
     * Add channel  Add notification channel for user 
     * @param addChannelBody  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public void handleAddChannel(AddChannelBody addChannelBody) throws ApiException {
        handleAddChannelWithHttpInfo(addChannelBody);
    }

    /**
     * Add channel
     * Add channel  Add notification channel for user 
     * @param addChannelBody  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> handleAddChannelWithHttpInfo(AddChannelBody addChannelBody) throws ApiException {
        okhttp3.Call localVarCall = handleAddChannelValidateBeforeCall(addChannelBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Add channel (asynchronously)
     * Add channel  Add notification channel for user 
     * @param addChannelBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleAddChannelAsync(AddChannelBody addChannelBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleAddChannelValidateBeforeCall(addChannelBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for handleGetTelegramChatId
     * @param getTelegramChatIdBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleGetTelegramChatIdCall(GetTelegramChatIdBody getTelegramChatIdBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = getTelegramChatIdBody;

        // create path and map variables
        String localVarPath = "/get_telegram_chat_id";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleGetTelegramChatIdValidateBeforeCall(GetTelegramChatIdBody getTelegramChatIdBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'getTelegramChatIdBody' is set
        if (getTelegramChatIdBody == null) {
            throw new ApiException("Missing the required parameter 'getTelegramChatIdBody' when calling handleGetTelegramChatId(Async)");
        }
        

        okhttp3.Call localVarCall = handleGetTelegramChatIdCall(getTelegramChatIdBody, _callback);
        return localVarCall;

    }

    /**
     * Get the chat ID of a telegram username
     * Get the chat ID of a telegram username  First call this endpoint, then ask the user to send a message to the bot, then the chat id will be returned 
     * @param getTelegramChatIdBody  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public void handleGetTelegramChatId(GetTelegramChatIdBody getTelegramChatIdBody) throws ApiException {
        handleGetTelegramChatIdWithHttpInfo(getTelegramChatIdBody);
    }

    /**
     * Get the chat ID of a telegram username
     * Get the chat ID of a telegram username  First call this endpoint, then ask the user to send a message to the bot, then the chat id will be returned 
     * @param getTelegramChatIdBody  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> handleGetTelegramChatIdWithHttpInfo(GetTelegramChatIdBody getTelegramChatIdBody) throws ApiException {
        okhttp3.Call localVarCall = handleGetTelegramChatIdValidateBeforeCall(getTelegramChatIdBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Get the chat ID of a telegram username (asynchronously)
     * Get the chat ID of a telegram username  First call this endpoint, then ask the user to send a message to the bot, then the chat id will be returned 
     * @param getTelegramChatIdBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel added successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleGetTelegramChatIdAsync(GetTelegramChatIdBody getTelegramChatIdBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleGetTelegramChatIdValidateBeforeCall(getTelegramChatIdBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for handleNotify
     * @param notifyBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Notification sent successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleNotifyCall(NotifyBody notifyBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = notifyBody;

        // create path and map variables
        String localVarPath = "/notify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleNotifyValidateBeforeCall(NotifyBody notifyBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'notifyBody' is set
        if (notifyBody == null) {
            throw new ApiException("Missing the required parameter 'notifyBody' when calling handleNotify(Async)");
        }
        

        okhttp3.Call localVarCall = handleNotifyCall(notifyBody, _callback);
        return localVarCall;

    }

    /**
     * Send notification
     * Send notification  send notification to user with given id on all channels registered for that user 
     * @param notifyBody  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Notification sent successfully </td><td>  -  </td></tr>
     </table>
     */
    public void handleNotify(NotifyBody notifyBody) throws ApiException {
        handleNotifyWithHttpInfo(notifyBody);
    }

    /**
     * Send notification
     * Send notification  send notification to user with given id on all channels registered for that user 
     * @param notifyBody  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Notification sent successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> handleNotifyWithHttpInfo(NotifyBody notifyBody) throws ApiException {
        okhttp3.Call localVarCall = handleNotifyValidateBeforeCall(notifyBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Send notification (asynchronously)
     * Send notification  send notification to user with given id on all channels registered for that user 
     * @param notifyBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Notification sent successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleNotifyAsync(NotifyBody notifyBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleNotifyValidateBeforeCall(notifyBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for handleRemoveChannel
     * @param removeChannelBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleRemoveChannelCall(RemoveChannelBody removeChannelBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = removeChannelBody;

        // create path and map variables
        String localVarPath = "/remove_channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call handleRemoveChannelValidateBeforeCall(RemoveChannelBody removeChannelBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'removeChannelBody' is set
        if (removeChannelBody == null) {
            throw new ApiException("Missing the required parameter 'removeChannelBody' when calling handleRemoveChannel(Async)");
        }
        

        okhttp3.Call localVarCall = handleRemoveChannelCall(removeChannelBody, _callback);
        return localVarCall;

    }

    /**
     * Remove channel
     * Remove channel  Remove notification channel for user 
     * @param removeChannelBody  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public void handleRemoveChannel(RemoveChannelBody removeChannelBody) throws ApiException {
        handleRemoveChannelWithHttpInfo(removeChannelBody);
    }

    /**
     * Remove channel
     * Remove channel  Remove notification channel for user 
     * @param removeChannelBody  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> handleRemoveChannelWithHttpInfo(RemoveChannelBody removeChannelBody) throws ApiException {
        okhttp3.Call localVarCall = handleRemoveChannelValidateBeforeCall(removeChannelBody, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove channel (asynchronously)
     * Remove channel  Remove notification channel for user 
     * @param removeChannelBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Channel removed successfully </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call handleRemoveChannelAsync(RemoveChannelBody removeChannelBody, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = handleRemoveChannelValidateBeforeCall(removeChannelBody, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
