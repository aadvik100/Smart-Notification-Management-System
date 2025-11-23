// Example usage:
// NotificationManager<NotificationSender> manager = new NotificationManager<>();
// manager.addChannel(new EmailChannel());
// manager.sendAll("Demo message");


package com.aadvik.smart_notification.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NotificationManager<T extends NotificationSender> {
    private List<T> channels = new ArrayList<>();

    public void addChannel(T channel) {
        channels.add(channel);
    }

    public void sendAll(String message) {
        for (T c : channels) {
            c.send(message);
        }
    } 

}



