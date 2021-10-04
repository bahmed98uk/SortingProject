package main;

import controller.SorterFactory;
import controller.theArray;
import view.DisplayManager;
import java.util.Scanner;

public class SortingManager {
    public static void main(String[] args) {
        // generate random array of ints
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want in the array?");
        int length = scan.nextInt();
        int[] array = new int[length];
        theArray.generateArray(array);

        DisplayManager.displayQuestions();
        int choice = scan.nextInt();
        SorterFactory.setSort(choice, array);
    }
}
