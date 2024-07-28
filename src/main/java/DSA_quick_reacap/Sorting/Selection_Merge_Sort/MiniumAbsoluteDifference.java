package DSA_quick_reacap.Sorting.Selection_Merge_Sort;

import java.util.Arrays;

public class MiniumAbsoluteDifference {
    public static int solution(int [] A){
        Arrays.sort(A);
        int ans=0;
        ans=Integer.MAX_VALUE;
        for(int i=1;i<A.length;i++){
            ans=Math.min(ans,A[i]-A[i-1]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{5, 17, 100, 11};
        int ans=solution(A);
        System.out.println("The minimum Absolute difference is : "+ans);
    }
}
