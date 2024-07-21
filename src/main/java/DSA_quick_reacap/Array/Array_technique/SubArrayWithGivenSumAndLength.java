package DSA_quick_reacap.Array.Array_technique;

import java.util.Scanner;

public class SubArrayWithGivenSumAndLength {
    public static int solve(int[] A,int B,int C){
        int idx=0;
        int ans=0;
        for(int i=0;i<B;i++){
            ans+=A[i];
        }
        if(ans==C){
            idx=1;
            return idx;
        }
        int startIndex=0,endIndex=B;
        while(endIndex<A.length){
            ans=ans-A[startIndex]+A[endIndex];
            if(ans==C){
                idx=1;
                return idx;
            }

            startIndex++;
            endIndex++;
        }
        return  idx;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        int B=sc.nextInt();
        int C=sc.nextInt();

        int ans=solve(A,B,C);
        System.out.println("0/1 subArray with given sum and length is : "+ans);
    }
}
