package Practices.Ez;

import java.util.Objects;
import java.util.Stack;

public class Debugger {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    static boolean isValid(String str) {

        if (str.length() < 2 || Objects.equals(String.valueOf(str.charAt(0)), ")")
                || Objects.equals(String.valueOf(str.charAt(0)), "]") || Objects.equals(String.valueOf(str.charAt(0)), "]"))
        return false;

        Stack<Character> chars = new Stack<>();

        for (int k = 0; k < str.length(); k++) {

            Character currentChar = str.charAt(k);

            if (Objects.equals(String.valueOf(currentChar), "(") || Objects.equals(String.valueOf(currentChar), "[") || Objects.equals(String.valueOf(currentChar), "{")) {
                chars.push(currentChar);
                continue;
            }

            Character charFromStack = chars.pop();


            if (Objects.equals(String.valueOf(charFromStack), "(")) {
                if (Objects.equals(String.valueOf(currentChar), "}") || Objects.equals(String.valueOf(currentChar), "]")) {
                    return false;
                }

                continue;
            }
            if (Objects.equals(String.valueOf(charFromStack), "[")) {
                if (Objects.equals(String.valueOf(currentChar), "}") || Objects.equals(String.valueOf(currentChar), ")")) {
                    return false;
                }

                continue;
            }

            if (Objects.equals(String.valueOf(charFromStack), "{")) {
                if (Objects.equals(String.valueOf(currentChar), "]") || Objects.equals(String.valueOf(currentChar), ")")) {
                    return false;
                }
            }
        }

//        String x = (">>".charAt(0)).e ")"

        return true;
    }
}
