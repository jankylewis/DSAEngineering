package Practices.Ez;

import java.util.HashMap;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(sol("abba", "dog cat cat dog"));
    }

    static boolean sol(String str1, String str2) {

        String[] splittedStrs = str2.split(" ");

        if (str1.length() != splittedStrs.length)
            return false;

        HashMap<String, String> matches = new HashMap<>();

        for (int k = 0; k < str1.length(); k++) {

            String currentChar = String.valueOf(str1.charAt(k));

            if (!matches.containsKey(currentChar)) {
                matches.put(currentChar, splittedStrs[k]);
                continue;
            }

            if (!splittedStrs[k].equals(matches.get(currentChar))) 
                return false;
        }

        return true;
    }
}
