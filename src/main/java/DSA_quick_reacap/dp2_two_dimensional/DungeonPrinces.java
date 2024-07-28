package DSA_quick_reacap.dp2_two_dimensional;

import java.util.Scanner;

public class DungeonPrinces {
    public static int minimumHealth(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int [][] dp=new int[row][col];
        // Last row & col , where we need to start
        if(matrix[row-1][col-1]>=0){
            dp[row-1][col-1]=1;
        }
        else{
            dp[row-1][col-1]=Math.abs(matrix[row-1][col-1])+1;
        }
        // fill the last row
        for(int j=col-2;j>=0;j--){
            dp[row-1][j]=Math.max(1,dp[row-1][j+1]-matrix[row-1][j]);
        }
        // fill the last column
        for(int i=row-2;i>=0;i--){
            dp[i][col-1]=Math.max(1,dp[i+1][col-1]-matrix[i][col-1]);
        }

        // fill the rest with the dp array
        for(int i=row-2;i>=0;i--){
            for(int j=col-2;j>=0;j--){
                dp[i][j]=Math.max(1,Math.min(dp[i+1][j],dp[i][j+1])-matrix[i][j]);
            }
        }
        return dp[0][0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [][] matrix=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The minimum health required by prince to save the princes :"
                    + minimumHealth(matrix));
    }
}
