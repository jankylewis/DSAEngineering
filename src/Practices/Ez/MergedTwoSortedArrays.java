package Practices.Ez;

import java.util.Arrays;

public class MergedTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(
                Arrays.toString(
                        sol1(new int[] {4, 2, 1, 0, 0, 0, 0, 0}, 3, new int[] {1, 2, 3, 5, 6}, 5)));
    }

//    static int[] sol2(int[] nums1, int m, int[] nums2, int n) {
//
//        if (nums1.length < 1 && nums2.length < 1)
//            return null;
//
//        int times;
//
//        if (m == n)
//            times = n;
//        else if (m < n)
//            times = n;
//        else
//            times = m;
//
//        if (n == 0) {
//            doBubbleSort(nums1);
//            return nums1;
//        }
//
//        if (m != 0) {
//            for (int idx = 0; idx < times; idx++) {
//                nums1[times + idx] = nums2[idx];
//            }
//        }
//
//        if (m == 0) {
//            for (int idx = 0; idx < nums2.length; idx++) {
//                nums1[idx] = nums2[idx];
//            }
//        }
//
//        doBubbleSort(nums1);
//        return nums1;
//    }

    static int[] sol1(int[] nums1, int m, int[] nums2, int n) {

        for (int idx = 0; idx < n; idx++) {
            nums1[m + idx] = nums2[idx];
        }

        doBubbleSort(nums1);

        return nums1;
    }

    static void doBubbleSort(int[] nums) {

        boolean swapped = false;

        for (int i = 0; i < nums.length - 1; i++) {

            for (int k = 0; k < nums.length - 1 - i; k++) {

                if (nums[k] > nums[k + 1]) {
                    swap(nums, k, k + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
