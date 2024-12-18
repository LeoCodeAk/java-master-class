package org.example.Searching;

import java.util.Arrays;

public class SelectionAndBinary {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 2, 8, 3, 9};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 3));
    }

    //1 2 3 4 5 3 5 3 2
    public static void selectionSort(int[] array) {
        //Sort the numbers of array in a selection sort
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexOfLowerNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexOfLowerNumber = j;
                }
            }
            int temp = array[indexOfLowerNumber];
            array[indexOfLowerNumber] = array[i];
            array[i] = temp;
        }
    }

    public static int binarySearch(int[] array, int numberToFind) {
        int lowPointer = 0;
        int highPointer = array.length - 1;

        // 1 2 3 4 5 6 7 , 5
        while (lowPointer <= highPointer) {
            int middleNumber = (lowPointer + highPointer) / 2;
            int middlePosition = array[middleNumber];
            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                highPointer = middlePosition - 1;
            } else {
                lowPointer = middlePosition + 1;
            }
        }
        return -1;
    }
}
