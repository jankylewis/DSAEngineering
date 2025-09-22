package Practices.Ez;

public class BuyAndSellStock {

    public static void main(String[] args) {

        System.out.println(sol(new int[] {7, 1, 5, 3, 6, 4}));
        System.out.println(sol(new int[] {7, 6, 4, 3, 1}));
    }

    static int sol(int[] arr) {

        int buy = arr[0];
        int maxProfit = 0;

        for (int idx = 1; idx < arr.length - 1; idx++) {

            if (arr[idx] < buy) {
                buy = arr[idx];
            }

            if (arr[idx] > buy) {
                if (arr[idx] - buy > maxProfit)
                    maxProfit = arr[idx] - buy;
            }
        }

        return maxProfit;
    }
}
