package com.aadvik.smartnotification.servlet;

import java.io.IOException;

import com.aadvik.smartnotification.dao.NotificationDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//Handles POST from index.html form to send a notification
@WebServlet("/sendNotification")
public class SendNotificationServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		// Read form fields
        String type = request.getParameter("type");
        String message = request.getParameter("message");
     
        // Save to database
        NotificationDAO dao = new NotificationDAO();
        dao.saveNotification(type, message);
     
        // Show success with timestamp
        response.setContentType("text/html");
        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        response.getWriter().println("<h2>Notification Sent Successfully</h2>" +
                "<p>Sent at: " + now + "</p>");
    }
}