package Practices;

//Problem 392
public class IsSubsequence {

    public static void main(String[] args) {

//        System.out.println(sol1("abc", "shacb"));
        System.out.println(sol2("abc", "appopopobc"));
    }

    // O(n)
    static boolean sol2(String str1, String str2) {

        int k1 = 0;
        int k2 = 0;

        while (k1 < str1.length() && k2 < str2.length()) {

            if (str1.charAt(k1) == str2.charAt(k2))
                k1++;

            k2++;
        }

        return k1 == str1.length();
    }

    // O(n^2)
    static boolean sol1(String str1, String str2) {

        int k2 = 0;
        String temp = "";

        for (int k1 = 0; k1 < str1.length(); k1++) {

            while (k2 < str2.length()) {

                if (str2.charAt(k2) == str1.charAt(k1)) {
                    temp += str2.charAt(k2);
                    break;
                }

                k2++;
            }
        }

        return temp.equals(str1);
    }
}
