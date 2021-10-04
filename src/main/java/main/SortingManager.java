package main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import controller.SorterFactory;
import controller.theArray;
import view.DisplayManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingManager {
    public static void main(String[] args) {
        // generate random array of ints
        int length = 0;
        int[] array;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("How many numbers do you want in the array?");
            length = scan.nextInt();
        } catch (InputMismatchException i) {
            System.err.println("You have to enter an integer! Please try again...");
            log.error("Expected an int but User has input a String."); //Logger log called here
            System.exit(1);
        }

        array = new int[length];
        theArray.generateArray(array);
        DisplayManager.displayQuestions();
        int choice = scan.nextInt();
        SorterFactory.setSort(choice, array);
        PropertyConfigurator.configure("src/log4j.properties");
    }

    private static Logger log = Logger.getLogger("Array Sorter logger.");
}
