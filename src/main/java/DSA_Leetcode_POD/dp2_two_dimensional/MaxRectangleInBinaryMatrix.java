package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class MaxRectangleInBinaryMatrix {
    public static int maxiumArea(int [][] matrix){
        int maxValue=0;
        int row= matrix.length;
        int col=matrix[0].length;

        // modify the matrix , if possible
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0) continue;
                if(matrix[i][j]==1){
                    matrix[i][j]=j-1>=0?1+matrix[i][j-1]:1;
                }
            }
        }

        // Perform the operation
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    continue;
                }
                int width=matrix[i][j];
                int height=1;
                maxValue=Math.max(maxValue,width*height);
                // Move up and increase the height to capture all the response with maximum area
                for(int k=i-1;k>=0;k--){
                    if(matrix[k][j]<width){
                        width=matrix[k][j];
                    }
                    height++;
                    maxValue=Math.max(maxValue,width*height);
                }
            }
        }

        return maxValue;
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
        System.out.println("The Area of largest Rectangle containing ones is : "+maxiumArea(matrix));

    }
}
