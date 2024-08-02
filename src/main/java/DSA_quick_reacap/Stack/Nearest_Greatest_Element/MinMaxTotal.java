package DSA_quick_reacap.Stack.Nearest_Greatest_Element;

import java.util.Stack;

public class MinMaxTotal {
    // Find the index of the smallest element to the left of each element in A
    public static int[] smallestLeft(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    // Find the index of the smallest element to the right of each element in A
    public static int[] smallestRight(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    // Find the index of the next greater element to the right of each element in A
    public static int[] nextGreaterRight(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] <= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    // Find the index of the next greater element to the left of each element in A
    public static int[] nextGreaterLeft(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && A[st.peek()] <= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    // Calculate the maximum minimum total
    public static int MaxMinTotal(int[] A) {
        long total_sum = 0;
        long mod = 1000000007;
        int[] smallestRights = smallestRight(A);
        int[] smallestLefts = smallestLeft(A);
        int[] greatestRight = nextGreaterRight(A);
        int[] greatestLeft = nextGreaterLeft(A);

        for (int i = 0; i < A.length; i++) {
            long max = (long)(i - greatestLeft[i])%mod * (long)(greatestRight[i] - i)%mod;
            long min = (long)(i - smallestLefts[i])%mod * (long)(smallestRights[i] - i)%mod;
            total_sum = (total_sum + ((long)A[i] * (max - min))%mod) % mod;
            if(total_sum<0){
                total_sum=total_sum+mod;
            }
        }
        return (int)(total_sum%mod);
    }


    public static int solve(int[] A) {
        return MaxMinTotal(A);
    }
    public static void main(String[] args) {
        int [] A=new int[]{4, 7, 3, 8};
        int ans=solve(A);
        System.out.println("The total sum value of max and min difference of all the sub-array is: "+ans);
    }
}
