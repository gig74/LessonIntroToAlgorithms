package org.training;

public class InsertionSort {
    public static void insetionSort(int[] arr){
        for(int i=1; i < arr.length; i++){
          int temp = arr[i];
          int j = i-1;
          while( j>=0 && arr[j] > temp){
              arr[j+1] = arr[j];
              j = j - 1 ;
          }
          arr[j + 1] = temp;
        }
    }
}
