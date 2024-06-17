package DSA_Leetcode_POD.dp2_two_dimensional;

import java.util.Scanner;

public class UniqueBinarySearchTree {
    public static int uniqueBST(int A){
        int [] dp=new int[A+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=A;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                int leftBST=dp[j-1];
                int rightBST=dp[i-j];
                sum+=leftBST*rightBST;
            }
            dp[i]=sum;
        }
        return dp[A];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("The number of unique structural BST is : "+uniqueBST(number));
    }
}
