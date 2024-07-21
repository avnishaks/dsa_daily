package DSA_quick_reacap.Array.Array_technique;

import java.util.Scanner;

public class RangeSumQuery {
    public static long[] rangeSum(int [] A,int [][] B){
        long [] ans=new long[B.length];
        long [] prefixSum=new long[A.length+1];
        long sum=0;
        prefixSum[0]=0;
        for(int i=1;i<=A.length;i++){
            sum=sum+A[i-1];
            prefixSum[i]=sum;
        }
        for(int i=0;i<B.length;i++){
            int val1=B[i][0];
            int val2=B[i][1];
            ans[i]=prefixSum[val2+1]-prefixSum[val1];
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int [] A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        int [][] B=new int[2][2];
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                B[i][j]=sc.nextInt();
            }
        }

        long [] ans=rangeSum(A,B);

        System.out.println("The final answer for the Range Sum Queries is ");

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }



    }
}
