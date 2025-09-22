package Practices.Ez;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(sol("madam"));
    }

    static boolean sol(String str) {

        boolean isValidPalindrome = false;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) == str.charAt(right))
                isValidPalindrome = true;

            left++;
            right--;
        }

        return isValidPalindrome;
    }
}
