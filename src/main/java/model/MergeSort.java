package model;

public class MergeSort extends SuperSort{
    @Override
    public void sort(int[] numbers){
        // Merge Sort implementation
        if(numbers.length > 1){
            int elementsInA1 = numbers.length / 2;
            int elementsInA2 = numbers.length - elementsInA1;

            int[] arr1 = new int[elementsInA1];
            int[] arr2 = new int[elementsInA2];

            for(int i = 0; i < elementsInA1; i++)
                arr1[i] = numbers[i];

            for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
                arr2[i - elementsInA1] = numbers[i];

            sort(arr1);
            sort(arr2);

            int i = 0, j = 0, k = 0;
            while(arr1.length != j && arr2.length != k){
                if(arr1[j] < arr2[k]){
                    numbers[i] = arr1[j];
                    i++;
                    j++;
                }
                else{
                    numbers[i] = arr2[k];
                    i++;
                    k++;
                }
            }
            while(arr1.length != j){
                numbers[i] = arr1[j];
                i++;
                j++;
            }
            while(arr2.length != k){
                numbers[i] = arr2[k];
                i++;
                k++;
            }
        }
    }
}
