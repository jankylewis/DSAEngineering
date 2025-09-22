package Practices.Ez;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sol2(new int[]{2, 7, 11, 13}, 9)));
        Arrays.sort(new int[] {1, 2});
    }

    // O(n)
    static int[] sol2(int[] in_arr, int in_target) {

        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int k = 0; k < in_arr.length; k++) {

            int remain = in_target - in_arr[k];

            if (nums.containsKey(remain)) {
                return new int[] {nums.get(remain), k};
            }

            nums.put(in_arr[k], k);
        }

        return new int[] {-1};
    }

    // O(n) + O(n^2)
    static int[] sol1(int[] in_arr, int in_target) {

        HashMap<Integer, Integer> nums = new HashMap<>();

        // A for making a HashMap to store numbers and indexes
        for (int k = 0; k < in_arr.length; k++) {
            nums.put(in_arr[k], k);
        }

        // 2 nested fors
        for (int k1 = 0; k1 < in_arr.length; k1++) {
            for (int k2 = 0; k2 < in_arr.length; k2++) {

                if (k1 == k2)
                    continue;

                if (in_arr[k1] + in_arr[k2] == in_target) {
                    return new int[] { nums.get(in_arr[k1]), nums.get(in_arr[k2]) };
                }
            }
        }

        return new int[] {-1};
    }
}
