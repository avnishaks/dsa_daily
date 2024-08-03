package DSA_quick_reacap.Heap.Introduction;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static int solution(int [] A){
        int ans=0,rope1=0,rope2=0,combine_cost=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:A){
            pq.add(x);
        }
        while(pq.size()>1){
            rope1=pq.peek();
            pq.poll();
            rope2=pq.peek();
            pq.poll();
            combine_cost=(rope1+rope2);
            pq.add(combine_cost);
            ans+=combine_cost;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 2, 3, 4, 5};
        int ans=solution(A);
        System.out.println();
        System.out.println("Minimum cost to connect the ropes in a single rope : "+ans);
    }
}
