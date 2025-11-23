package com.aadvik.smart_notification.channels;

import org.junit.jupiter.api.Test;
import com.aadvik.smart_notification.model.Notification;


public class EmailChannelTest {
	 @Test
	    public void testSendNotification() {
	        EmailChannel channel = new EmailChannel();
	        Notification notification = new Notification("Hello!", "test@example.com");
	        channel.sendNotification(notification); // This method should print a message in the console
	        // For now, if no error/exception is thrown, test passes!
	    }
}



