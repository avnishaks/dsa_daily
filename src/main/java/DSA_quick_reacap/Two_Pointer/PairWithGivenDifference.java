package DSA_quick_reacap.Two_Pointer;

import java.util.Arrays;

public class PairWithGivenDifference {
    public static int solve(int [] A,int B){
        int count=0;
        int i=0,j=1;
        Arrays.sort(A);
        while(j<A.length){
            if(A[j]-A[i]==B){
                count++;
                while(j<A.length-1&&A[j]==A[j+1]){
                    j++;
                }
                j++;
            }
            else if(A[j]-A[i]<B){
                j++;
            }
            else{
                i++;
                if(i==j){
                    j=i+1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] A=new int[]{8,5,1,10,5,9,9,3,5,6,6,2,8,2,2,6,3,8,7,2,5,3,4,3,3,2,7,9,6,8,7,2,9,10,3,8,10,6,5,4,2,3};
        int B=3;
        System.out.println("The total number of pair whose diff is equal to B: "+solve(A,B));
    }
}
