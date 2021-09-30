package model;

public class QuickSort extends SuperSort{
    public void QuickSort(int[] numbers, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = numbers[(left + right) / 2];
        // partition
        while (i <= j){
            while (numbers[i] < pivot)
                i++;
            while (numbers[j] > pivot)
                j--;
            if (i <= j) {
                tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
            }
        };
        // recursion
        if (left < j)
            QuickSort(numbers, left, j);

        if (i < right)
            QuickSort(numbers, i, right);
    }

    public void sort(int[] numbers) {

        int i = 0, j = (numbers.length-1);
        int tmp;
        int pivot = numbers[(0 + (numbers.length)) / 2];
        // partition
        while (i <= j) {
            while (numbers[i] < pivot)
                i++;
            while (numbers[j] > pivot)
                j--;
            if (i <= j) {
                tmp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = tmp;
                i++;
                j--;
            }
        };
        // recursion
        if (0 < j)
            QuickSort(numbers, 0, j);

        if (i < numbers.length-1)
            QuickSort(numbers, i, numbers.length-1);

    }
}
