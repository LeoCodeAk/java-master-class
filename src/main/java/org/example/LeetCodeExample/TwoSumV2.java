package org.example.LeetCodeExample;

import java.util.HashMap;

public class TwoSumV2 {
    public static void main(String[] args) {

        int[] array = {2,4,5,6};
        int target = 9;

        int[] result = twoHashSum(array,target);
        System.out.println("The Indexs are: " + result[0] + " and " + result[1]);
        System.out.println("The numbers are: " + array[result[0]] + " and "+ array[result[1]]);
    }

    //{2, 4, 5, 6} [9]
    //In a given array ... find the two indexes of two numbers in the array when added equal the target
    public static int[] twoHashSum(int[] nums, int target) {

        HashMap<Integer, Integer> complements = new HashMap<>();
        for(int i =0; i < nums.length;i++) {
            complements.put(target-nums[i], i);
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null) {
                return new int[]{complementIndex, i};
            }

        }
        return nums;
    }

}
