package Practices.Ez;

import java.util.Arrays;
import java.util.List;

public class FindLargestOfAllDimensions {

    public static void main(String[] args) {

        List<List<Integer>> numLists = List.of(
                Arrays.asList(4, 6, -2),
                Arrays.asList(11, 2, -1),
                Arrays.asList(15, 12, 6)
        );

        System.out.printf(String.valueOf(findLargest(numLists)));
    }

    // Find the largest of all dimensions
    static int findLargest(List<List<Integer>> numLists) {

        int max = 0;

        for (int fIdx = 0; fIdx < numLists.size(); fIdx++) {
            for (int num : numLists.get(fIdx)) {

                if (num > max)
                    max = num;
            }
        }

        return max;
    }
}
