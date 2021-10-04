package controller;

import model.*;
import org.apache.log4j.Logger;
import view.DisplayManager;
import java.util.Scanner;

public class SorterFactory {
    public static int[] unsortedArray;
    public static int[] sortedArray;
    public static SuperSort sorter;
    public static String cont;
    public static Scanner scan = new Scanner(System.in);
    public static String unsorted;

    public static void setSort(int sortChoice, int[] array){
        unsortedArray = array;
        sortedArray = array;
        unsorted = DisplayManager.printUnsortedArray(unsortedArray);
        sortChoice = scan.nextInt();

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
        System.out.println(unsorted);
        long time1 = System.nanoTime();
        sorter.sort(array);
        long time2 = System.nanoTime();
        long time = time2-time1;
        DisplayManager.printArray(array, time);
    }
    private static void sorter(){
        sort(sorter, unsortedArray);
    }
    private static boolean keepGoing(){
        DisplayManager.cont();
        cont = scan.next();
        if(cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("yes")){
            DisplayManager.displayQuestions();
            int sortChoice = scan.nextInt();
            return sortChoice>=0 && sortChoice<=4;
        }
        else return false;
    }
    private static final Logger log = Logger.getLogger("Array Sorter logger.");
}