package DSA_quick_reacap.Searching.Binary_Search_Array;

public class SingleElementSortedArray {
    public static int solution(int [] A){
        int x=0;
        for(int i=0;i<A.length;i++){
            x^=A[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1,1,3};
        System.out.println("Single element in the sorted array is: "+solution(A));
    }
}
