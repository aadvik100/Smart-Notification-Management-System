package com.aadvik.smart_notification.factory;

import com.aadvik.smart_notification.channels.*;


public class ChannelFactory {
	public static NotificationChannel getChannel(String type) {
        switch(type.toLowerCase()) {
            case "email":
                return new EmailChannel();
            case "sms":
                return new SMSChannel();
            case "push":
                return new PushChannel();
            default:
                throw new IllegalArgumentException("Unknown channel type: " + type);
        }
    }
}




