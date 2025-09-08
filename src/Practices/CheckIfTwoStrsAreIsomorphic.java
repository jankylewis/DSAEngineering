package Practices;

import java.util.HashMap;

public class CheckIfTwoStrsAreIsomorphic {

    public static void main(String[] args) {

        System.out.println(sol("paper", "tivle"));
    }

    static boolean sol(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> chars = new HashMap<>();

        for (int k = 0; k < str1.length(); k++) {

            if (chars.containsKey(str1.charAt(k))) {

                if (!(chars.get(str1.charAt(k)) == str2.charAt(k))) {
                    return false;
                }

                continue;
            }

            chars.put(str1.charAt(k), str2.charAt(k));
        }

        return true;
    }
}
