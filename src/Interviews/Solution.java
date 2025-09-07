package Interviews;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sol(new int[] { 0, 4, 0, 2, 3, 0, 1, 0 })));
    }

    // Two-pointer approach
    // O(n) of Time Compl as we just used a single while
    // O(1) of Space Compl as we just used a couple of variables keeping track our information
    static int[] sol(int[] arr) {

        int left = 0;
        int right = 0;

        while (left != arr.length - 1) {

            // Last actions replacing all the remaining ones to Zero
            if (right == arr.length - 1) {
                arr[left] = 0;
                left++;

                continue;
            }

            if (arr[right] == 0) {
                right++;
            }

            if (arr[right] != 0) {
                arr[left] = arr[right];
                left++;
                right++;
            }
        }

        return arr;
    }
}
