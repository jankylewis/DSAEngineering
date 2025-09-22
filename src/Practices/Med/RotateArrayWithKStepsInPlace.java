package Practices.Med;

import java.util.Arrays;

public class RotateArrayWithKStepsInPlace {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sol(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));
    }

    static int[] sol(int[] arr, int k) {

        // Rotate the entire arr
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {  
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Rotate the first k elements
        left = 0;
        right = k - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // Rotate the remaining after the first k elements
        left = k;
        right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }

        return arr;
    }
}
