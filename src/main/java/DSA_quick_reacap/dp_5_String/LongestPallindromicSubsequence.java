package DSA_quick_reacap.dp_5_String;

public class LongestPallindromicSubsequence {
    public static int solution(String A, String B) {
        int row = A.length();
        int col = B.length();
        int[][] dp = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[row][col];
    }

    public static void main(String[] args) {
        String A = "aabadef";
        StringBuilder st=new StringBuilder(A);
        String B = String.valueOf(st.reverse());
        System.out.println(B);
        int ans = solution(A, B);
        System.out.println("Longest Palindromic Subsequence of the String is: " + ans);
    }
}
