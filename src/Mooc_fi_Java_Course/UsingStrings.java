package Mooc_fi_Java_Course;

import java.util.Scanner;

public class UsingStrings {
    public static void main(String[] args) {
        int example = 10;
        Scanner scanner = new Scanner(System.in); //scanner = reference til objektet
        printThrice(scanner); //Tager objektet med i metoden
        printAge();

    }

    public static void printThrice(Scanner scanner){
        System.out.println("Input to print thrice");

        String word = String.valueOf(scanner.nextLine());
        System.out.println(word + " " + word + " " + word);
    }

    public static void isItTrue(){
        System.out.println("Test if true:");
        Scanner scanner1 = new Scanner(System.in);
        String testTruth = String.valueOf(scanner1.nextLine());
        if (!(testTruth.equals("true"))){
            System.out.println("It's not true!");
        }
        if (testTruth.equals("true")){
            System.out.println("Try again!");
        }
    }

    public static void logIn(){

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter username:");
        String testUserName = String.valueOf(scanner2.nextLine());

        System.out.println("Enter password:");
        String userPassword = String.valueOf(scanner2.nextLine());

        if (testUserName.equals("Alex") && userPassword.equals("Sunshine") || testUserName.equals("Emma") && userPassword.equals("Haskell")){
            System.out.println("You're in!");
            }

        else {
                System.out.println("Wrong username or password!");
        }
    }

    public static void spiltString(){
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Input sentence:");

        while (true) {
            String text = String.valueOf(scanner3.nextLine());
            String[] pieces = text.split(" ");

            if (!(text.equals(""))) {
                for (String piece : pieces) {
                    if (piece.contains("av")){
                    System.out.println(piece);
                }
                }
            }
            if (text.equals("")){
                break;
            }
        }
    }

    public static void printFirstAndLast(){
        Scanner scanner4 = new Scanner(System.in);
        while (true) {
            String text = String.valueOf(scanner4.nextLine());
            String[] pieces = text.split(" ");
            System.out.println(pieces[0]);
            System.out.println(pieces[pieces.length-1]);

            if (text.equals("")){
                break;
            }
        }
    }
    public static void printAge() {
        Scanner reader = new Scanner(System.in);
        int oldest = 0;
        String longest = "";
        String name = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;

            int age = Integer.valueOf(parts[1]);
            if (age > oldest){
                name = parts[0];
                oldest = age;
                if (name.length() > longest.length()){
                    longest = name;
                }
            }
        }
        if (count > 0) {
            System.out.println("Age average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
        System.out.println("Oldest person is " + oldest);
        System.out.println("The name of the oldest person is " + name);
        System.out.println("Longest name: " + longest);

    }
}
