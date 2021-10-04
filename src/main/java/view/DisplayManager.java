package view;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayManager {

    public static void printArray(int[] arr, long time){
        // Print the sorted array and time taken to sort
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Time to sort: " + time + " nanoseconds");
    }

    public static String printUnsortedArray(int[] arr){
        // Print unsorted array
        return ("Unsorted Array: " + Arrays.toString(arr));
    }

    public static void displayQuestions(){
        // Print list of algorithms to choose from
        System.out.println("Pick a Sorting Algorithm to use: " +
                "\n0: Bubble Sort" +
                "\n1: Insertion Sort" +
                "\n2: Merge Sort" +
                "\n3: Quick Sort" +
                "\n4: Selection Sort");
    }

    public static void cont(){
        // Ask user if they want to choose another sort
        System.out.println("Do you want to sort the array again using a different sort?" +
                " Yes to continue, anything else to exit.");
    }

    public static int howManyNumbers(){
        // Ask user how long they want the array to be
        PropertyConfigurator.configure("src/log4j.properties");
        Scanner scan = new Scanner(System.in);
        int length = 0;
        try {
            // Log the error if user enters a string
            System.out.println("How many numbers do you want in the array?");
            length = scan.nextInt();
        } catch (InputMismatchException i) {
            System.err.println("You have to enter an integer! Please try again...");
            log.error("Expected an int but User has input another type."); //Logger log called here
            System.exit(1);
        }
        return length;
    }
    private static final Logger log = Logger.getLogger("Array Sorter logger.");
}
