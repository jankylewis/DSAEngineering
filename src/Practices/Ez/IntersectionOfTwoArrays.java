package Practices.Ez;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sol(new int[] { 2, 3, 5, 1 }, new int[] { 3, 2 } )));
    }

    static int[] sol(int[] arr1, int[] arr2) {

        HashSet<Integer> res = new HashSet<>();

        for (int k1 = 0; k1 < arr1.length; k1++) {
            for (int k2 = 0; k2 < arr2.length; k2++) {
                if (arr1[k1] == arr2[k2]) {
                    res.add(arr1[k1]);
                }
            }
        }

        return setToArr(res);
    }

    static int[] setToArr(HashSet<Integer> nums) {

        int[] arr = new int[nums.size()];

        int k = 0;
        for (int num : nums) {
            arr[k++] = num;
        }

        return arr;
    }
}
