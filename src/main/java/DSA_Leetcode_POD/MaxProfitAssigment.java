package DSA_Leetcode_POD;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxProfitAssigment {
    static class Pair{
        int profit;
        int difficulty;
        Pair(int profit,int difficulty){
            this.profit=profit;
            this.difficulty=difficulty;
        }
    }
    public static int maxProfitAssignment(int [] difficulty,int [] profit,int [] worker){
        int ans=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.profit-a.profit);
        pq.add(new Pair(0,0));
        for(int i=0;i<difficulty.length;i++){
            pq.add(new Pair(profit[i],difficulty[i]));
        }
        Arrays.sort(worker);
        for(int i=worker.length-1;i>=0;i--){
            while(pq.peek().difficulty>worker[i]){
                pq.poll();
            }
            ans+=pq.peek().profit;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of difficulty and profit array : ");
        int n=sc.nextInt();
        int [] difficulty=new int[n];
        int [] profit=new int[n];
        System.out.println("Enter the element present in Difficulty Array");
        for(int i=0;i<n;i++){
            difficulty[i]=sc.nextInt();
        }
        System.out.println("Enter the element present in Profit Array");
        for(int i=0;i<n;i++){
            profit[i]=sc.nextInt();
        }
        System.out.println("Enter the number of workers working :");
        int worker_num=sc.nextInt();
        int [] worker=new int[worker_num];
        System.out.println("Enter the ability of each worker : ");
        for(int i=0;i<worker_num;i++){
            worker[i]=sc.nextInt();
        }

        System.out.println("Maximum profit we can achieve after assigning the workers to the jobs : "+ maxProfitAssignment(difficulty,profit,worker));

    }
}
