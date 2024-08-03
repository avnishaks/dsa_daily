package DSA_quick_reacap.Heap.Problems;

import java.util.PriorityQueue;

public class AthLargestElement {
    public static int [] solution(int A,int []B){
        int [] ans=new int[B.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<B.length;i++){
            if(pq.size()!=A){
                pq.add(B[i]);
            }
            else {
                if(pq.peek()<B[i]){
                    pq.add(B[i]);
                    pq.poll();
                }
            }
            if(pq.size()==A){
                ans[i]=pq.peek();
            }
            else{
                ans[i]=-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int A=2;
        int [] B=new int[]{15, 20, 99, 1};
        int []ans=solution(A,B);
        System.out.println("Largest "+A+" th element in the subarray :");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
