package DSA_quick_reacap.Sorting.Selection_Merge_Sort;

public class kthSmallestElement {
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static int solution(int[] A, int K) {
        int start = 0, mini;
        int end = A.length;
        int miniIdx = -1;
        while (start < K) {
            mini = A[start];
            miniIdx = start;
            for (int i = start + 1; i < end; i++) {
                if (A[i] < mini) {
                    mini = A[i];
                    miniIdx = i;
                }
            }
            swap(A, start, miniIdx);
            start++;
        }
        return A[K - 1];
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 4, 3, 2};
        int K = 3;
        System.out.println("Kth Smallest Element in the Array is : " + solution(A, K));
    }
}
