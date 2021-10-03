package controller;

import model.*;
import view.DisplayManager;

import java.util.Scanner;

public class SorterFactory {
    public static void setSort(int sortChoice, int[] array){
        SuperSort sorter = null;
        String cont;
        do{
            if(sortChoice==0){
                sorter = new BubbleSort();
                sorter.sort(array);
                DisplayManager.generateArray(array);
            }
            if(sortChoice==1){
                sorter = new InsertionSort();
                sorter.sort(array);
                DisplayManager.generateArray(array);
            }
            if(sortChoice==2){
                sorter = new MergeSort();
                sorter.sort(array);
                DisplayManager.generateArray(array);
            }
            if(sortChoice==3){
                sorter = new QuickSort();
                sorter.sort(array);
                DisplayManager.generateArray(array);
            }
            if(sortChoice==4){
                sorter = new SelectionSort();
                sorter.sort(array);
                DisplayManager.generateArray(array);
            }
            System.out.println("Do you want to sort the array again using a different sort? Y/N");
            Scanner scan = new Scanner(System.in);
            cont = scan.next();
        }while(cont.equals("Y"));
    }
}
