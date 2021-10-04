package main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import controller.*;
import view.DisplayManager;
import java.util.Scanner;

public class SortingManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Generate array of random ints
        int length = DisplayManager.howManyNumbers();
        int[] array = theArray.generateArray(length);

        // Ask user which algorithm to use
        DisplayManager.displayQuestions();

        // Call factory controller to set sort type
        SorterFactory.setSort(array);
        PropertyConfigurator.configure("src/log4j.properties");
    }
    private static final Logger log = Logger.getLogger("Array Sorter logger.");
}