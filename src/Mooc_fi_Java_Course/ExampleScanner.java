package Mooc_fi_Java_Course;
import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a message: ");
        String message = scanner.nextLine(); //'message' is a variabel created to store the contents of scanner.nextLine();
        System.out.println(message + "\n" + message + "\n" + message);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("How are you doing?");
        String answerGreeting = scanner.nextLine();
        System.out.println("Interesting. Tell me more!");
        String elaborate = scanner.nextLine();
        System.out.println("fascinating. Been nice talking. See you!");

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String proTagName = scanner.nextLine();
        System.out.println("What is their job?");
        String proTagJob = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time, there was " + proTagName + " who was a " + proTagJob + "\n" +
                "One day on the way to work, " + proTagName + " reflected on life." +"\n" +
                "Perhaps " + proTagName + " would not be a " + proTagJob + " forever.");
    }
}
