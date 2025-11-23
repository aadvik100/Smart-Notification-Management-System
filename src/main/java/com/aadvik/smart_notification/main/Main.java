package com.aadvik.smart_notification.main;

import com.aadvik.smart_notification.service.NotificationService;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
        NotificationService service = new NotificationService();
         
        while (true) {
            System.out.println("1. Send Email");
            System.out.println("2. Send SMS");
            System.out.println("3. Send Push");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter Message: ");
            String message = sc.nextLine();
            System.out.print("Enter Receiver: ");
            String receiver = sc.nextLine();

            String type = "";
            if (choice == 1) type = "email";
            else if (choice == 2) type = "sms";
            else if (choice == 3) type = "push";
            else {
                System.out.println("Invalid choice.");
                continue;
            }

            service.send(type, message, receiver);
            System.out.println("Notification sent via " + type + "\n");
        }

        sc.close();
    }

}



