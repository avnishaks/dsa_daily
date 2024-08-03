package DSA_quick_reacap.Heap.Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    public static int[] solution(int[] A) {
        int[] ans = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(A[0]);
        ans[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if ( A[i] < maxHeap.peek()) {
                maxHeap.add(A[i]);
            } else {
                minHeap.add(A[i]);
            }

            // Balance the heaps
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            // Calculate the median
            if (maxHeap.size() >= minHeap.size()) {
                ans[i] = maxHeap.peek();
            } else {
                ans[i] = minHeap.peek();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 5, 4, 3};
        int[] ans = solution(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
