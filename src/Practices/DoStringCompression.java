package Practices;

import java.util.LinkedHashMap;

public class DoStringCompression {

    public static void main(String[] args) {

        System.out.println(sol1(new char[] { 'a','a','b','b','c','c','c' }));
    }

    // Time compl: O(n) + O(n) = O(2n) = O(n)
    // Space compl: O(n) + O(n) = O(2n) = O(n)
    static int sol1(char[] characters) {

        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        // Fulfill the charMap
        for (Character character : characters) {

            if (!charMap.containsKey(character)) {
                charMap.put(character, 1);
                continue;
            }

            charMap.put(character, charMap.get(character) + 1);
        }

        String[] charArr = new String[charMap.size() * 2];

        int k = 0;
        for (Character str : charMap.keySet()) {

            charArr[k] = String.valueOf(str);
            k += 1;

            charArr[k] = String.valueOf(charMap.get(str));
            k += 1;
        }

        return charArr.length;
    }
}
