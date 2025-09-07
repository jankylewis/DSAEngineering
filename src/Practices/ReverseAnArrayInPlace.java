package Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArrayInPlace {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(sol1WithIntegers(new int[] {1, 2, 3, 4, 5})));
        System.out.println(sol2WithStrings(new String[] {"f", "l", "p", "q"}));
    }

    static ArrayList<String> sol2WithStrings(String[] arr) {

        ArrayList<String> newStrings = new ArrayList<>();

        for (int k = arr.length - 1; k >= 0; k--) {
            newStrings.add(arr[k]);
        }

        return newStrings;
    }

    // O(n), two pointers, in-place rearrangement
    static int[] sol1WithIntegers(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            doSwapping(arr, left, right);

            left++;
            right--;
        }

        return arr;
    }

    static void doSwapping(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
