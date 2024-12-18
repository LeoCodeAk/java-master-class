package org.example.Sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortV2 {
    public static void main(String[] args) {
        /*
        * Selection Sort is sorting left to right. Looking at first number in array then going in order from left to right to find the next smallest number.
        * For loop for the array. Create a min variable w fist element in array. Also create a Index variable to keep track of the variable.
        * Check if element a is less than element b. If it is less than swap the numbers
        *  */

        int[] numbersArray = new int[10];
        Random random = new Random();
        for(int i =0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbersArray));
        selectionSort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
    }

    private static void selectionSort(int[] numbersArray) {
        int length = numbersArray.length;

        // 1 3 4 3 5 3 5
        for(int i =0; i < length - 1; i++) {
            int min = numbersArray[i];
            int indexToRemember = i;
            for(int j = i + 1; j < length; j++) {
                if(numbersArray[j] < min) {
                    min = numbersArray[j];
                    indexToRemember = j;
                }
            }
            swap(numbersArray, i, indexToRemember);
        }

    }

    private static void swap(int[] numbersArray, int i, int indexToRemember) {
        int temp = numbersArray[i];
        numbersArray[i] = numbersArray[indexToRemember];
        numbersArray[indexToRemember] = temp;
    }


}
