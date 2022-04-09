package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = input.nextDouble();
        input.close();

        //call the getArea method from the Circle Class
        Double area = Circle.getArea(radius);
        System.out.println("The area of your circle is: " + area);
    }
        //Double Circle.getArea();
        //public static Double getArea(double radius) {

            //return Math.PI * radius * radius;
    }




