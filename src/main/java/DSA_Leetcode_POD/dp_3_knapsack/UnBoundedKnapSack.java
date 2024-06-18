package DSA_Leetcode_POD.dp_3_knapsack;

import java.util.Scanner;

public class UnBoundedKnapSack {
    public static int solve(int capacity,int [] values,int [] weight){
        int [][] dp=new int[values.length+1][capacity+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0||j==0) {
                    dp[i][j]=0;
                }
                else{
                    int reject=dp[i-1][j];
                    int pick=0;
                    if(j-weight[i-1]>=0){
                        pick=values[i-1]+dp[i][j-weight[i-1]];
                    }
                    dp[i][j]=Math.max(pick,reject);
                }

            }
        }
        return dp[dp.length-1][dp[0].length-1];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int capacity=sc.nextInt();
        int size=sc.nextInt();
        int [] values=new int[size];
        int [] weight=new int[size];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            weight[i]=sc.nextInt();
        }
        System.out.println(" maximum amount that could fit in this quantity "+ solve(0,capacity,values,weight));
    }
}
