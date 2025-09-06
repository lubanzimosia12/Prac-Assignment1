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

public class SeriesModel {
    // Attribution: Code written by student with structural guidance from OpenAI ChatGPT (The Independent Institute of Education, 2025).

    public String SeriesId;
    public String SeriesName;
    public int SeriesAge;
    public int SeriesNumberOfEpisodes;

    public SeriesModel(String id, String name, int age, int episodes) {
        this.SeriesId = id;
        this.SeriesName = name;
        this.SeriesAge = age;
        this.SeriesNumberOfEpisodes = episodes;
    }

    @Override
    public String toString() {
        return "Series ID: " + SeriesId
                + " Name: " + SeriesName
                + " Age Restriction: " + SeriesAge
                + " Episodes: " + SeriesNumberOfEpisodes;
    }
}
