package DSA_quick_reacap.String;

public class lcsDP {

    public static String lcs(String s1, String s2) {
        int m = s1.length();
        int r = s2.length();
        int[][] dp = new int[m + 1][r + 1];

        // Build the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= r; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack to find the LCS
        StringBuilder lcs = new StringBuilder();
        int i = m, j = r;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.insert(0, s1.charAt(i - 1)); // Add matching character to the LCS
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abcrt";
        System.out.println("Longest common subsequence is: " + lcs(s1, s2));
    }
}
