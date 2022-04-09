package org.launchcode.java.demos.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGradebook {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //we need a variable to store the user input, so we create a variable for the names that will be types into the console.
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            //assign the user input to the variable newStudent
            newStudent = input.nextLine();

            //if newStudent is not blank, then add the newStudent name to the students Array List.
            if (!newStudent.equals("")) {
                students.add(newStudent);
            }
        //continue doing this as long as newStudent is not blank
        } while(!newStudent.equals(""));

        // Get student grades
        //for each student in the students Array List (so it loops through them all)
        for (String student : students) {
            System.out.print("Grade for " + student + ": ");
            //the next double the scanner picks up will be stored in the variable grade
            Double grade = input.nextDouble();
            //that grade will be added to the Array List, grades.
            grades.add(grade);
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            //looping through the Array List index by index and printing that student name and their grade
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            //Sum of all students grade
            sum += grades.get(i);
        }
        //calculate the average grade by dividing the sum by the number of students in the Students Array List
        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}