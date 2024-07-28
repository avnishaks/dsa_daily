package DSA_quick_reacap.dp1;

import java.util.Scanner;

public class Stairs {
    public static int reachAtTop(int A){
        int mod=10^9+7;
        int [] dp=new int[A+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=A;i++){
            dp[i]=(dp[i-1]%mod+dp[i-2]%mod)%mod;
        }
        return dp[A];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Number of ways to reach the top : "+reachAtTop(number));
    }
}
