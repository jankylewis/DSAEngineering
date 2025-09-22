package Practices.Ez;

public class ReverseAStringInPlace {

    public static void main(String[] args) {

        System.out.println(sol("a1b2"));        //  2b1a
    }

    static String sol(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            str = doSwapping(str, left, right);
            left++;
            right--;
        }

        return str;
    }

    static String doSwapping(String str, int idx1, int idx2) {

        char[] chars = str.toCharArray();

        char temp = chars[idx1];
        chars[idx1] = chars[idx2];
        chars[idx2] = temp;

        String swapped = new String(chars);
        return swapped;
    }
}
