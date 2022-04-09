package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        double radius;

        do{
            System.out.println("please enter a positive decimal number");
            radius = input.nextDouble();
            while(radius <= 0) {
                System.out.println("That isn't a decimal please enter another choice");
                radius = input.nextDouble();
                input.next();
            }
        } while(!input.hasNextDouble());

        radius = input.nextDouble();

//        while(!input.hasNextDouble()){
//            System.out.println("That isn't a decimal please enter another choice");
//           input.next();
//        }
//        radius = input.nextDouble();
//
//        while (radius <= 0) {
//            System.out.println("This is a negative number, enter another choice");
//            input.next();
//        }
//
//        radius = input.nextDouble();

        //if input is a pos number, then


//        if(input.hasNextDouble()){
//            double radius = input.nextDouble();
//            double area = Circle.getArea(radius);
//            System.out.println("The area of a circle of radius " + radius + " is: " + area);
//        } else{
//            System.out.println("Invalid Entry");
//        }

        input.close();

    }
}

//Add validation to your program. If the user enters a negative number?
 //a non-numeric character? the empty string? Print an error message and quit.