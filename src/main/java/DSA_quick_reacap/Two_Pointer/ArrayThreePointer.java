package DSA_quick_reacap.Two_Pointer;

public class ArrayThreePointer {
    public static int solve(int[] A,int[] B,int[] C){
        int diff = Integer.MAX_VALUE;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int i, j, k;
        for(i=0,j=0,k=0; i < A.length && j < B.length && k < C.length;){
            minimum = Math.min(A[i], Math.min(B[j], C[k]));
            maximum = Math.max(A[i], Math.max(B[j], C[k]));
            diff = Math.min(diff, maximum - minimum);
            if (diff == 0) break;
            if (A[i] == minimum) i++;
            else if (B[j] == minimum) j++;
            else k++;
        }
        return diff;
    }
    public static void main(String[] args) {
        int [] A =new int[]{1, 4, 10};
        int [] B =new int[]{2, 15, 20};
        int [] C =new int[]{10, 12};
        int ans=solve(A,B,C);
        System.out.println(" minimum max(abs(A[i] - B[j]), abs(B[j] - C[k]), abs(C[k] - A[i])). is : "+ans);
    }
}
