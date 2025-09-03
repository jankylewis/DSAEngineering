package Practices;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(sol2("listen", "silent"));
    }

    // Use one more array: O(n) + O(n^2) = O(n^2) for time compl, O(n) for space compl
    static boolean sol2(String str1, String str2) {

        boolean isValidAnagram = false;

        if (str1.length() != str2.length())
            return isValidAnagram;

        String[] str1Chars = new String[str1.length()];

        for (int k = 0; k < str1.length(); k++)
            str1Chars[k] = String.valueOf(str1.charAt(k));

        for (int k1 = 0; k1 < str1Chars.length; k1++) {

            for (int k2 = 0; k2 < str2.length(); k2++) {

                isValidAnagram = false;

                if (String.valueOf(str2.charAt(k2)).equals(str1Chars[k1])) {
                    isValidAnagram = true;
                    break;
                }
            }

            if (!isValidAnagram)
                return false;
        }

        return true;
    }

    // Single loop
    static boolean sol1(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        boolean isValidAnagram = false;

        for (int k = 0; k < str1.length(); k++) {

            isValidAnagram = false;

            if (!str2.contains(String.valueOf(str1.charAt(k))))     // Time compl?
                break;

            isValidAnagram = true;
        }

        return isValidAnagram;
    }
}
