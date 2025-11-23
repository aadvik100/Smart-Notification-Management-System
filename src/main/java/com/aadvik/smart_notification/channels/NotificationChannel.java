package com.aadvik.smart_notification.channels;

import com.aadvik.smart_notification.model.Notification;

public interface NotificationChannel {
	void sendNotification(Notification notification);
}
