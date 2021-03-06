/*
 * notifier
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.1
 * Contact: 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddEmailChannelBody;
import org.openapitools.client.model.AddTelegramChannelBody;
import org.openapitools.client.model.SendNotificationBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrateApi
 */
@Disabled
public class CrateApiTest {

    private final CrateApi api = new CrateApi();

    /**
     * Add email channel
     *
     * Add email channel  Add email notification channel for user 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleAddEmailChannelTest() throws ApiException {
        AddEmailChannelBody addEmailChannelBody = null;
        api.handleAddEmailChannel(addEmailChannelBody);
        // TODO: test validations
    }

    /**
     * Add telegram channel
     *
     * Add telegram channel  Add telegram notification channel for user 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleAddTelegramChannelTest() throws ApiException {
        AddTelegramChannelBody addTelegramChannelBody = null;
        api.handleAddTelegramChannel(addTelegramChannelBody);
        // TODO: test validations
    }

    /**
     * Send notification
     *
     * Send notification  send notification to user with given id on all channels registered for that user 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleSendNotificationTest() throws ApiException {
        SendNotificationBody sendNotificationBody = null;
        api.handleSendNotification(sendNotificationBody);
        // TODO: test validations
    }

}
