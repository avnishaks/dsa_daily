package DSA_quick_reacap.Array;

import java.util.Scanner;

public class SumOfAllSubArray {
    public static long helper(int [] A){
        long ans=0;
        long count=0;

        for(int i=0;i<A.length;i++){
            count=(long)(A.length-i)*(i+1);
            ans+=count*A[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        long ans= helper(A);

        System.out.println("The sum of all the sub-array is : "+ ans);

    }
}
