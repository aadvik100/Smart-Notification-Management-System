package com.aadvik.smart_notification.channels;

import com.aadvik.smart_notification.model.Notification;


public class EmailChannel implements NotificationChannel {
	@Override
    public void sendNotification(Notification notification) {
        // Simulate sending email
        System.out.println("Sending EMAIL to " + notification.getReceiver() + ": " + notification.getMessage());
    }
}




