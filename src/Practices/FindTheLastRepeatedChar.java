package Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindTheLastRepeatedChar {

    public static void main(String[] args) {

        System.out.println(getLastRepeatedChar("qwertyqe"));
    }

    static String getLastRepeatedChar(String str) {

        List<Character> chars = new ArrayList<>();
        Stack<Character> charStack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (checkIfExist(ch, chars)) {
                charStack.push(ch);
            }

            chars.add(ch);
        }

        return charStack.pop().toString();
    }

    static boolean checkIfExist(char ch, List<Character> chars) {

        if (chars.isEmpty())
            return false;

        for (Character l_ch : chars) {
            if (ch == l_ch)
                return true;
        }

        return false;
    }
}
