package Practices.Med;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDupsInArrayInPlace {
    
    public static void main(String[] args) {
        System.out.println(sol1(new int[] { 4,3,2,7,8,2,3,1 }));
        System.out.println(sol1(new int[] { 1, 1, 2 }));
        System.out.println(sol1(new int[] { 1 }));
        System.out.println(sol1(new int[] { 2,2,3,3,3,4,5,5,5,5 }));
    }

    static ArrayList<Integer> sol1(int[] arr) {
        
        Arrays.sort(arr);

        ArrayList<Integer> res = new ArrayList<>();

        for (int k1 = 0; k1 < arr.length - 1; k1++) {

            int k2 = k1 + 1;

            int currentInt = arr[k1];
            int nextInt = arr[k2];

            if (currentInt == nextInt) {
                if (res.isEmpty() || res.get(res.size() - 1) != currentInt)
                    res.add(currentInt);
            }
        }

        return res;        
    }

    static ArrayList<Integer> sol2(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> res = new ArrayList<>();

        for (int k1 = 0; k1 < arr.length - 1; k1++) {

            int k2 = k1 + 1;

            int currentInt = arr[k1];
            int nextInt = arr[k2];

            if (currentInt == nextInt && !res.contains(currentInt))
                res.add(currentInt);
        }

        return res;
    }
}
