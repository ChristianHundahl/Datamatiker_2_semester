package Mooc_fi_Java_Course;

import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class RepeatingFunctionalityAndLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that reads values from the user until they input a 0.
        //After this, the program prints the total number of inputted values.
        //The zero that's used to exit the loop should not be included in the total number count.
        //Task: Read input value

        //Write a program that reads values from the user until they input a 0.
        //After this, the program prints the total number of inputted values that are negative.
        //The zero that's used to exit the loop should not be included in the total number count.

        //Write a program that reads numbers from the user until the user inputs a number 0.
        //this the program outputs the sum of the numbers. The number zero does not need to be added to the sum,
        //even if it does not change the results.

        //Write a program that asks the user for input until the user inputs 0.
        //After this the program prints the amount of numbers inputted and the sum of the numbers.
        //The number zero does not need to be added to the sum, but adding it does not change the results.

        //Write a program that asks the user for input until the user inputs 0.
        //After this, the program prints the average of the numbers.
        //The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.
        int counter =0;
        int sum = 0;

        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            sum = sum + userInput;

            if (userInput == 0 && sum > 0){
                int average = sum/counter;
                System.out.println("Total positive numbers: " + counter);
                System.out.println(sum);
                System.out.println(average);
                break;
            }
            if (userInput > 0) {
                counter = counter + 1;
            }//'continue' unnecessary as statement is loop
            if (sum < 0 && userInput == 0){
                System.out.println("Cannot calculate average");
            }
        }

        //Task: Exit if input == 0
        //Task: count total inputs

        //Write a program that asks the user for numbers. If the number is negative (smaller than zero),
        //the program prints for user "Unsuitable number" and asks the user for a new number.
        //If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.
        //User input
        while (true){
            System.out.println("Please input number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0){
                System.out.println("Program stopped");
                break;
            }
            if (userNum < 0){
                System.out.println("Unsuitable number, try again:");
                continue;
            }

            int toThe2nd = userNum*userNum;
            System.out.println("Thank you, your result is: " + toThe2nd);
            break;
        }

        //Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".
        //Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
        while (true){
            int userInput2 = Integer.valueOf(scanner.nextLine());
            if (userInput2 == 4){
                System.out.println("We are there!");
                break;
            }
            System.out.println("Are we there yet?");
        }

        int number = 1;
        while (true) {//Loop continue until 'while' no longer true
            System.out.println(number);
            if (number >= 5) {
                break;//Loop stops if it reaches a 'break;'
            }

            number = number + 1;
        }

        System.out.println("Ready!");
    }
}
