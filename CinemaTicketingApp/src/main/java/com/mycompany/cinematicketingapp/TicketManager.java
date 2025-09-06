/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinematicketingapp;

import java.util.Scanner;

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
public class TicketManager {

// Manages booking, canceling, and reporting tickets
    private MovieTicket[] tickets;
    private int count;
    private Scanner scanner = new Scanner(System.in);

    public TicketManager(int size) {
        tickets = new MovieTicket[size];
        count = 0;
    }

    // Book a new ticket (interactive)
    public void bookTicket() {
        if (count >= tickets.length) {
            System.out.println("All tickets are booked. Cannot add more.");
            return;
        }

        System.out.print("Enter Ticket ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movie = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        String seat = scanner.nextLine();

        tickets[count] = new MovieTicket(id, name, movie, seat);
        count++;
        System.out.println("Ticket booked successfully!");
    }

    // Cancel a ticket (interactive)
    public void cancelTicket() {
        System.out.print("Enter Ticket ID to cancel: ");
        String id = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getTicketId().equalsIgnoreCase(id)) {
                tickets[i] = null;
                System.out.println("Ticket canceled successfully.");
                return;
            }
        }
        System.out.println("No ticket found with ID: " + id);
    }

    // View all tickets
    public void viewReport() {
        System.out.println("\n--- Cinema Ticket Report ---");
        if (count == 0) {
            System.out.println("No tickets booked yet.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null) {
                System.out.println(tickets[i].getDetails());
            }
        }
    }

    // Helper methods for Unit Tests
    public void testAddTicket(MovieTicket t) {
        if (count < tickets.length) {
            tickets[count] = t;
            count++;
        }
    }

    public MovieTicket testFindTicket(String id) {
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getTicketId().equalsIgnoreCase(id)) {
                return tickets[i];
            }
        }
        return null;
    }

    public boolean testCancelTicket(String id) {
        for (int i = 0; i < count; i++) {
            if (tickets[i] != null && tickets[i].getTicketId().equalsIgnoreCase(id)) {
                tickets[i] = null;
                return true;
            }
        }
        return false;
    }
}
