package DSA_Leetcode_POD;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceWithLargestSmallestInThreeMove {
    public static int DifferenceInMove(int[] nums){
        int ans=0;
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        int k=nums.length-3;
        ans=nums[nums.length-1]-nums[0];
        for(int i=k-1;i< nums.length;i++){
            ans=Math.min(ans,nums[i]-nums[i-k+1]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] nums=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The minimum difference b/w largest and smallest in three move : "+DifferenceInMove(nums));
    }
}
