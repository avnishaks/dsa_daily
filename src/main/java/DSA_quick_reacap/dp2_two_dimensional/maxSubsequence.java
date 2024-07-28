package DSA_quick_reacap.dp2_two_dimensional;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxSubsequence {
    public static int[] maxsumSeq(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        List<Integer> v=new ArrayList<>();
        for(int x:nums){
            pq.add(x);
            v.add(x);
        }

        int[] ans=new int[k];

        for(int i=0;i<nums.length-k;i++)
            v.remove(pq.remove());

        for(int i=0;i<k;i++)
            ans[i]=v.get(i);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] maxArray = maxsumSeq(nums, k);

        System.out.println("Maximum sum in the subsequence of the length " + k);
        for (int i = 0; i < maxArray.length; i++) {
            System.out.print(maxArray[i] + " ");
        }
    }
}
