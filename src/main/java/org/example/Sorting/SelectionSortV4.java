package org.example.Sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortV4 {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for(int i =0; i < array.length; i++) {
            array[i] = random.nextInt(2000);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    //1 3 2 4 2 3
    private static void selectionSort(int[] array) {

        for (int i =0; i < array.length - 1; i++) {
            int minNumber = array[i];
            int indexNumber = i;

            for(int j = i + 1; j < array.length; j++ ) {
                if(array[j] < minNumber) {
                    minNumber = array[j];
                    indexNumber = j;
                }
            }
            int temp = array[indexNumber];
            array[indexNumber] = array[i];
            array[i] = temp;
        }
    }
}
