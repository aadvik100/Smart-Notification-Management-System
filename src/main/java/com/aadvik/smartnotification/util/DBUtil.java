package com.aadvik.smartnotification.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws SQLException {
        String url = "`http://localhost:8080/smart-notification/index.html`";
        String user = "root";
        String password = "XXXXXXXXX";

        return DriverManager.getConnection(url, user, password);
    }
}