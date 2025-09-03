package Practices;

// Number 28
import java.util.ArrayList;

public class FindIndexOfFirstOccurrence {

    public static void main(String[] args) {

        for (int idx : sol("sadnotsad", "sad")) {
            System.out.println(idx);
        }
    }

    // Return the array of indexes of occurrence
    static ArrayList<Integer> sol(String str1, String str2) {

        ArrayList<Integer> indexesOfOcc = new ArrayList<>();

        for (int idx = 0; idx < str1.length();) {

            int k2 = 0;
            if (str1.charAt(idx) == str2.charAt(k2)) {

                k2 += 1;
                boolean occurred = false;

                for (int k1 = idx + 1; k1 < (idx + str2.length()); k1++) {

                    occurred = false;

                    if (str1.charAt(k1) == str2.charAt(k2)) {
                        occurred = true;
                    }

                    k2++;
                }

                if (occurred) {
                    indexesOfOcc.add(idx);
                    idx += str2.length();
                    continue;
                }
            }

            idx++;
        }

        return indexesOfOcc;
    }
}
