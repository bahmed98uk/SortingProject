import java.util.*;

public class Sort {
    public static void main(String[] args) {

        // generate random array of ints
        System.out.println("Initial array:");
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99) + 1;
            System.out.print(arr[i] + " ");
        }

        //int[] sortedArray = bubbleSort(arr);
        //bubbleSort(arr);
        bubbleSort2(arr);

        System.out.println("\nSorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println("\nInitial Rectangle areas:");
        Rectangle[] rectArr = new Rectangle[10];
        for(int i = 0; i < rectArr.length; i++) {
            rectArr[i] = new Rectangle(rand.nextInt(5) + 1, rand.nextInt(5) + 1);
            System.out.print(rectArr[i].getArea() + " ");
        }
        sortRectangles(rectArr);

        System.out.println("\nSorted Rectangle array:");
        for (Rectangle j : rectArr) {
            System.out.print(j.getArea() + " ");
        }
    }

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

    public static void sortRectangles(Rectangle[] rects) {

        Rectangle temp;
        boolean swapMade = true;

        while(swapMade) {
            swapMade = false;
            for (int i = 0; i < rects.length - 1; i++) {
                if (rects[i].getArea() > rects[i + 1].getArea()) {
                    temp = rects[i];
                    rects[i] = rects[i + 1];
                    rects[i + 1] = temp;
                    swapMade = true;
                }
            }
        }

    }
}