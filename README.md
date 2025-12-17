# Smart Notification Management System

A Java console application for sending notifications via Email, SMS, and Push channels, with database logging and automated testing.

## Features
- Send notifications through Email, SMS, and Push channels.
- Console menu interface for user interaction.
- Records every notification in a MySQL database.
- Includes automated JUnit tests for each channel.

## How To Run
1. **Install Java 17 (or compatible version)**
2. **Install MySQL Server**
3. **Create the database and table**
   - Open MySQL and run:
     ```
     CREATE DATABASE notifications_db;
     USE notifications_db;
     CREATE TABLE notifications (
       id INT AUTO_INCREMENT PRIMARY KEY,
       type VARCHAR(16),
       message TEXT,
       receiver VARCHAR(100),
       timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
     );
     ```
4. **Update MySQL username/password in `DatabaseUtil.java`**
5. **Build the project using Maven to download dependencies**
6. **Run `Main.java` from `com.aadvik.smart_notification.main`**
7. **Use the console menu to select notification type, enter message, receiver, and send**

## Project Structure
- **channels/** — Channel interfaces and implementation (`EmailChannel`, `SMSChannel`, `PushChannel`)
- **model/** — Notification data class
- **service/** — Core logic and JDBC utility
- **factory/** — Factory class for channels
- **main/** — Entry point (Main.java)
- **test/** — JUnit tests for each channel and service

## Dependencies
- [JUnit Jupiter](https://junit.org/junit5/) for unit testing
- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) for database access

## Example Usage
When you run Main.java, you'll see a menu like:

1. Send Email
2. Send SMS
3. Send Push
4. Exit

Choose option: 2
Enter Message: Your OTP is 432198
Enter Receiver: 9876543210
Notification sent via sms

## Output 

| id | message        | type  |receiver |   timestamp        |
|----|----------------|-------|----------|--------------------|
| 1  | abc@gmail.com  | email | 123      | 2025-11-23 00:16:22|
| 2  | OTP sent       | sms   | 000      | 2025-11-23 00:16:24|
| 3  | push received  | push  | 232      | 2025-11-23 00:16:26|


## Project Testing & Features Summary

| Description           | Details                                                                                                 |
|-----------------------|---------------------------------------------------------------------------------------------------------|
|Database Setup         | Created database `notification_db` with table `notification_logs` to store sent notifications.             |
|DB Connection Test     | Verified database connection using `DBConnection` class with JDBC URL, username, password.               |
|Notification Test      | Tested sending Email, SMS, Push notifications via `Main` class to confirm output + DB insertion.        |
|Polymorphism           | Implemented `NotificationSender` interface with `EmailNotification`, `SMSNotification`, `PushNotification`.   |
|Collections & Generics | Added `NotificationManager<T>` using `ArrayList<T>` to manage and send notifications to multiple channels. |
|Multithreading         | Implemented `NotificationTask` (Runnable) to send notifications in parallel threads.                      |
|Exception Handling     | Added try/catch blocks and safe database closing using try-with-resources in JDBC operations.            |
|Logging (SLF4J)        | Replaced println statements with SLF4J logging for cleaner and professional output.                      |
|Console Menu           | Added simple console menu for user input (Email / SMS / Push / Exit) to interact with the system.        |


