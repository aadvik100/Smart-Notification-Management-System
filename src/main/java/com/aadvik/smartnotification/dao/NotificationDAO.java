package com.aadvik.smartnotification.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.aadvik.smartnotification.util.DBUtil;

//Data Access Object for notifications table
public class NotificationDAO {
	 
	// Inserts a new notification record
	public void saveNotification(String type, String message) {
        try (Connection con = DBUtil.getConnection()) {
        	String sql = "INSERT INTO notifications(type, message, sent_at) " +
                    "VALUES (?, ?, NOW())";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, type);
            ps.setString(2, message);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}