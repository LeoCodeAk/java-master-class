package org.example.Sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        /*
        * Selection Sorting is a sorting
        * 1 3 4 2 5 3 = Selection sorting works by looking at first number than going to next number to see if it's lower. if its lower than swap and put the index if not go to the next number.
        *  */

        int[] numbers = new int[10];
        Random random = new Random();
        for(int i =0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);

        }
        System.out.println(Arrays.toString(numbers));
        //Arrays.sort(numbers);
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    private static void selectionSort(int[] numbers) {
       //int length = numbers.length;
        // 1 3 4 5 6 3
        for(int i =0; i < numbers.length - 1 ; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for(int j = i + 1; j < numbers.length ; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i , indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a]; // temp = 89086
        numbers[a] = numbers[b]; // a= 15116
        numbers[b] = temp; // b = 89086
    }
}
