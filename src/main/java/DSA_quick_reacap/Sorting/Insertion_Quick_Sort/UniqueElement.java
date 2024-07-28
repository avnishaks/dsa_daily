package DSA_quick_reacap.Sorting.Insertion_Quick_Sort;

import java.util.Arrays;

public class UniqueElement {
    public static int solution(int [] A){
        int answer=0;
        Arrays.sort(A);
        int i=1,j=0;
        while(j<A.length){
            if(i>=A[j]){
                answer+=(i-A[j]);
                i++;
            }
            else{
                i=A[j]+1;
            }
            j++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 1, 1,4,4};
        int ans=solution(A);
        System.out.println("Minimum steps to perform make all the element of array A unique is : "+ans);
    }
}
