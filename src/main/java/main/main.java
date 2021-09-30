package main;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        // generate random array of ints
        System.out.println("Initial array:");
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99) + 1;
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
