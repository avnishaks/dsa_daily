package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class MinSumPathInMatrix {

    public static int minimumPathSum(int [][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        // fill the 0th column
        for(int i=1;i<row;i++){
            matrix[i][0]+=matrix[i-1][0];
        }
        // fill the 0th row
        for(int j=1;j<col;j++){
            matrix[0][j]+=matrix[0][j-1];
        }
        // fill the other remaining pots in the matrix
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                matrix[i][j]+=Math.min(matrix[i-1][j],matrix[i][j-1]);
            }
        }
        return matrix[row-1][col-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int [][] matrix=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The minimum sum path in the matrix is : "+ minimumPathSum(matrix));

    }
}
