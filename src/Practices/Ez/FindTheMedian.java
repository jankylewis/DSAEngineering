package Practices.Ez;

import java.util.Arrays;

public class FindTheMedian {

    public static void main(String[] args) {

        System.out.println(sol(new int[] { 1, 2, 3 }, new int[] { 4, 5 }));
    }

    static double sol(int[] nums1, int[] nums2) {

        int[] mergedArr = mergeTwoSortedArrs(nums1, nums2);

        boolean isEven = mergedArr.length %2 == 0;

        int left = 0;
        int right = mergedArr.length - 1;

        // Case being even
        if (isEven) {

            while (right - left > 2) {
                left++;
                right--;
            }

            return (mergedArr[left] + mergedArr[right]) / 2.0;
        }

        // Case being odd
        while (right - left > 2) {
            left++;
            right--;
        }

        return mergedArr[left + 1];
    }

    static int[] mergeTwoSortedArrs(int[] nums1, int[] nums2) {

        int[] mergedSortedArr = new int[nums1.length + nums2.length];

        for (int k = 0; k < nums1.length; k++) {
            mergedSortedArr[k] = nums1[k];
        }

        for (int k = 0; k < nums2.length; k++) {
            mergedSortedArr[k + nums1.length] = nums2[k];
        }

        Arrays.sort(mergedSortedArr);

        return mergedSortedArr;
    }
}
