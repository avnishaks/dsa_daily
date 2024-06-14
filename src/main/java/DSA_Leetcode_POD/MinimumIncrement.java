package DSA_Leetcode_POD;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
3,2,1,2,1,7
1,1,2,2,3,7
1->0
1+1-> 1
2+1-> 1
2+2-> 2
3+2 -> 2
7 -> 0
 */
public class MinimumIncrement {

    public static int IncrementToMakeArrayUnique(int[] nums){
        Arrays.sort(nums);
        int minimumIncrement=0;
        int expectedValue=nums[0];
        for(int i=1;i<nums.length;i++){
            expectedValue=Math.max(expectedValue+1,nums[i]);
            minimumIncrement+=(expectedValue-nums[i]);
        }
        return minimumIncrement;
    }
    public static int minimumArrayUniqueTLE(int [] nums){
        int minimumCount=0;
        int count=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            while(hashMap.containsKey(value)){
                value++;
                count++;
            }
            minimumCount+=count;
            count=0;
            hashMap.put(value,hashMap.getOrDefault(value,0)+1);
        }
        return minimumCount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The minimum increment to make Array Unique : "+minimumArrayUniqueTLE(nums));
        System.out.println("The minimum increment to make Array Unique : "+IncrementToMakeArrayUnique(nums));
    }
}
