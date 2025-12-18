# Smart Notification Management System

A Java console application for sending notifications via Email, SMS, and Push channels, with database logging and automated testing.

## Features
- Send notifications through Email, SMS, and Push channels.
- Console menu interface for user interaction.
- Records every notification in a MySQL database.
- Includes automated JUnit tests for each channel.

## How to Run the Project
1. Clone the repository
2. Import project into Eclipse as Maven Project
3. Configure MySQL database
4. Update DB credentials in JDBC utility class
5. Deploy project on Apache Tomcat
6. Access application at:
   `http://localhost:8080/smart-notification/index.html`
   
## Project Architecture
- NotificationChannel (Interface)
- EmailNotification / SMSNotification / PushNotification (Implementations)
- NotificationManager (Polymorphism)
- DAO classes for database operations
- Servlet layer for web interaction
- JSP pages for UI

## Technologies Used
- Java 17
- Maven
- MySQL
- JDBC
- Servlets (Jakarta Servlet API)
- JSP
- Eclipse IDE
- Apache Tomcat

## Dependencies
- [JUnit Jupiter](https://junit.org/junit5/) for unit testing
- [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) for database access

### 1. Servlet Implementation
- Implemented `NotificationServlet` using Jakarta Servlet API
- Handles HTTP requests and interacts with core Java logic
- Acts as a controller between UI and backend

### 2. Web-Based GUI
- JSP-based user interface
- Form to send notifications
- Simple and functional UI

### 3. Code Quality & Execution
- Clean package structure
- Well-commented classes
- Modular and reusable code
- Proper exception handling

### 4. Innovation / Extra Effort
- Notification logs stored in database with timestamp
- Success page after sending notification
- Input validation for message content

## Database Design
Table: `notifications`

| Column | Description |
|------|------------|
| id | Primary Key |
| type | Notification type |
| message | Message content |
| timestamp | Time of sending |
| status | Sent/Failed |


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

Notification Sent Successfully
Sent at: 2025-12-16T18:30:15.123

id | type  | message        | receiver  |  timestamp             |    sent_at
3  | email | abc@gmail.com  |  54       |  2025-11-23 02:05:58   |    2025-12-16 20:22:21
2  | sms   | nitin          |  000      |  2025-11-23 01:01:34   |    2025-12-16 20:222:21
1  | sms   | otp sent       |  123      |  2025-11-23 00:58:40   |    2025-12-16 20:22:21

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


