package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class IntersectingChordInCircle {
    public static int chordCnt(int A){
        int mod = 1000000007;
        int [] dp=new int[A+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=A;i++){
            for(int j=0;j<i;j++){
                dp[i]+=(dp[j]%mod*dp[i-1-j]%mod)%mod;
            }
        }
        return dp[A];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println("number of ways you can draw A chords in a circle with 2 x A points such that no 2 chords intersect : "+chordCnt(A));
    }
}
