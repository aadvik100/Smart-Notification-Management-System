package com.aadvik.smart_notification.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() throws Exception {
        // Update your username and password, if different.
        String url = "jdbc:mysql://localhost:3306/notifications_db"; // Change DB name if you used another name!
        String user = "root"; 
        String pass = "XXXXXXXXXXXX"; // Replace with your actual password
        return DriverManager.getConnection(url, user, pass);
    }
}




