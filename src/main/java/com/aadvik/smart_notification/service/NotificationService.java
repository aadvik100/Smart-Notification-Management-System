package com.aadvik.smart_notification.service;

import com.aadvik.smart_notification.model.Notification;
import com.aadvik.smart_notification.channels.NotificationChannel;
import com.aadvik.smart_notification.factory.ChannelFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class NotificationService {
	public void send(String type, String message, String receiver) {
		
		// Inside the send() method, right after you send the notification:
		try (Connection conn = DatabaseUtil.getConnection()) { // uses your utility class
		    String sql = "INSERT INTO notifications (type, message, receiver) VALUES (?, ?, ?)";
		    PreparedStatement stmt = conn.prepareStatement(sql);
		    stmt.setString(1, type);
		    stmt.setString(2, message);
		    stmt.setString(3, receiver);
		    stmt.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace(); // Print any error you get in the console
		}
		
		
        Notification notification = new Notification(message, receiver);
        NotificationChannel channel = ChannelFactory.getChannel(type);
        channel.sendNotification(notification);
    }
}


