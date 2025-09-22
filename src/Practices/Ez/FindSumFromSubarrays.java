package Practices.Ez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*

Given an array of integers and a number k, returning all contiguous subarrays having a sum equal to k
For ex:
Input: [1, 2, 3], k = 3
Output [1, 2], [3]

 */

public class FindSumFromSubarrays {

    public static void main(String[] args) {
//        System.out.println("Sol 1: " + sol1(new int[]{5, 2, 3, 1}, 5));
        System.out.println("Sol 2: " + sol2(new int[]{5, 2, 3, 1}, 5));
    }

    public static int sol2(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: empty prefix

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // If (prefixSum - k) exists, we found subarrays ending at current position
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }

            // Update count of current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    static List<List<Integer>> sol1(int[] nums, int k) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum == k) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int idx = i; idx <= j; idx++) {
                        subarray.add(nums[idx]);
                    }
                    res.add(subarray);
                }
            }
        }

        return res;
    }
}
