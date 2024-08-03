package DSA_quick_reacap.Heap.Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int solution(int [][] A,int B){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int row=A.length;
        int col=A[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                pq.add(A[i][j]);
                if(pq.size()>B){
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int [][] A=new int[][]{{9, 11, 15},{10, 15, 17}};
        int B=6;
        int ans=solution(A,B);
        System.out.println("B-th smallest element in the matrix : "+ans);
    }
}
