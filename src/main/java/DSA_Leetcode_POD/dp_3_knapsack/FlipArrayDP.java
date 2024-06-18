package DSA_Leetcode_POD.dp_3_knapsack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FlipArrayDP {
    public static int solve(final int[] A) {
        int sum = IntStream.of(A).sum();  // Calculate the sum of all elements
        int target = sum / 2;  // Define the target as half of the total sum
        int result = canPartition(A, target);  // Find the minimum flips required to achieve the target sum
        return result == Integer.MAX_VALUE ? -1 : result;  // Return the result
    }

    public static int canPartition(int[] A, int target) {
        int n = A.length;
        int[][] dp = new int[n + 1][target + 1];  // DP array to store minimum flips required for each sum

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j == 0) {
                    dp[i][j] = 0;  // If target is 0, no elements are needed
                } else if (i == 0) {
                    dp[i][j] = Integer.MAX_VALUE;  // If no elements, we can't form any sum other than 0
                } else if (A[i - 1] <= j) {
                    int include = dp[i - 1][j - A[i - 1]];
                    if (include != Integer.MAX_VALUE) {
                        include += 1;  // Include the current element and add 1 flip
                    }
                    dp[i][j] = Math.min(include, dp[i - 1][j]);  // Minimum of including or excluding the element
                } else {
                    dp[i][j] = dp[i - 1][j];  // Exclude the current element
                }
            }
        }
        return dp[n][target];  // Return the result from the DP table
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
