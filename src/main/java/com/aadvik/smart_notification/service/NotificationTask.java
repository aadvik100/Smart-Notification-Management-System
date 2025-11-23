// Step 4.3: Add Multithreading

// This class allows sending notifications in parallel using Java threads.
// Each NotificationTask will handle sending one notification (email, SMS, or push)
// independently, so all can happen at the same time for better performance and efficiency.




package com.aadvik.smart_notification.service;

public class NotificationTask implements Runnable {
    private NotificationSender sender;
    private String message;

    public NotificationTask(NotificationSender sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    @Override
    public void run() {
        sender.send(message);
    }{

}



