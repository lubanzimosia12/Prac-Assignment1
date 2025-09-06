/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tvseriesmanagementapp;

import java.util.Scanner;

/**
 *
 * @author lubanzi
 */
/**
 * This is the main class that runs the TV Series Management program.
 * It allows users to add series and view reports of stored series.
 *
 * Code Attribution:
 *
 * Title: Java Arrays
 * Author: Oracle
 * Date Accessed: 02 September 2025
 * Version: Java SE 8
 * Available: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * Title: Java Scanner Class
 * Author: W3Schools
 * Date Accessed: 02 September 2025
 * Version: N/A
 * Available: https://www.w3schools.com/java/java_user_input.asp
 *
 * Title: JUnit 5 Basics
 * Author: Baeldung
 * Date Accessed: 02 September 2025
 * Version: N/A
 * Available: https://www.baeldung.com/junit-5
 */

public class TVSeriesManagementApp {

    public static void main(String[] args) {
        Series seriesApp = new Series();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TV Series Management Application ===");
            System.out.println("1. Capture New Series");
            System.out.println("2. Search Series");
            System.out.println("3. Update Series");
            System.out.println("4. Delete Series");
            System.out.println("5. View Series Report");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    seriesApp.CaptureSeries();
                    break;
                case "2":
                    seriesApp.SearchSeries();
                    break;
                case "3":
                    seriesApp.UpdateSeries();
                    break;
                case "4":
                    seriesApp.DeleteSeries();
                    break;
                case "5":
                    seriesApp.SeriesReport();
                    break;
                case "6":
                    seriesApp.ExitSeriesApplication();
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

}
