package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class UniquePathInGrid {
    public static int uniquePath(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int [][] dp=new int[row][col];
        // fill the 1st row by -> 1
        for(int j=0;j<col;j++){
            if(matrix[0][j]==1){
                break;
            }
            dp[0][j]=1;
        }
        // fill the 1st col  by ->1
        for(int i=0;i<row;i++){
            if(matrix[i][0]==1){
                break;
            }
            dp[i][0]=1;
        }
        // add fill the other row & col
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lenght=sc.nextInt();
        int [][] matrix=new int[lenght][lenght];
        for(int i=0;i<lenght;i++){
            for(int j=0;j<lenght;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Number of unique path from reaching from (0,0) to (n-1,m-1) is : "+uniquePath(matrix));
    }
}
