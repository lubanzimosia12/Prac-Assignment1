/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cinematicketingapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
public class TicketManagerTest {

    public TicketManagerTest() {
    }

// Simple JUnit tests for TicketManager
    private TicketManager manager;

    @BeforeEach
    public void setUp() {
        manager = new TicketManager(5); // small storage for testing
    }

    @Test
    public void testBookTicket() {
        MovieTicket t = new MovieTicket("T01", "Sade", "Avengers", "A1");
        manager.testAddTicket(t);

        assertNotNull(manager.testFindTicket("T01"), "Ticket should be found after adding.");
    }

    @Test
    public void testCancelTicket() {
        MovieTicket t = new MovieTicket("T02", "John", "Batman", "B2");
        manager.testAddTicket(t);

        boolean canceled = manager.testCancelTicket("T02");
        assertTrue(canceled, "Ticket should be canceled successfully.");
        assertNull(manager.testFindTicket("T02"), "Canceled ticket should not be found.");
    }

    @Test
    public void testEmptyAtStart() {
        assertNull(manager.testFindTicket("X99"), "No tickets should exist at start.");
    }
}
