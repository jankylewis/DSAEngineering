package Practices;

/* Problem statement

Given an array of integers. We then move all 0 to the end of the array while maintaining the order relatively

Ex:
- Input: [0, 0, 1, 2, 0, 3]
- Output: [1, 2, 3, 0, 0, 0]

- Input: [0]
- Output: [0]

- Input: [1, 2]
- Output: [1, 2]

- Input: [0, 0, 1]
- Output: [1, 0, 0]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] ints1 = new int[] {0, 0, 1, 2, 0, 3};
        int[] ints2 = new int[] {0};
        int[] ints3 = new int[] {1, 2};

        System.out.println(Arrays.toString(sol2(ints2)));
    }

    static int[] sol2(int[] arr) {

        if (arr.length < 1)
            return new int[]{};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[right] == 0) {
                right--;
            }

            if (arr[left] == 0) {
                doSwap(arr, left, right);
                right--;
            }

            left++;
        }

        return arr;
    }

    static void doSwap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // Big O of O(2n) with 2 separate fors, no in-place
    static int[] sol1(int[] arr) {

        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                ints.add(arr[i]);
        }

        int zeroes = arr.length - ints.size();
        for (int k = 0; k < zeroes; k++) {
            ints.add(0);
        }

        return toArray(ints);
    }

    static int[] toArray(ArrayList<Integer> list) {

        int[] ints = new int[list.size()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = list.get(i);
        }

        return ints;
    }
}
