package org.example.LeetCodeExample;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {4, 3, 6, 5, 7, 10};
        int target = 15;

        int[] result = twoHashSum(array, target);
        System.out.println("Indicies: " + result[0] + ", " + result[1]);
        System.out.println("Numbers: " + array[result[0]] + ", " + array[result[1]]);

    }

    //Anytime there is a nested for loop .. Quadratic time complexity O^n^2 ...
    //Brute Force

            //    public int[] twoSum(int[] nums, int target) {
            //        for (int i = 0; i < nums.length; i++) {
            //            for (int j = i + 1; j < nums.length; j++) {
            //                if (nums[i] + nums[j] == target) {
            //                    return new int[]{i, j};
            //                }
            //            }
            //        }
            //        return nums;
            //    }

    //Hashmap is just a collection nof Key-Value pair ... K -> V
    //iterate through array one time.. store the number we have to add to get target which will be the Key
    // {5, 2, 4} --
    /*
     * HashMap.
     * K -> V
     * 1 -> 0
     * 4 -> 1
     *
     * */

    //{2, 7, 11, 15} ; 9..
//    public static int[] twoHashSum(int[] nums, int target) {
//        Map<Integer, Integer> complementsAndIndex = new HashMap<>(); //Create a Key-Value Hash Map
//        for (int i = 0; i < nums.length; i++) { //Loop through the nums array
//            complementsAndIndex.put(target - nums[i], i); //add a key-value pair to hashman.. key being the complement and i being the index
//            Integer complementIndex = complementsAndIndex.get(nums[i]);// Creates variable that gets value if key exists
//            if (complementIndex != null) { //check to see if the complement exists
//                return new int[]{i, complementIndex}; //return the array with the index if it exists
//            }
//
//        }
//        return nums;
//    }

    //{2,7,11,15}
    //9-2 = 7 , 0 hashmap<7,0> ...get(nums{7]) -- value = 0..returns new int Array{2,0}




// { 4, 3, 6, 5, 7, 10} target = 15
    //complement<> = (9,0)
    //complement<> = (12,1)
    //complement<> = (9,2)
    //complement<> = (10,3)
    //complement<> = (8,4)
    //complement<> = (5,5)
    public static int[] twoHashSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        for(int i =0; i < nums.length;i++) {
            complements.put(target - nums[i], i);
            Integer getComplement = complements.get(nums[i]); //get(nums[i]) = 3
            if(getComplement != null) {
                return new int[]{getComplement, i}; //{3,5}
            }
        }
        return nums;
    }











}
