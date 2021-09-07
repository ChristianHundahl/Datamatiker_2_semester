package Mooc_fi_Java_Course;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Value of the gift?");
        Scanner scan = new Scanner(System.in);
        double value = Double.valueOf(scan.nextLine());
        //double tax1 = (100 + (value - 5000)*0.8);
        //double tax2 = (1700 + (value - 25000)*0.10);
        //double tax3 = (4700 + (value - 55000)*0.12);
        //double tax4 = (22100 + (value - 200000)*0.15);
        //double tax5 = (142100 + (value - 1000000)*0.17);

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value < 25000){
            System.out.println("Tax: " + (value-5000)*0.08);
        } else if (value >= 25000 && value < 55000){
            System.out.println("Tax: " + (value-25000)*0.1);
        } else if (value >= 55000 && value < 200000){
            System.out.println("Tax: " + (value-55000)*0.12);
        } else if (value >= 200000 && value < 1000000){
            System.out.println("Tax: " + (value-200000)*0.15);
        } else if (value >= 1000000){
            System.out.println("Tax: " + (value-1000000)*0.17);
        }

        // Identifying the input values and declaring the variables for them
        int first = 1;
        int second = 2;

// Identifying the operation and declaring a variable for the result
        int sum = first + second;

// printing the result of the calculation
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
    }
}

