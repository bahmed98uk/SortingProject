package controller;

import model.*;
import view.DisplayManager;
import java.util.Scanner;

public class SorterFactory {
    public static int[] unsortedArray;
    public static int[] sortedArray;
    public static SuperSort sorter;
    public static String cont;
    public static Scanner scan = new Scanner(System.in);
    public static String unsorted;

    public static void setSort(int[] array){
        // Choose the algorithm to use and instantiate the sort object
        unsortedArray = array;
        sortedArray = array;
        unsorted = DisplayManager.printUnsortedArray(unsortedArray);
        int sortChoice = scan.nextInt();

        do{
            switch(sortChoice){
                case 0:
                    sorter = new BubbleSort();
                    sorter();
                    break;
                case 1:
                    sorter = new InsertionSort();
                    sorter();
                    break;
                case 2:
                    sorter = new MergeSort();
                    sorter();
                    break;
                case 3:
                    sorter = new QuickSort();
                    sorter();
                    break;
                case 4:
                    sorter = new SelectionSort();
                    sorter();
                    break;
                default:
                    System.out.println("That is not a valid choice! Try again.");
            }
        } while (keepGoing());
    }

    private static void sort(SuperSort sorter, int[] array){
        //Sort the array and find time taken to sort
        System.out.println(unsorted);
        long time1 = System.nanoTime();
        sorter.sort(array);
        long time2 = System.nanoTime();
        long time = time2-time1;
        DisplayManager.printArray(array, time);
    }
    private static void sorter(){
        // Call sort method
        sort(sorter, unsortedArray);
    }
    private static boolean keepGoing(){
        //Check to keep sorting
        DisplayManager.cont();
        cont = scan.next();
        if(cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("yes")){
            DisplayManager.displayQuestions();
            int sortChoice = scan.nextInt();
            return sortChoice>=0 && sortChoice<=4;
        }
        else return false;
    }
}