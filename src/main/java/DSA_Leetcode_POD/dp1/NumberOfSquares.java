package DSA_Leetcode_POD.dp1;

import java.util.Scanner;

public class NumberOfSquares {
    public static int countMinSquare(int A){
        int countMinSquare=0;
        int [] dp=new int[A+1];
        dp[0]=0;
        for(int i=1;i<=A;i++){
            countMinSquare=Integer.MAX_VALUE;
            for(int x=1;x*x<=i;x++){
                countMinSquare=Math.min(countMinSquare,dp[i-x*x]);
            }
            dp[i]=countMinSquare+1;
        }
        return dp[A];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Minimum count of number , sum of whose square is equal to A : "+ countMinSquare(number));
    }
}
