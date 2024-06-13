package DSA_Leetcode_POD.dp1;

import java.util.Scanner;

public class FibonacciNumber {
    public static int AthFibonacciMemo(int A){
        if(A< 2){
            return A;
        }
        return AthFibonacciMemo(A-1)+AthFibonacciMemo(A-2);
    }
    public static int AthFibonacci(int A){
        int [] dp=new int[A+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=A;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[A];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("The Ath Fibonacci number is Tabulation : "+ AthFibonacci(number));
        System.out.println("The Ath Fibonacci number using memoization : "+ AthFibonacciMemo(number));
    }
}
