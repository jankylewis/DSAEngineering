package Practices.Ez;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr2 = new int[]{3, 0, 1};
        int[] arr1 = new int[]{9,6,4,2,3,5,7,0,1};

        System.out.println(solution(arr1));
    }

    static int solution(int[] arr) {

        if (arr.length < 1) {
            return -1;
        }

        Arrays.sort(arr);

        int target = 0;

        for (int k = 1; k < arr.length; k++) {

            target += 1;

            if (arr[k] == target) {
                continue;
            }

            return target;
        }

        return -1;
    }
}
