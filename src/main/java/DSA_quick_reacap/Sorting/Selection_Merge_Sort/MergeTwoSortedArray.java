package DSA_quick_reacap.Sorting.Selection_Merge_Sort;

public class MergeTwoSortedArray {
    public static int [] solution(int[] A,int[] B){
        int [] C=new int[A.length+B.length];
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length){
            if(A[i]>B[j]){
                C[k]=B[j];
                j++;
            }
            else{
                C[k]=A[i];
                i++;
            }
            k++;
        }
        while(i<A.length){
            C[k]=A[i];
            i++;
            k++;
        }
        while(j<B.length){
            C[k]=B[j];
            j++;
            k++;
        }
        return C;
    }
    public static void main(String[] args) {
        int [] A=new int[]{4, 7, 9};
        int [] B=new int[]{2, 11, 19};
        System.out.println("The output of the array after merging the two sorted Array : ");
        int [] ans=solution(A,B);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
