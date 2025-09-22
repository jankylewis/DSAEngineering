package Practices.Ez;

public class ReverseWordsInASentence {

    public static void main(String[] args) {

        System.out.println(sol1("I Love Java"));
    }

    static String sol1(String str) {

        String res = "";

        String[] splittedStrs = str.split(" ");

        for (int k = splittedStrs.length - 1; k >= 0; k--) {
            res += splittedStrs[k] + " ";
        }

        return res;
    }
}
