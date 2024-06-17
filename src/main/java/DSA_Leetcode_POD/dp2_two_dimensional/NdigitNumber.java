package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class NdigitNumber {
    public static int Ndigit(int [][]dp,int idx,int sum){
        int ans=0;
        if(sum<0) return 0;
        if(idx==0 && sum==0) return 1;
        if(idx==0) return 0;
        if(dp[idx][sum]!=-1) return dp[idx][sum];

        for(int i=0;i<10;i++){
            ans+=Ndigit(dp,idx-1,sum-i);
            ans%= 1000000007;
        }
        return dp[idx][sum]=ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=0;
        int [][] dp=new int[A+1][B+1];
        for (int i = 0; i < A + 1; i++) {
            for (int j = 0; j < B + 1; j++)
                dp[i][j] = -1;
        }
        for(int i=1;i<10;i++){
            ans+=Ndigit(dp,A-1,B-i);
            ans%= 1000000007;
        }
        System.out.println("digits on being added equals to a given number B is "+ ans);
    }
}
