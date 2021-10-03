package view;

public class DisplayManager {

    public static void generateArray(int[] arr){
        float time1 = (float)System.nanoTime();
        System.out.println();
        for (int i : arr) System.out.print(i + ", ");

        float time2 = (float) System.nanoTime();
        System.out.println("\nTime: " + ((time2-time1)/100000000) + " seconds");
    }
}
