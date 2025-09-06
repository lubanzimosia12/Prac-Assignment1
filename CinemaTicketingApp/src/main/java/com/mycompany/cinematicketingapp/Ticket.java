/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

// Base class representing a generic ticket
public class Ticket {

    protected String ticketId;
    protected String customerName;

    public Ticket(String ticketId, String customerName) {
        this.ticketId = ticketId;
        this.customerName = customerName;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDetails() {
        return "Ticket ID: " + ticketId + ", Customer: " + customerName;
    }
}
