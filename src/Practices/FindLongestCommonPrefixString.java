package Practices;

// Given an array of strings like this: ["interspecies", "interstellar", "interstate"]
// Length from 1 to 200, all English letters in lowercase

import java.util.Arrays;
import java.util.List;

public class FindLongestCommonPrefixString {

    public static void main(String[] args){

        String[] strings = {"interspecies", "interstellar", "interstate"};
        System.out.println(getLongestCommonPrefix(strings));
    }

    static String getLongestCommonPrefix(String[] strs) {

        String longest = "";

        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        for (int idx = 0; idx < lastStr.length(); idx++) {

            if (firstStr.charAt(idx) == lastStr.charAt(idx)){
                longest += String.valueOf(firstStr.charAt(idx));
                continue;
            }

            return longest;
        }

        return longest;
    }
}
