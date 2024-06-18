package DSA_Leetcode_POD.dp_3_knapsack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FlipArrayDP {
    public static int solve(final int[] A) {
        int sum = IntStream.of(A).sum();
        int target = sum / 2;
        int result = canPartition(A, target);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static int canPartition(int[] A, int target) {
        int n = A.length;
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else if (A[i - 1] <= j) {
                    int include = dp[i - 1][j - A[i - 1]];
                    if (include != Integer.MAX_VALUE) {
                        include += 1;
                    }
                    dp[i][j] = Math.min(include, dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("The final answer is : " + solve(A));
        sc.close();
    }
}
