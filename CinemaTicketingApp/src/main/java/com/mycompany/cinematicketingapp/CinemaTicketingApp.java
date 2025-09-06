/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cinematicketingapp;

/**
 *
 * @author lubanzi
 */
/**
 * This is the main class that runs the Cinema Ticketing System program. It
 * allows users to book, cancel, and view cinema tickets.
 *
 * Code Attribution:
 *
 * Title: Java Arrays Author: Oracle Date Accessed: 03 September 2025 Version:
 * Java SE 8 Available:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * Title: Java Scanner Class Author: W3Schools Date Accessed: 03 September 2025
 * Version: N/A Available: https://www.w3schools.com/java/java_user_input.asp
 */
import java.util.Scanner;



// Main application class
   public class CinemaTicketingApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            TicketManager manager = new TicketManager(10); // limit to 10 tickets

            while (true) {
                System.out.println("\n=== Cinema Ticketing System ===");
                System.out.println("1. Book Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. View Ticket Report");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        manager.bookTicket();
                        break;
                    case "2":
                        manager.cancelTicket();
                        break;
                    case "3":
                        manager.viewReport();
                        break;
                    case "4":
                        System.out.println("Exiting... Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
