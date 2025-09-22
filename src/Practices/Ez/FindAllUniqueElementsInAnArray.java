package Practices.Ez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindAllUniqueElementsInAnArray {

    public static void main(String[] args) {

        System.out.println(sol(new int[] { 1, 1, 0, 0, 3, 9, 3, 5 })); //  [9, 5]
    }

    static ArrayList<Integer> sol(int[] arr) {

        LinkedHashMap<Integer, Integer> nums = new LinkedHashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        // The first loop to fulfill data into the nums
        for (int k = 0; k < arr.length; k++) {

            if (!nums.containsKey(arr[k])) {
                nums.put(arr[k], 1);
                continue;
            }

            nums.put(arr[k], nums.get(arr[k]) + 1);
        }

        for (int num : nums.keySet()) {

            if (nums.get(num) == 1) {
                res.add(num);
            }
        }

        return res;
    }
}
