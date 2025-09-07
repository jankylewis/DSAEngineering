package Practices;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sol(new int [] {2,7,11,15}, 9)));
    }

    static int[] sol(int[] arr, int target) {

        if (arr.length < 2)
            return null;

        for (int left = 0; left < arr.length; left++) {
            for (int right = 0; right < arr.length; right++) {

                if (left == right)
                    continue;

                if (arr[left] + arr[right] == target)
                    return new int[] { left + 1, right + 1};
            }
        }

        return null;
    }
}
