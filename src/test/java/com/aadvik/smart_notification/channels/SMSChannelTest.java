package com.aadvik.smart_notification.channels;

import org.junit.jupiter.api.Test;
import com.aadvik.smart_notification.model.Notification;


public class SMSChannelTest {
	@Test
    public void testSendNotification() {
        SMSChannel channel = new SMSChannel();
        Notification notification = new Notification("Your OTP is 123456", "9876543210");
        channel.sendNotification(notification); // Should print SMS sent in console
        // No error = test passes!
    }
}



