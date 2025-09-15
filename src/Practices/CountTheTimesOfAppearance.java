package Practices;

public class CountTheTimesOfAppearance {

    public static void main(String[] args) {
        System.out.println(sol(new int[] { 0, 1, 3, 1, 10, 1, 12 }, 1));
    }

    static int sol(int[] arr, int target) {

        int times = 0;

        for (int k : arr) {
            if (k == target)
                times++;
        }

        return times;
    }
}
