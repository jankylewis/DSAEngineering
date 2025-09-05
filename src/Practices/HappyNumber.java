package Practices;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }

    // >= O(n^2)
    static boolean isHappy(int n) {

        if (n < 10) {
            return false;
        }

        String sumStr = String.valueOf(n);

        while (true) {

            int sumInt = 0;

            for (int k = 0; k < sumStr.length(); k++) {
                sumInt += toInt(sumStr.charAt(k)) * toInt(sumStr.charAt(k));
            }

            sumStr = String.valueOf(sumInt);

            if (sumInt == 1) {
                return true;
            }
        }
    }

    static int toInt(char ch) {
        return Integer.parseInt(String.valueOf(ch));
    }
}
