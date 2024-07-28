package DSA_quick_reacap.dp_3_knapsack;

import java.util.Scanner;

public class Knapsack_01 {

    public static int solve(int [] values,int [] weight,int capacity,int [][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0||j==0) {
                    dp[i][j]=0;
                }
                else{
                    int reject=dp[i-1][j];
                    int pick=0;
                    if(j-weight[i-1]>=0){
                        pick=values[i-1]+dp[i-1][j-weight[i-1]];
                    }
                    dp[i][j]=Math.max(pick,reject);
                }

            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] values=new int[size];
        int [] weight=new int[size];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            weight[i]=sc.nextInt();
        }
        int capacity=sc.nextInt();
        int [][] dp=new int[size+1][capacity+1];
        System.out.println("Maximum value subset of A such that sum of the weights of this subset is smaller than or equal to C : "+solve(values,weight,capacity,dp));
    }
}
