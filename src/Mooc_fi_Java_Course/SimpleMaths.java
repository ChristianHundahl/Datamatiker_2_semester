package Mooc_fi_Java_Course;
import java.util.Scanner;

public class SimpleMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number of days you want to translate into seconds:");
        int days = Integer.valueOf(scanner.nextLine());
        int daysToSeconds = days*86400;
        System.out.println(daysToSeconds);

        System.out.println("Give me three numbers" + "\nFirst number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Now the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Now a third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        System.out.println("The numbers " + firstNum + " + " + secondNum + " + " + thirdNum + " " + "totals " + (firstNum + secondNum + thirdNum));

        System.out.println("Now let's multiply!");
        int fourthNum = Integer.valueOf(scanner.nextLine());
        int fifthNum = Integer.valueOf(scanner.nextLine());
        System.out.println(fourthNum  + " * " + fifthNum + " = " +(fourthNum*fifthNum));

        System.out.println("Division comes next");
        System.out.println("Give me one number:");
        int dividend = Integer.valueOf(scanner.nextLine());
        System.out.println("Now give me a second number:");
        int divisor = Integer.valueOf(scanner.nextLine());
        System.out.println("Now a third:");
        int divisor2 = Integer.valueOf(scanner.nextLine());
        double result = (1.0 * dividend + divisor + divisor2) / 3;//1.0 * converts to floating-point number
        System.out.println("The average is " + result);

        System.out.println("Give me a number:");
        int giveMe1 = Integer.valueOf(scanner.nextLine());
        System.out.println("And another one:");
        int giveMe2 = Integer.valueOf(scanner.nextLine());
        System.out.println(giveMe1 + " + " + giveMe2 + " = " + (giveMe1+giveMe2));
        System.out.println(giveMe1 + " - " + giveMe2 + " = " + (giveMe1-giveMe2));
        System.out.println(giveMe1 + " * " + giveMe2 + " = " + (giveMe1*giveMe2));
        System.out.println(giveMe1 + " / " + giveMe2 + " = " + ((double) giveMe1 / giveMe2));

    }
}