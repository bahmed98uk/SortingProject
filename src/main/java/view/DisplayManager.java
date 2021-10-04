package view;

import java.util.Arrays;

public class DisplayManager {

    public static void generateArray(int[] arr, long time){
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Time to sort: " + time + " nanoseconds");
    }

    public static void displayQuestions(){
        System.out.println("Pick a Sorting Algorithm to use: " +
                "\n0: Bubble Sort" +
                "\n1: Insertion Sort" +
                "\n2: Merge Sort" +
                "\n3: Quick Sort" +
                "\n4: Selection Sort");
    }
}
