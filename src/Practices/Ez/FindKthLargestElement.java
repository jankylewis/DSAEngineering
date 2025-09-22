package Practices.Ez;

import java.util.Arrays;

public class FindKthLargestElement {

    public static void main(String[] args) {

//        System.out.println(sol(new int[] { 5, 4, 1, 2 }, 2));
//        System.out.println(sol(new int[] { 7, 10, 4, 3, 20, 15 }, 3));
        System.out.println(sol(new int[] { 100, 200, 300, 400, 500 }, 1));
    }

    static int sol(int[] arr, int k) {

        Arrays.sort(arr);

        int res = 0;

        for (int k1 = arr.length - 1; k1 >= arr.length - k; k1--) {
            res = arr[k1];
        }

        return res;
    }
}
