package org.training;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int num = in.nextInt();
        System.out.printf("Размер массива: %d \n", num);
        int[] baseArray = GenerateIntArray.generateIntArray(num);
        int[] workArray = new int[num];
        System.arraycopy(baseArray,0, workArray, 0, num);

        //Arrays.sort(workArray); // Для экспериментов с предварительно отсортированным массивом

        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(workArray);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Время выполнения сортировки пузырьком, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, num);

        start = System.currentTimeMillis();
        InsertionSort.insetionSort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки вставками, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, num);

        start = System.currentTimeMillis();
        SelectionSort.selectionSort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки выбором, мс: " + elapsed);

        System.arraycopy(baseArray,0, workArray, 0, num);

        start = System.currentTimeMillis();
        Arrays.sort(workArray);
        finish = System.currentTimeMillis();
        elapsed = finish - start;
        System.out.println("Время выполнения сортировки Arrays.sort, мс: " + elapsed);
    }
}