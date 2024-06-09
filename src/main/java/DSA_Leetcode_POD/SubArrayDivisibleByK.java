package DSA_Leetcode_POD;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayDivisibleByK {
    public static int subArrayDivisible(int[] nums,int k){
        int count=0;
        HashMap<Integer,Integer> remainderMapping=new HashMap<>();
        int curr_sum=0,remainder=0;
        remainderMapping.put(0,1);
        for(int num : nums){
            curr_sum+=num;
            remainder=curr_sum%k;
            if(remainder<0){
                remainder+=k;
            }
            if(remainderMapping.containsKey(remainder)){
                count+=remainderMapping.get(remainder);
                remainderMapping.put(remainder,remainderMapping.get(remainder)+1);
            }
            else {
                remainderMapping.put(remainder, 1);
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] nums=new int[length];
        for(int i=0;i<length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println("Count of the subArray divisible by K  :  "+ subArrayDivisible(nums,k));
    }
}
