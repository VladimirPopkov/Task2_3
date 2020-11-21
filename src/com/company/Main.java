package com.company;

import java.util.Random;

public class Main {

    private final static int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        int positive[] = new int[ARRAY_SIZE];
        int negative[] = new int[ARRAY_SIZE];
        int sumArray[] = new int[ARRAY_SIZE];
        fillArray(positive, 1, 100);
        fillArray(negative, -100, -1);
        printArr("Массив положительных чисел: ", positive);
        printArr("Массив отрицательных чисел: ", negative);
        sumArray(sumArray,positive,negative);
        printArr("Суммарный массив: ", sumArray);
    }

    static void printArr(String nameArr, int[] arr) {
        System.out.print(nameArr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    static void fillArray(int[] arr, int min, int max){
        Random random = new Random();
        int k = 0;
        while (k<7){
            arr[k] = random.nextInt(max - min + 1) + min;
            k++;
        }
    }

    static void sumArray(int[] sumArr, int[] arr1, int[] arr2){
        for (int i = 0;i < sumArr.length;i++){
            sumArr[i] = arr1[i] + arr2[i];
        }
    }
}
