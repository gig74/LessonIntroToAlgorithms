package org.training;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=1; i < arr.length - 1; i++){
            int minValue = arr[i];
            int minId = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = minValue;
            arr[minId] = temp;
        }
    }
}
