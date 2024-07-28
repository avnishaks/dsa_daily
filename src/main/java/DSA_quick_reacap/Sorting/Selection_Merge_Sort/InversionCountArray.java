package DSA_quick_reacap.Sorting.Selection_Merge_Sort;

public class InversionCountArray {
    private static int Mod = 1000 * 1000 * 1000 + 7;

    // Merge function to count inversions
    static long merge(int A[], int temp[], int left, int mid, int right){
        int i = left, j = mid, k = left;
        long inversion_count = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
                inversion_count += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = A[i++];
        }

        while (j <= right) {
            temp[k++] = A[j++];
        }

        for (int x = left; x <= right; x++) {
            A[x] = temp[x];
        }

        return  inversion_count % Mod;
    }

    // Recursive function to sort and count inversions
    static long _mergeSort(int[] A, int[] temp, int left, int right) {
        long inversion_count = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            inversion_count += _mergeSort(A, temp, left, mid);
            inversion_count += _mergeSort(A, temp, mid + 1, right);
            inversion_count += merge(A, temp, left, mid + 1, right);
        }
        return inversion_count%Mod;
    }

    // Function to initiate merge sort and count inversions
    static long mergeSort(int[] A) {
        int[] temp = new int[A.length];
        return _mergeSort(A, temp, 0, A.length - 1) % Mod;
    }

    // Solution function
    public static int solution(int[] A) {
        return (int) mergeSort(A);
    }

    // Main function
    public static void main(String[] args) {
        int[] A = new int[]{3, 4, 1, 2};
        int ans = solution(A);
        System.out.println("The total count of inversion count in the array is : " + ans);
    }
}
