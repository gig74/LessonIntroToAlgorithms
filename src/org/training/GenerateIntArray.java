package org.training;

public class GenerateIntArray {
    public static int[] generateIntArray(int arraySize) {
        int[] arrayInt = new int[arraySize];
        for(int i=0; i < arraySize; i++){
            arrayInt[i] = 1 + (int)( Math.random() * 9999 ) ; // 1...9999
        }
        return arrayInt;
    }
}
