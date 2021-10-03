package controller;

public class theArray {
    public static int[] generateArray(int[] arr) {

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*50 + 1);
        }
        return arr;
    }
}
