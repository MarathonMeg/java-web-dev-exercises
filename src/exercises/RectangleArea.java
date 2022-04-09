package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double length = input.nextDouble();
        System.out.println("What is the width of your rectangle?");
        Double width = input.nextDouble();
        input.close();

        Double area = calculateArea(length, width);
        System.out.println("The area of your rectangle is: " + area + "sq ft");
    }
    //the method is written outside of main, but within the RectangleArea Class
    public static Double calculateArea(Double length, Double width) {
        return length*width;
    }
}



