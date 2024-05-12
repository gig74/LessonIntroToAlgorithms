package org.training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testAllSort(1000);
        testAllSort(10000);
        testAllSort(100000);
//        testAllSort(200000);
//        testAllSort(400000);
    }

    public static void testAllSort(int arraSize) {
        System.out.printf("Размер массива: %d \n", arraSize);
        int[] baseArray = GenerateIntArray.generateIntArray(arraSize);
        int[] workArray = new int[arraSize];
        System.arraycopy(baseArray,0, workArray, 0, arraSize); // Копируем начальный сгенерированный массив в текущий сортируемый

//        Arrays.sort(workArray); // Для экспериментов с предварительно отсортированным массивом

        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(workArray);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения сортировки пузырьком, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, arraSize); // Копируем начальный сгенерированный массив в текущий сортируемый

        start = System.currentTimeMillis();
        InsertionSort.insetionSort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки вставками, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, arraSize); // Копируем начальный сгенерированный массив в текущий сортируемый

        start = System.currentTimeMillis();
        SelectionSort.selectionSort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки выбором, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, arraSize); // Копируем начальный сгенерированный массив в текущий сортируемый

        start = System.currentTimeMillis();
        Arrays.sort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки Arrays.sort, мс: " + elapsed);
    }
}