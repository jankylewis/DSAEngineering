package Practices.Ez;

import java.util.HashMap;

public class ContainDuplicates {

    public static void main(String[] args) {

        int[] arr1 = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        int[] arr2 = new int[] {1, 2};

        System.out.println(sol(arr1));
    }

    static boolean sol(int[] arr) {

        HashMap<Integer, Integer> ints = new HashMap<>();

        for (int k = 0; k < arr.length; k++) {

            if (!ints.containsKey(arr[k])) {
                ints.put(arr[k], 1);
                continue;
            }

            return false;
        }

        return true;
    }
}
