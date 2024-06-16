package DSA_Leetcode_POD;

import java.util.Scanner;

public class PatchingArray {
    public static int pathArray(int[] nums,int n){
        int noOfPath=0;
        int missing_number=1;
        int i=0;
        while(missing_number<=n){
            if(i<nums.length && nums[i]<=missing_number){
                missing_number+=nums[i];
                i++;
            }
            else{
                missing_number+=missing_number;
                noOfPath++;
            }
        }
        return noOfPath;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        System.out.println("Minimum number of patches : "+pathArray(nums,n));
    }
}
