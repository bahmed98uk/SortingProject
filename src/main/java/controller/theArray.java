package controller;

public class theArray {
    public static int[] unsortedArray;

    public static int[] generateArray(int a) {
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100 + 1);
        }
        unsortedArray = arr;
        return arr;
    }
}
