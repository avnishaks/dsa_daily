package DSA_quick_reacap.Array.Array_technique;

import java.util.Scanner;

public class SpecialIndex {
    public static int solve(int[] A) {
        int evenSum = 0;
        int oddSum = 0;
        int siCount = 0;
        int[] evenPF = new int[A.length];
        int[] oddPF = new int[A.length];

        evenPF[0] = A[0];
        oddPF[0] = 0;

        for (int i=1; i<A.length; i++) {
            if (i%2 == 0) {
                evenPF[i] = evenPF[i-1] + A[i];
                oddPF[i] = oddPF[i-1];
            }
            else {
                oddPF[i] = oddPF[i-1] + A[i];
                evenPF[i] = evenPF[i-1];
            }
        }

        for (int i=0; i<A.length; i++) {
            if (i == 0) {
                evenSum = oddPF[A.length - 1];
                oddSum = evenPF[A.length- 1];
            }
            else {
                evenSum = evenPF[i-1] + (oddPF[A.length-1] - oddPF[i]);
                oddSum = oddPF[i-1] +  (evenPF[A.length-1] - evenPF[i]);
            }
            if (evenSum == oddSum) {
                siCount++;
            }
        }
        return siCount;
    }
    public static void main(String[] args) {

        int [] A=new int[]{1, 1, 1};

        int ans=solve(A);

        System.out.println("The final answer is : "+ans);
    }
}
