package main;

import controller.SorterFactory;
import controller.theArray;
import java.util.Scanner;

public class SortingManager {
    public static void main(String[] args) {
        // generate random array of ints
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want in the array?");
        int length = scan.nextInt();
        int[] array = new int[length];
        theArray.generateArray(array);

        System.out.println("Pick a Sorting Algorithm to use: " +
                "\n0: Bubble Sort" +
                "\n1: Insertion Sort" +
                "\n2: Merge Sort" +
                "\n3: Quick Sort" +
                "\n4: Selection Sort");
        int choice = scan.nextInt();
        SorterFactory.setSort(choice, array);
    }
}
