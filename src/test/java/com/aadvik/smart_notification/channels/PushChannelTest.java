package com.aadvik.smart_notification.channels;

import org.junit.jupiter.api.Test;
import com.aadvik.smart_notification.model.Notification;


public class PushChannelTest {
	@Test
    public void testSendNotification() {
        PushChannel channel = new PushChannel();
        Notification notification = new Notification("Welcome to our app!", "username_or_deviceID");
        channel.sendNotification(notification); // Should print push notification sent in console
        // No error = test passes!
    }
}


