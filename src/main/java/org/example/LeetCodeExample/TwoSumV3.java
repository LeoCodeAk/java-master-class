package org.example.LeetCodeExample;

import java.util.HashMap;

public class TwoSumV3 {

    public static void main(String[] args) {

    }
    public static int[] HashMapTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementsAndIndex = new HashMap<>();
        for(int i =0;i<nums.length;i++) {
            complementsAndIndex.put(target-nums[i], i);
            Integer complement = complementsAndIndex.get(nums[i]);
            if(complement != null) {
                return new int[]{complement, i};
            }
        }
        return nums;
    }
}
