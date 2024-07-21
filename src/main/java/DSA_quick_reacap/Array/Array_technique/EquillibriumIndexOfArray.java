package DSA_quick_reacap.Array.Array_technique;

import java.util.Scanner;

public class EquillibriumIndexOfArray {
    public static int helper(int [] A){
        int index=-1;
        int [] leftSum=new int[A.length];
        int [] rightSum=new int[A.length];
        leftSum[0]=A[0];
        rightSum[A.length-1]=A[A.length-1];
        for(int i=1;i<A.length;i++){
            leftSum[i]=A[i]+leftSum[i-1];
        }
        for(int i=A.length-2;i>=0;i--){
            rightSum[i]=A[i]+rightSum[i+1];
        }

        for(int i=0;i<leftSum.length;i++){
            if(leftSum[i]==rightSum[i]){
                index=i;
                return index;
            }
        }
        return  index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        int ans= helper(A);
        System.out.println("Equilibrium Index of the Array is : "+ ans);
    }
}
