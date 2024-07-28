package DSA_quick_reacap.Sorting.Insertion_Quick_Sort;

import java.util.Arrays;

public class WaveArray {
    public static int[] solution(int [] A){
        Arrays.sort(A);
        if(A.length<2){
            return A;
        }
        for(int i=1;i<A.length;i++){
            if(i%2!=0){
                int temp=A[i-1];
                A[i-1]=A[i];
                A[i]=temp;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1,2,3,4};
        int [] ans=solution(A);
        System.out.println("The output of the wave array is : ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
