package DSA_quick_reacap.Array.Array_1_Dimension;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {
    public static int[] plusOne(int[] A) {
        int c = 1;
        int n = A.length;

        for (int i = n - 1; i >= 0; i--) {
            int temp = A[i] + c;
            if (temp == 10) {
                c = 1;
                A[i] = 0;
            } else {
                A[i] = temp;
                c = 0;
            }
        }

        if (c == 1) {
            int[] res = new int[n + 1];
            res[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                res[i] = A[i - 1];
            }
            return res;
        }

        int i = 0;
        while (i < n && A[i] == 0) {
            i++;
        }

        return Arrays.copyOfRange(A, i, n);
    }

    public static void main(String[] args) {

        int[] input = {9, 9, 9};
        int[] result =plusOne(input);
        System.out.println(Arrays.toString(result));
    }
}
