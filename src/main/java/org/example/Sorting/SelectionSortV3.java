package org.example.Sorting;

import java.util.Arrays;

public class SelectionSortV3 {
    public static void main(String[] args) {

        int array[] = { 5, 4, 3, 2, 1, 3};
        for(int i =0; i < array.length; i++) {
            int numbers = array[i];
            System.out.print(numbers + " ");
        }
        System.out.println();
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    // 1 3 2 4 3 4
    public static void selectionSort(int[] numbers) {

        for(int i =0; i < numbers.length - 1 ; i++) { //For loop to iterate array
            int min = numbers[i]; // Set min to the first number in array
            int indexToRemember = i; // set the index to i .. number that is being iterated
            for(int j = i + 1; j < numbers.length; j++) { //second for loop to go to the second number of the array
                if(numbers[j] < numbers[i]) { // if statement to check if 2 number is less then first number
                    min = numbers[j]; //if 2nd number is less then first number then make the second number the min
                    indexToRemember = j; // set the position that is the less numb to indexToRemember for swapping
                }
            }
            int temp = numbers[i]; //to swap create temp variable to hold the first number
            numbers[i] = numbers[indexToRemember]; //set the first number to the number that is smaller that was remembered in indexToRemember
            numbers[indexToRemember] = temp; //set the indexRemember the number that was smaller to temp which is the bigger number
        }

    }
}
