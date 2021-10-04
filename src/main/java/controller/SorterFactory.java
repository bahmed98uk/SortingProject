package controller;

import model.*;
import view.DisplayManager;
import java.util.Arrays;
import java.util.Scanner;

public class SorterFactory {
    public static void setSort(int sortChoice, int[] array){
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        SuperSort sorter;
        String cont;
        Scanner scan = new Scanner(System.in);

        do{
            if(sortChoice==0){
                sorter = new BubbleSort();
                long time1 = System.nanoTime();
                sorter.sort(array);
                long time2 = System.nanoTime();
                long time = time2-time1;
                DisplayManager.generateArray(array, time);
            }
            if(sortChoice==1){
                sorter = new InsertionSort();
                long time1 = System.nanoTime();
                sorter.sort(array);
                long time2 = System.nanoTime();
                long time = time2-time1;
                DisplayManager.generateArray(array, time);
            }
            if(sortChoice==2){
                sorter = new MergeSort();
                long time1 = System.nanoTime();
                sorter.sort(array);
                long time2 = System.nanoTime();
                long time = time2-time1;
                DisplayManager.generateArray(array, time);
            }
            if(sortChoice==3){
                sorter = new QuickSort();
                long time1 = System.nanoTime();
                sorter.sort(array);
                long time2 = System.nanoTime();
                long time = time2-time1;
                DisplayManager.generateArray(array, time);
            }
            if(sortChoice==4){
                sorter = new SelectionSort();
                long time1 = System.nanoTime();
                sorter.sort(array);
                long time2 = System.nanoTime();
                long time = time2-time1;
                DisplayManager.generateArray(array, time);
            }
            System.out.println("Do you want to sort the array again using a different sort? Y/N");
            cont = scan.next();
            if(cont.equals("Y")){
                DisplayManager.displayQuestions();
                sortChoice = scan.nextInt();
            }
        }while (cont.equals("Y"));
    }
}
