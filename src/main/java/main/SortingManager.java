package main;

import controller.*;
import view.DisplayManager;

public class SortingManager {
    public static void main(String[] args) {
        // Generate array of random ints
        int length = DisplayManager.howManyNumbers();
        int[] array = TheArray.generateArray(length);

        // Ask user which algorithm to use
        DisplayManager.displayQuestions();

        // Call factory controller to set sort type
        SorterFactory.setSort(array);
    }
}