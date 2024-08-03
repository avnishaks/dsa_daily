package DSA_quick_reacap.Heap.Introduction;

import java.util.PriorityQueue;

public class MaxiumArraySumAfterNeglation {
    public static int solution(int [] A,int B){
        int total_sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int value=0;
        for(int x:A){
            pq.add(x);
        }
        while(!pq.isEmpty()&&B-- >0){
            value=pq.peek();
            value=value*(-1);
            pq.poll();
            pq.add(value);
        }
        while (!pq.isEmpty()){
            total_sum+=pq.peek();
            pq.poll();
        }
        return total_sum;
    }
    public static void main(String[] args) {
        int [] A=new int[]{57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
        int B=10;
        int ans=solution(A,B);
        System.out.println("Maximum Array sum after B modification : "+ans);
    }
}
