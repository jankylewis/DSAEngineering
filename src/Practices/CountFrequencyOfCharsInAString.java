package Practices;

import java.util.HashMap;

public class CountFrequencyOfCharsInAString {

    public static void main(String[] args) {

        System.out.println(sol("hello"));
    }

    static HashMap<Character, Integer> sol(String str) {

        HashMap<Character, Integer> frequencies = new HashMap<>();

        for (int k = 0; k < str.length(); k++) {

            if (!frequencies.containsKey(str.charAt(k))) {
                frequencies.put(str.charAt(k), 1);
                continue;
            }

            frequencies.put(str.charAt(k), frequencies.get(str.charAt(k)) + 1);
        }

        return frequencies;
    }
}
