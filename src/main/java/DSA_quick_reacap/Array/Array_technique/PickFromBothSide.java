package DSA_quick_reacap.Array.Array_technique;

import java.util.Scanner;

public class PickFromBothSide {
    public static int solve(int [] A,int B){
        int maxValue=0;
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        maxValue=sum;
        int temp=B-1;
        for(int i=A.length-1;i>=A.length-B;i--){
            sum=sum-A[temp]+A[i];
            temp--;
            maxValue=Math.max(maxValue,sum);
        }
        return  maxValue;
    }
    public static void main(String[] args) {
        int [] A=new int[]{ 5, -2, 3 , 1, 2};
        int B=3;
        int ans=solve(A,B);
        System.out.println("The final answer to the question is : "+ans);

    }
}
