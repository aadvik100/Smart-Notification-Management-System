package com.aadvik.smart_notification.model;

public class Notification {
	private String message;
    private String receiver;

    public Notification(String message, String receiver) {
        this.message = message;
        this.receiver = receiver;
    }

    // Getters and Setters
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getReceiver() { return receiver; }
    public void setReceiver(String receiver) { this.receiver = receiver; }
}


