package DSA_Leetcode_POD;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// POD -> 8th June ( Leetcode )
public class ContiniousSubArraySum {


    public static boolean goodSubArray(int [] nums,int k){
        Map<Integer,Integer> reminder=new HashMap<>();
        int curr_sum=0;
        reminder.put(0,-1);
        int remains=0;
        for(int i=0;i<nums.length;i++){
            curr_sum+=nums[i];
            remains=curr_sum%k;
            if(reminder.containsKey(remains)){
                if(i-reminder.get(remains)>=2){
                    return  true;
                }
            }
            else {
                reminder.put(remains,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] nums=new int[length];
        for(int i=0;i<length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println("Is is Good Array :  "+ goodSubArray(nums,k));
    }
}
