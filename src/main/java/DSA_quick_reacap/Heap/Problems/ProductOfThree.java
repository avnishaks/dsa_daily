package DSA_quick_reacap.Heap.Problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOfThree {
    public static int [] solution(int [] A){
        int [] ans=new int[A.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
            if(pq.size()>2){
                int a1=pq.peek();
                pq.poll();
                int a2=pq.peek();
                pq.poll();
                int a3=pq.peek();
                pq.poll();
                ans[i]=a1*a2*a3;
                pq.add(a1);
                pq.add(a2);
                pq.add(a3);
            }
            else {
                ans[i]=-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 2, 3, 4, 5};
        int [] ans=solution(A);
        System.out.println("Product of 3 answer is : ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
