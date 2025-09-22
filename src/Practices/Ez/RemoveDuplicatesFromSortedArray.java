package Practices.Ez;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sol1(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4})));
    }

    static Object[] sol1(int[] arr) {

        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int idx = 0; idx < arr.length; idx++) {

            if (!intMap.containsKey(arr[idx])) {
                intMap.put(arr[idx], 1);
                continue;
            }

            intMap.put(arr[idx], (intMap.get(arr[idx]) + 1));
        }

        return intMap.keySet().toArray();
    }
}
