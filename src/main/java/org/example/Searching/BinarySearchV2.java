package org.example.Searching;

public class BinarySearchV2 {
    /*
    * Binary search... array has to be sorted. Create two pointers. One low and one high. You find the middle position of the pointer and do if statements regarding the conditional of the search.
    * */
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 8, 19, 23, 43, 54, 64};

        System.out.println(BinarySearch(array, 19));
    }

    public static int BinarySearch(int[] array, int numberToFind) {
        int lowPointer = 0;
        int highPointer = array.length -1;

        while(lowPointer <= highPointer) {
            int middlePosition = (lowPointer + highPointer) / 2; //
            int middleNumber = array[middlePosition]; // 8

            if(numberToFind == middleNumber) {
                return middlePosition; //Return the index if found
            }

            if(numberToFind < middleNumber) {
                highPointer = middlePosition - 1; //Search in left half
            }
            if(numberToFind > middleNumber) {
                lowPointer = middlePosition + 1; //Search in right half
            }
        }

        return -1;
    }
}
