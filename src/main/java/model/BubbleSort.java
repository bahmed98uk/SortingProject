package model;

public class BubbleSort extends SuperSort {
//    public static void main.main(String[] args) {
//
//    }

    public static void bubbleSort(int[] arr) {
        // now sort it
        // look at ith and i+1th element, swap if i > i+1
        // move window across by 1

        int temp;
        boolean swapMade = true;

        while (swapMade) {
            swapMade = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapMade = true;
                }
            }
        }

    }

    public static void bubbleSort2(int[] arr) {
        int temp;
        int n = arr.length-1;

        while (n > 1) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            n--;
        }
    }
}