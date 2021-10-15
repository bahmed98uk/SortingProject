package controller;

public class TheArray {
    public static int[] unsortedArray;

    public static int[] generateArray(int a) {
        //generate array of random numbers from 1-100
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100 + 1);
        }
        unsortedArray = arr;
        return arr;
    }
    public static int[] getUnsortedArray() {
        return unsortedArray;
    }
}
