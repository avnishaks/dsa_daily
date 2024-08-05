package DSA_quick_reacap.dp_5_String;

public class EditDistance {

    public static int editDistanceUsingDP(String A,String B,int i,int j,int [][]dp){
        int row=A.length();
        int col=B.length();
        int ans=0;
        if (i < 0 && j < 0) {
            return 0;
        }
        // no of characters need to be inserted
        if (i < 0) return j + 1;
        // no of characters need to be deleted
        if (j < 0) return i + 1;

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if (A.charAt(i) == B.charAt(j)) {
            ans= editDistance(A, B, i - 1, j - 1);
        } else {
            int insertValue = editDistance(A, B, i, j - 1);
            int deleteValue = editDistance(A, B, i - 1, j);
            int replaceValue = editDistance(A, B, i - 1, j - 1);
            ans= 1 + Math.min(insertValue, Math.min(deleteValue, replaceValue));
        }
        dp[i][j]=ans;
        return dp[row-1][col-1];
    }
    public static int editDistance(String A, String B, int i, int j) {
        if (i < 0 && j < 0) {
            return 0;
        }
        // no of characters need to be inserted
        if (i < 0) return j + 1;
        // no of characters need to be deleted
        if (j < 0) return i + 1;

        if (A.charAt(i) == B.charAt(j)) {
            return editDistance(A, B, i - 1, j - 1);
        } else {
            int insertValue = editDistance(A, B, i, j - 1);
            int deleteValue = editDistance(A, B, i - 1, j);
            int replaceValue = editDistance(A, B, i - 1, j - 1);
            return 1 + Math.min(insertValue, Math.min(deleteValue, replaceValue));
        }
    }

    public static int solution(String A, String B) {
        int [][] dp=new int[A.length()][B.length()];
        for(int i=0;i<A.length();i++){
            for(int j=0;j<B.length();j++){
                dp[i][j]=-1;
            }
        }
        return editDistanceUsingDP(A, B, A.length() - 1, B.length() - 1,dp);
        //return editDistance(A, B, A.length() - 1, B.length() - 1);
    }

    public static void main(String[] args) {
        String A = "abad";
        String B = "abac";
        int answer = solution(A, B);
        System.out.println("Minimum number of insertion, deletion or replacement required to convert A into B is: " + answer);
    }
}
