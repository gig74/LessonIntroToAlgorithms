package org.training;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i < n-1; i++){
            boolean isEnd = true;
            for(int j=1; j < n-i; j++)
            {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isEnd = false;
                }
            }
            if (isEnd) break;
        }
    }
}
