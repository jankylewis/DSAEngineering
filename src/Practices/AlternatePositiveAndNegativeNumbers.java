package Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveAndNegativeNumbers {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sol(new int[] { 1, -2, 3, -4, -5, 6, 7, 1, -2, 3, -4, -5, 6, 7 })));
    }

    static int[] sol(int[] arr) {

        ArrayList<Integer> nums = new ArrayList<>();

        ArrayList<Integer> positiveNums = new ArrayList<>();
        ArrayList<Integer> negativeNums = new ArrayList<>();

        for (int k = 0; k < arr.length; k++) {

            if (arr[k] >= 0) {
                positiveNums.add(arr[k]);
                continue;
            }

            negativeNums.add(arr[k]);
        }

        while (positiveNums.size() != 0 || negativeNums.size() != 0) {

            if (positiveNums.size() > 0) {
                nums.add(positiveNums.get(0));
                positiveNums.remove(positiveNums.get(0));
            }

            if (negativeNums.size() > 0) {
                nums.add(negativeNums.get(0));
                negativeNums.remove(negativeNums.get(0));
            }
        }

        return nums.stream().mapToInt(a_num -> a_num).toArray();
    }
}
