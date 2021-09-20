package Mooc_fi_Java_Course;

import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int userInput = Integer.valueOf(scanner.nextLine());

        /*Write a program that reads an integer from the user.
        Next, the program prints numbers from 0 to the number given by the user.
        for (int i = 0; i <= userInput; i++){
            System.out.println(i);
        }*/

        /*Write a program, which reads an integer from the user.
        Then the program prints numbers from that number to 100.
        for (int i = userInput +1; i <= 100; i++){
            System.out.println(i);
        }*/

        /*Write a program which prints the integers from 1 to a number given by the user.
        System.out.println("Where to?");
        int higherBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Where form?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        for (int i = lowerBound +1; i <= higherBound; i++){
                System.out.println(i);
        }*/

        //Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
        //Get value n from user
        /*int valueN = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        //Count sequence from 1 to n
        for (int i = 1; i <= valueN; i++){
            //For each count, add (current count) to n
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);*/

        /*Implement a program which calculates the sum of a closed interval, and prints it.
        Expect the user to write the smaller number first and then the larger number.
        System.out.println("Where to?");
        int higherBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = lowerBound; i <= higherBound; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);*/

        /*Implement a program which calculates the factorial of a number given by the user.
        Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
        For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24.
        Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
        int valueN = Integer.valueOf(scanner.nextLine());//It is the number to calculate factorial
        int i, fact = 1;

        for(i = 1; i <= valueN; i++){
            fact = fact*i;
            System.out.println(fact);
        }
        System.out.println("Factorial of "+ valueN +" is: " + fact);*/
        System.out.println("Write numbers: ");
        int sum = 0;
        int totalNumbers = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            sum += input;
            if (input == -1) {
                break;
            }
            totalNumbers++;

            if (input % 2 != 0) {
                oddNumbers++;
                continue;
            }
            if (input % 2 == 0){
                evenNumbers++;
            }

        }

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Total numbers: " + totalNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Average of numbers: " + sum/totalNumbers);

    }
}

