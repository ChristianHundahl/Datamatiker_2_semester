package Mooc_fi_Java_Course;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList();
        String userInput;
        /*The exercise contains a base that asks the user for strings and adds them to a list. The program stops
        reading when the user enters an empty string.
        The program then prints the first element of the list. Your assignment is to modify the program so that
        instead of the first value, the third value on the list is printed. Remember that programmers start
        counting from zero! The program is allowed to malfunction if there are fewer than three entries on the list,
        so you don't need to prepare for such an event at all.
        System.out.println("Please input word:");
        while (!(userInput = scanner.nextLine()).isEmpty()) {
            System.out.println("Please input word:");
            wordList.add(userInput);
        }
        System.out.println(wordList.get(2));*/

        /*In the exercise template there is a program that reads integers from the user and adds them to a list.
        This ends when the user enters 0. The program then prints the first value on the list. Modify the program
        so that instead of the first value, the program prints the sum of the second and third numbers. The program
        is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare
        for such an event at all.
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please input number:");
        int userNumber = Integer.valueOf(scanner.nextLine());;
        while (userNumber != 0){
            numberList.add(userNumber);
            System.out.println("Please input number:");
            userNumber = Integer.valueOf(scanner.nextLine());
        }
        System.out.println(numberList.get(1) + numberList.get(2));

        /*In the exercise template is a program that reads input from the user. Modify its working so that when the
        program quits reading, the program prints the number of values on the list.
        System.out.println(numberList.size());*/


        /*In the exercise template there is a program that reads inputs from the user and adds them to a list.
        Reading is stopped once the user enters an empty string. Your task is to modify the method to print the last
        read value after it stops reading. Print the value that was read last from the list. Use the method that tells the
        size of a list to help you.
        System.out.println("Please input word:");
        while (!(userInput = scanner.nextLine()).isEmpty()) {
            System.out.println("Please input word:");
            wordList.add(userInput);
        }
        int lastWord = wordList.size() -1; //Ensures avoid indexOutOfBounds Exception
        System.out.println(wordList.get(0));
        System.out.println(wordList.get(lastWord));*/

        /*The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is
        stopped once the user enters the number -1. Expand the functionality of the program so that after reading the
        numbers, it prints all the numbers received from the user. The number used to indicate stopping should not be
        printed.
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please input number:");
        int userNumber = Integer.valueOf(scanner.nextLine());;
        while (userNumber != -1){
            numberList.add(userNumber);
            System.out.println("Please input number:");
            userNumber = Integer.valueOf(scanner.nextLine());
        }
        for (int number : numberList) {
            System.out.println(number);
        }*/

        /*Expand the program to ask for a start and end indices once it has finished asking for numbers. After this
        the program shall print all the numbers in the list that fall in the specified range (between the indices
        given by the user, inclusive). You may assume that the user gives indices that match some numbers in the list.
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please input number:");
        int userNumber = Integer.valueOf(scanner.nextLine());;
        while (userNumber != -1){
            numberList.add(userNumber);
            System.out.println("Please input number:");
            userNumber = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("From where?");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int toWhere = Integer.valueOf(scanner.nextLine());
        for (int i = fromWhere; i <= toWhere; i++){
            System.out.println(i);
        }
        /*Continue developing the program so that it finds the greatest number in the list and prints its value after
        reading all the numbers. The programming should work in the following manner.
        int biggest = numberList.get(0);

        for(int i = 0; i < numberList.size(); i++) {
            if (biggest < numberList.get(i)) {
                biggest = numberList.get(i);
            }
        }

        System.out.println("The biggest number is " + biggest);*/

        /*Expand the program by adding a functionality that asks the user for a number, and reports that number's index
        in the list. If the number is not found, the program should not print anything.
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please input number:");
        int userNumber = Integer.valueOf(scanner.nextLine());
        while (userNumber != -1) {
            numberList.add(userNumber);
            System.out.println("Please input number:");
            userNumber = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberList.size(); i++) {
            int num = numberList.get(i);
            if (num == search) {
                System.out.println(num + " is at index " + i);
            }
        }*/

        /*Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please input number:");
        int userNumber = Integer.valueOf(scanner.nextLine());
        double sum = 0;
        while (userNumber != -1) {
            numberList.add(userNumber);
            sum = sum+userNumber;
            System.out.println("Please input number:");
            userNumber = Integer.valueOf(scanner.nextLine());
        }
        System.out.println(sum);

        /*When reading ends, calculate the average of the numbers in it, and then print that value.
        System.out.println(sum / numberList.size());*/

        /*In the exercise template there is a program that reads inputs from the user until an empty string is entered.
        Add the following functionality to it: after reading the inputs one more string is requested from the user.
        The program then tell whether that string was found in the list or not.
        System.out.println("Please input word:");
        while (!(userInput = scanner.nextLine()).isEmpty()) {
            System.out.println("Please input word:");
            wordList.add(userInput);
        }
        System.out.println("Input search term:");
        String searchTerm = String.valueOf(scanner.nextLine());
        if (wordList.contains(searchTerm)){
            System.out.println("Your term " + searchTerm + " was found");
        }
        */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);


        printNumbersInRange(numbers, 2,6);
        returnSum(numbers);

        numbers.add(10);
        returnSum(numbers);

        wordList.add("bob");
        wordList.add("ole");
        wordList.add("pete");
        wordList.add("ben");
        wordList.add("theis");
        wordList.add("jens");
        System.out.println(wordList);
        removeFirst(wordList);
        System.out.println(wordList);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range " + lowerLimit + ", " + upperLimit);
        for (int number : numbers) {
            if (number < upperLimit && number > lowerLimit){
                System.out.println(number);
            }
        }
    }

    public static int returnSum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println(sum);
        return sum;
    }

    public static void removeFirst(ArrayList<String> wordList) {
        if (wordList.size() == 0) {
            return;
        }
        wordList.remove(wordList.get(wordList.size() -1));
    }
}
