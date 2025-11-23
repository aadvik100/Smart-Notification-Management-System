package com.aadvik.smart_notification.channels;

import com.aadvik.smart_notification.model.Notification;


public class PushChannel implements NotificationChannel {
	@Override
    public void sendNotification(Notification notification) {
        // Simulate sending push notification
        System.out.println("Sending PUSH notification to " + notification.getReceiver() + ": " + notification.getMessage());
    }
}




