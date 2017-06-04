package com.lweizhou.arithmetic.dp;

/**
 * 动态规划背包问题
 * 
 * @author lweizhou
 *
 */
public class DpPackage {

    public static void main(String[] args) {

        int val[] = {10, 40, 30, 50};
        int wt[] = {5, 4, 6, 3};
        int W = 10;
        int N = wt.length;

        int[][] V = new int[N + 1][W + 1];
        // 初始化matrix
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                V[i][j] = 0;
            }
        }

        for (int item = 1; item <= N; item++) {
            for (int weight = 1; weight <= W; weight++) {
                if (weight >= wt[item - 1]) {
                    V[item][weight] = Math.max(val[item - 1] + V[item - 1][weight - wt[item - 1]],
                            V[item - 1][weight]);
                } else {
                    V[item][weight] = V[item - 1][weight];
                }
            }
        }

        for (int[] rows : V) {
            for (int col : rows) {
                System.out.format("%5d", col);
            }
            System.out.println();
        }
    }

}
