package DDA;

import java.util.*;

public class Knapsack {

    public static void main(String[] args) {
        int[] profit = {10, 30, 21, 30, 26};
        int[] weight = {3, 5, 5, 8, 4};
        int w = 20;

        double ratio[][] = new double[profit.length][2];
        for (int i = 0; i < profit.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = profit[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int maxProfit = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                maxProfit += profit[idx];
                capacity -= weight[idx];
            } else {
                maxProfit += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }
        System.out.println("Max profit = " + maxProfit);
    }
}