package Mooc_fi_Java_Course;

import java.util.Scanner;

public class ProblemsAndPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that reads two integers from the user. If the first number is greater than the second, the program prints "(first) is greater than (second)."
        //If the first number is less than the second, the program prints "(first) is smaller than (second)."
        //Otherwise, the program prints "(first) is equal to (second)." The (first) and (second) should always be replaced with the actual numbers that were provided by the user.
        System.out.println("Choose two numbers to be compared");
        int number4 = Integer.valueOf(scanner.nextLine());
        int number5 = Integer.valueOf(scanner.nextLine());
        if (number4 > number5){
            System.out.println(number4 + " is greater than " + number5);
        }
        else if (number4 == number5){
            System.out.println(number4 + " is equal to " + number5);
        }
        else{
            System.out.println(number5 + " is greater than " + number4);
        }

        //Write a program that reads an integer from the user. If the number is less than 0,
        //the program prints the given integer multiplied by -1. In all other cases, the program prints the number itself.
        System.out.println("Write a number:");
        int number3 = Integer.valueOf(scanner.nextLine());
        if (number3 < 0){
            System.out.println(number3*-1);
        }
        else{
            System.out.println(number3);
        }
        //Write a program that reads an integer from the user and prints the square of the given integer, i.e. the integer multiplied by itself.
        //Identify required input variables and declare them
        System.out.println("Type a number to be squared:");
        double userInput = Double.valueOf(scanner.nextLine());

        //Identify required operation and declare variables for the result
        double inputSquared = userInput*userInput;

        //Print results
        System.out.println("Your number " + userInput + " squared is " + inputSquared);

        //Write a program that reads two integers from the user and prints the square root of the sum of these integers. The program does not need to work with negative values.
        //You can calculate the square root of an integer with the command Math.sqrt like this:
        //int number = 42;
        //double squareRoot = Math.sqrt(number);
        //System.out.println(squareRoot);
        //Identify and declare input
        System.out.println("Type two numbers:");
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        //Identify operations and declare result variables
        double sum = number1 + number2;
        double sumSquared = Math.sqrt(sum);
        System.out.println("The sum of your numbers squared: " + sumSquared);

    }
}
