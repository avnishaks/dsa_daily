package DSA_quick_reacap.dp_3_knapsack;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FlipArray {
    public static int canPartition(int[] A, int target, int index) {
        if (target <= 0) {
            return 0;
        }
        if (index >= A.length) {
            return Integer.MAX_VALUE;
        }
        int include = canPartition(A, target - A[index], index + 1);
        if (include != Integer.MAX_VALUE) {
            include += 1;
        }
        int exclude = canPartition(A, target, index + 1);
        return Math.min(include, exclude);
    }
    public static int solve(final int[] A) {
        int sum = IntStream.range(0, A.length).map(i -> A[i]).sum();
        sum /= 2;
        int result = canPartition(A, sum+1, 0);
        return result == Integer.MAX_VALUE ? -1 : result;
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
