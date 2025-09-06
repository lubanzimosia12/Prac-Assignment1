/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseriesmanagementapp;

/**
 *
 * @author lubanzi
 */
/**
 * This is the main class that runs the TV Series Management program. It allows
 * users to add series and view reports of stored series.
 *
 * Code Attribution:
 *
 * Title: Java Arrays Author: Oracle Date Accessed: 02 September 2025 Version:
 * Java SE 8 Available:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * Title: Java Scanner Class Author: W3Schools Date Accessed: 02 September 2025
 * Version: N/A Available: https://www.w3schools.com/java/java_user_input.asp
 *
 * Title: JUnit 5 Basics Author: Baeldung Date Accessed: 02 September 2025
 * Version: N/A Available: https://www.baeldung.com/junit-5
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    // Attribution: Code written by student with structural guidance from OpenAI ChatGPT (The Independent Institute of Education, 2025).

    private ArrayList<SeriesModel> seriesList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1. Capture Series
    public void CaptureSeries() {
        System.out.println("\n--- Capture New Series ---");
        System.out.print("Enter Series ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Series Name: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Enter Age Restriction (2 - 18): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 2 && age <= 18) {
                    break;
                } else {
                    System.out.println("Invalid! Must be between 2 and 18.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number.");
            }
        }

        int episodes;
        while (true) {
            System.out.print("Enter Number of Episodes: ");
            try {
                episodes = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Must be a number.");
            }
        }

        seriesList.add(new SeriesModel(id, name, age, episodes));
        System.out.println("Series successfully saved!");
    }

    // 2. Search Series
    public void SearchSeries() {
        System.out.print("\nEnter Series ID to search: ");
        String id = scanner.nextLine();

        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                System.out.println("Series Found: " + s);
                return;
            }
        }
        System.out.println("No series data found with ID " + id);
    }

    // 3. Update Series
    public void UpdateSeries() {
        System.out.print("\nEnter Series ID to update: ");
        String id = scanner.nextLine();

        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                System.out.print("Enter new Series Name: ");
                s.SeriesName = scanner.nextLine();

                int age;
                while (true) {
                    System.out.print("Enter new Age Restriction (2 - 18): ");
                    try {
                        age = Integer.parseInt(scanner.nextLine());
                        if (age >= 2 && age <= 18) {
                            s.SeriesAge = age;
                            break;
                        } else {
                            System.out.println("Invalid! Must be between 2 and 18.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Must be a number.");
                    }
                }

                int episodes;
                while (true) {
                    System.out.print("Enter new Number of Episodes: ");
                    try {
                        episodes = Integer.parseInt(scanner.nextLine());
                        s.SeriesNumberOfEpisodes = episodes;
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input! Must be a number.");
                    }
                }

                System.out.println("Series updated successfully!");
                return;
            }
        }
        System.out.println("No series found with ID " + id);
    }

    // 4. Delete Series
    public void DeleteSeries() {
        System.out.print("\nEnter Series ID to delete: ");
        String id = scanner.nextLine();

        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                System.out.print("Are you sure? (Y/N): ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    seriesList.remove(s);
                    System.out.println("Series deleted successfully!");
                } else {
                    System.out.println("Delete cancelled.");
                }
                return;
            }
        }
        System.out.println("No series found with ID " + id);
    }

    // 5. Report
    public void SeriesReport() {
        System.out.println("\n--- Series Report ---");
        if (seriesList.isEmpty()) {
            System.out.println("No series available.");
        } else {
            for (SeriesModel s : seriesList) {
                System.out.println(s);
            }
        }
    }

    // 6. Exit
    public void ExitSeriesApplication() {
        System.out.println("Exiting application... Goodbye!");
        System.exit(0);
    }

    // Helper methods for Unit Tests 
    public void testAddSeries(SeriesModel s) {
        seriesList.add(s);
    }
// Helper method to remove by ID without Scanner (used for testing)

    public boolean testRemoveSeries(String id) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                seriesList.remove(s);
                return true;
            }
        }
        return false;
    }

    public SeriesModel testSearch(String id) {
        for (SeriesModel s : seriesList) {
            if (s.SeriesId.equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
