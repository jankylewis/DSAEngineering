package Practices;

public class FindEquilibrium {

    public static void main(String[] args) {

        System.out.println(sol(new int[] { -7, 1, 5, 2, -4, 3, 0 }));
        System.out.println(sol(new int[] { 2, 4, 6 }));
        System.out.println(sol(new int[] { 1, 3, 5, 2, 2 }));
        System.out.println(sol(new int[] { 0 }));
        System.out.println(sol(new int[0] ));
    }

    static int sol(int[] nums) {

        if (nums.length < 1)
            return -1;

        int totalSum = 0;

        // Calculate total sum
        for (int k = 0; k < nums.length; k++)
            totalSum += nums[k];

        int leftSum = 0;

        for (int k = 0; k < nums.length; k++) {

            int rightSum = totalSum - leftSum - nums[k];

            if (leftSum == rightSum)
                return k;

            leftSum += nums[k];
        }

        return -1; // Case we dont find any equilibrium
    }
}
