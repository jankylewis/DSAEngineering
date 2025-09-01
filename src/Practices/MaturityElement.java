package Practices;

import java.util.HashMap;
import java.util.Set;

public class MaturityElement {

    public static void main(String[] args) {

        System.out.println(sol1(new int[] {2,2,1,1,1,2,2}));
    }

    static int sol1(int[] arr) {

        int times = 0;
        int avgOfAppearances = arr.length / 2;

        HashMap<Integer, Integer> appearanceMap = new HashMap<>();

        for (int idx : arr) {

            if (!appearanceMap.containsKey(idx)) {
                appearanceMap.put(idx, 1);
                continue;
            }

            appearanceMap.put(idx, appearanceMap.get(idx) + 1);
        }

        Set<Integer> apperanceSet = appearanceMap.keySet();

        for (int app : apperanceSet) {
            if (appearanceMap.get(app) > times) {
                times = appearanceMap.get(app);
            }
        }

        if (times > avgOfAppearances)
            return times;

        return -1;
    }
}
