package DSA_quick_reacap.Heap.Introduction;

import java.util.PriorityQueue;

public class MishaAndCandies {
    public static int solution(int []A,int B){
        int ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:A){
            pq.add(x);
        }
        int taken=0,first_time=0,second_time=0;
        while(!pq.isEmpty()&&pq.peek()<=B){
            first_time=pq.peek();
            pq.poll();
            taken=first_time/2;
            ans+=taken;
            if(!pq.isEmpty()){
                second_time=pq.peek();
                pq.poll();
                second_time+=(first_time-taken);
                pq.add(second_time);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1,2,1};
        int B=2;
        int ans=solution(A,B);
        System.out.println("Number of the candies Misha will eat is : "+ans);
    }
}
