package Practices.Ez;

/*

Given an array with n elements, do swapping k elements to the beginning of the array
Ex goes here:
Input: [1, 2, 3, 4, 5, 6], while k = 3
Output: [4, 5, 6, 1, 2, 3]

 */

import java.util.Arrays;

public class RotateAnArrayWithK {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sol1(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 8)));
    }

    static int[] sol1(int[] arr, int k) {

        int[] newArr = new int[arr.length];

        // Add the rotated ones
        for (int idx = 0; idx < k; idx++) {
            newArr[idx] = arr[(arr.length - k + idx)];
        }

        for (int idx = k; idx < arr.length; idx++) {
            newArr[idx] = arr[idx - k];
        }

        // Continue adding the remaining ones

        return newArr;
    }
}
