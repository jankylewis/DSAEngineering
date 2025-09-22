package Practices.Ez;

import java.util.ArrayList;
import java.util.HashMap;

public class FindUniqueElements {

    public static void main(String[] args) {

        System.out.println(sol(new int[] { 5, 5, 2, 1, 1, 3 } ));
    }

    static ArrayList<Integer> sol(int[] arr) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int k : arr) {

            if (!numMap.containsKey(k)) {
                numMap.put(k, 1);
                continue;
            }

            numMap.put(k, numMap.get(k) + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int k : numMap.keySet()) {

            if (numMap.get(k) == 1)
                res.add(k);
        }

        return res;
    }
}
