package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int positive[] = new int[7];
        int negative[] = new int[7];
        int summArray[] = new int[7];
        Random random = new Random();
        int k = 0;
        while (k<7){
            positive[k] = random.nextInt(100) + 1;
            negative[k] = random.nextInt(100) - 100;
            k++;
        }
        System.out.printf("Массив положительных чисел: ");
        for (int i = 0;i < positive.length;i++){
            System.out.printf("%d ", positive[i]);
        }
        System.out.println();
        System.out.printf("Массив отрицательных чисел: ");
        for (int i = 0;i < negative.length;i++){
            System.out.printf("%d ", negative[i]);
        }
        System.out.println();
        System.out.printf("Суммарный массив: ");
        for (int i = 0;i < summArray.length;i++){
            summArray[i] = positive[i] + negative[i];
            System.out.printf("%d ", summArray[i]);
        }
    }
}
