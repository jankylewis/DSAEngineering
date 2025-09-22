package Practices.Ez;

import java.util.HashMap;

public class FirstUniqueChar {

    public static void main(String[] args) {

        System.out.println(sol("aabb"));
    }

    static int sol(String str) {

        if (str.isEmpty())
            return -1;

        HashMap<String, Integer> strings = new HashMap<>();

        for (int k = 0; k < str.length(); k++) {

            String currentChar = String.valueOf(str.charAt(k));

            if (!strings.containsKey(currentChar)) {
                strings.put(currentChar, 1);
                continue;
            }

            strings.put(currentChar, strings.get(currentChar) + 1);
        }

        for (int k = 0; k < str.length(); k++) {

            String currentChar = String.valueOf(str.charAt(k));

            if (strings.containsKey(currentChar) && strings.get(currentChar) == 1) {
                return k;
            }
        }

        return -1;
    }
}
