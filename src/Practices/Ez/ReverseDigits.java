package Practices.Ez;

public class ReverseDigits {

    public static void main(String[] args) {

        System.out.println(sol(-900));
        System.out.println(sol(-12345));
        System.out.println(sol(77498999));
    }

    static int sol(int digit) {

        boolean isNegative = digit < 0;

        String res = "";

        String str = isNegative ? String.valueOf(digit).replace("-", "") : String.valueOf(digit);

        for (int k = str.length() - 1; k >= 0; k--) {
            res += str.charAt(k);
        }

        if (isNegative)
            return Integer.parseInt("-" + res);

        return Integer.parseInt(res);
    }
}
