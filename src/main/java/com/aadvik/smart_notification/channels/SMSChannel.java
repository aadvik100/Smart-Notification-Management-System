package com.aadvik.smart_notification.channels;

import com.aadvik.smart_notification.model.Notification;


public class SMSChannel implements NotificationChannel {
	@Override
    public void sendNotification(Notification notification) {
        // Simulate sending SMS
        System.out.println("Sending SMS to " + notification.getReceiver() + ": " + notification.getMessage());
    }
}






