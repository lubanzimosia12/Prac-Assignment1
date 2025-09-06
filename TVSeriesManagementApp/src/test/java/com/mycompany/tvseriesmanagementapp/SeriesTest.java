/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tvseriesmanagementapp;

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
public class SeriesTest {

    // 1. Test that a series can be found when it exists
    @Test
    public void TestSearchSeries() {
        Series series = new Series();

        // Add a test series
        SeriesModel show = new SeriesModel("S01", "Breaking Code", 16, 12);
        series.testAddSeries(show);

        // Try search
        SeriesModel result = series.testSearch("S01");

        // Check result
        assertTrue(result != null, "Series should be found");
        assertEquals("Breaking Code", result.SeriesName);
    }

    // 2. Test searching for a non-existing series
    @Test
    public void TestSearchSeries_SeriesNotFound() {
        Series series = new Series();

        // No series added, so search should fail
        SeriesModel result = series.testSearch("X01");

        assertNull(result, "Series should not be found");
    }

    // 3. Test updating a series
    @Test
    public void TestUpdateSeries() {
        Series series = new Series();

        // Add series
        SeriesModel oldShow = new SeriesModel("S02", "Old Show", 12, 8);
        series.testAddSeries(oldShow);

        // Pretend we update the details
        SeriesModel updateTarget = series.testSearch("S02");
        if (updateTarget != null) {
            updateTarget.SeriesName = "New Show";
            updateTarget.SeriesAge = 15;
            updateTarget.SeriesNumberOfEpisodes = 10;
        }

        // Now check values
        assertEquals("New Show", updateTarget.SeriesName);
        assertEquals(15, updateTarget.SeriesAge);
        assertEquals(10, updateTarget.SeriesNumberOfEpisodes);
    }

    // 4. Test deleting an existing series
    @Test
    public void TestDeleteSeries() {
        Series series = new Series();

        // Add a series
        series.testAddSeries(new SeriesModel("S03", "Delete Me", 13, 5));

        // Make sure it exists before deletion
        SeriesModel target = series.testSearch("S03");
        assertNotNull(target);

        // Delete
        boolean removed = series.testRemoveSeries("S03");

        // Verify it was deleted
        assertTrue(removed);
        assertNull(series.testSearch("S03"));
    }

    // 5. Test deleting a series that does not exist
    @Test
    public void TestDeleteSeries_SeriesNotFound() {
        Series series = new Series();

        // Try deleting a non-existing ID
        boolean removed = series.testRemoveSeries("Z99");

        // It should not delete anything
        assertFalse(removed);
    }

    // 6. Test a valid age restriction
    @Test
    public void TestSeriesAgeRestriction_AgeValid() {
        int age = 10; // within 2-18
        boolean isValid = false;

        if (age >= 2 && age <= 18) {
            isValid = true;
        }

        assertTrue(isValid, "Age 10 should be valid");
    }

    // 7. Test an invalid age restriction
    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInValid() {
        int age = 25; // outside 2-18
        boolean isValid = false;

        if (age >= 2 && age <= 18) {
            isValid = true;
        }

        assertFalse(isValid, "Age 25 should be invalid");
    }
}
