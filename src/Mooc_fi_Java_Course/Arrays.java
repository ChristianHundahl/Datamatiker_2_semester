package Mooc_fi_Java_Course;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //swapIndicies();

        int[] numbers = {4, 6, 5};
        sumElements(numbers);
        printNeatly(numbers);
        printStars(numbers);
    }
    public static void swapIndicies(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers= new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        for (int j : numbers) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("Pick indicies to swap:");
        int firstSwap = Integer.valueOf(scanner.nextLine());
        int secondSwap = Integer.valueOf(scanner.nextLine());
        int helper = numbers[firstSwap];
        numbers [firstSwap] = numbers [secondSwap];
        numbers [secondSwap] = helper;

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Search for a number:");
        int searchNumber = Integer.valueOf(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Not found");
        }
    }
    public static void sumElements(int[] integerArray) {
        System.out.println("the sum of the elements in the array are: ");
        int index = 0;
        int sum = 0;
        while (index < integerArray.length) {
            sum = sum + integerArray[index];
            index++;
        }

        System.out.println(sum);
    }

    public static void printNeatly(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            int number = integerArray[index];
            index++;
            if(index == integerArray.length) {
                System.out.print(number);

            } else{
                System.out.print(number + ", ");
            }
        }
    }

    public static void printStars(int[] integerArray){
        for (int i = 0; i < integerArray.length; i++){
            System.out.println();
            for (int j = 0; j < integerArray[i]; j++){
                System.out.print("*");
            }
        }
    }
}
