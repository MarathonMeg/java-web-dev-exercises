package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        //if input is a pos number, then
        if(input.hasNextDouble()){
            double radius = input.nextDouble();
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } else{
            System.out.println("Invalid Entry");
        }

        input.close();

    }
}

//Add validation to your program. If the user enters a negative number?
// a non-numeric character? the empty string? Print an error message and quit.