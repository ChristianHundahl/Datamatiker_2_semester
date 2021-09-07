package Mooc_fi_Java_Course;

import java.util.Scanner;

public class ExampleDatatypes {
    public static void main(String[] args) {
        //Integer.valueOf = converts int to String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Write another value:");
        double value2 = Double.valueOf(scanner.nextLine());
        System.out.println("Now write a float:");
        float value3 = Float.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value + ", " + value2 + " and " + value3);

        System.out.println("Rabbits are delicious");
        boolean areRabbitsDelicious = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + areRabbitsDelicious);
    }
}
