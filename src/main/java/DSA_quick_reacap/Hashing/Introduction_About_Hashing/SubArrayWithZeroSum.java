package DSA_quick_reacap.Hashing.Introduction_About_Hashing;

import java.util.HashMap;

public class SubArrayWithZeroSum {
    public static int solution(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (hashMap.containsKey(sum)) {
                return 1;
            } else {
                hashMap.put(sum, i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = new int[]{4, -1, 1};
        int ans = solution(A);
        System.out.println("Subarray with sum equal to zero: " + ans);
    }
}
