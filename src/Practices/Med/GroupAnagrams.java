package Practices.Med;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
 
    public static void main(String[] args) {

        System.out.println(sol1(new ArrayList<String>(Arrays.asList(
            "listen", "silent", "enlist", "google", "gogole", "abc", "cab", "bac"))));
    
        System.out.println(sol1(new ArrayList<String>(Arrays.asList(
            "rat", "tar", "art", "star", "tars", "cheese"))));

        System.out.println(sol1(new ArrayList<String>(Arrays.asList(
            "xyz", "zyx", "zxy", "yxz", "123", "231", "312"))));

        System.out.println(sol1(new ArrayList<String>(Arrays.asList(
            "moon", "noom", "onom", "nom", "mon"))));

        System.out.println(sol1(new ArrayList<String>(Arrays.asList(
            "", "", "a", "aa", "bb", "ab", "ba"))));
    }

    static ArrayList<ArrayList<String>> sol1(ArrayList<String> strList) {
        
        ArrayList<ArrayList<String>> res = new ArrayList<>();

        int head = 0;
        while (!strList.isEmpty()) {

            ArrayList<String> currentAnagramChecks = new ArrayList<>();
            
            String currentHead = strList.get(head);
            currentAnagramChecks.add(currentHead);

            for (int k = 0; k < strList.size(); k++) {

                if (head == k)
                    continue;
    
                String currentCheck = strList.get(k);                

                if (isAnagram(currentHead, currentCheck))
                    currentAnagramChecks.add(currentCheck);
            }

            res.add(currentAnagramChecks);
            strList.removeAll(currentAnagramChecks);
        }

        return res;
    }

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        HashMap<String, Integer> map1 = new HashMap<>();
        for (int k = 0; k < str1.length(); k++) {

            String currentChar = String.valueOf(str1.charAt(k));

            if (!map1.containsKey(currentChar)) {
                map1.put(currentChar, 1);
                continue;
            }

            map1.put(currentChar, map1.get(currentChar) + 1);
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        for (int k = 0; k < str2.length(); k++) {

            String currentChar = String.valueOf(str2.charAt(k));

            if (!map2.containsKey(currentChar)) {
                map2.put(currentChar, 1);
                continue;
            }

            map2.put(currentChar, map2.get(currentChar) + 1);
        }

        return map1.equals(map2);
    }
}
