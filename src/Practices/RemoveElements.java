package Practices;

public class RemoveElements {

    public static void main(String[] args) {

        System.out.println(sol2(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    static int sol2(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        return i;
    }

    static int sol1(int[] nums, int val) {

        int k = 0;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[right] == val) {
                right--;
                k++;
            }

            if (nums[left] == val) {

                nums[left] = nums[right];
                nums[right] = val;

                left++;
                right--;

                k++;

                continue;
            }

            left++;
        }

        return nums.length - k;
    }
}
