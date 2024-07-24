package DSA_quick_reacap.Array.Array_1_Dimension;

import java.util.ArrayList;

public class FlipArray {
    public static ArrayList<Integer> flip(String A){
        int curr_sum=0;
        int max_sum=0,l=0,r=0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(-1);
        ans.add(-1);
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                curr_sum--;
            }
            else{
                curr_sum++;
            }
            if(curr_sum>max_sum){
                max_sum=curr_sum;
                ans.set(0,l+1);
                ans.set(1,r+1);
            }
            if(curr_sum<0){
                curr_sum=0;
                l=i+1;
                r=i+1;
            }
            else{
                r++;
            }
        }
        if(max_sum == 0){
            return new ArrayList<Integer>();
        }
        else return ans;
    }
    public static void main(String[] args) {
        String s="000";
        System.out.println("Flip Array After operation is : "+flip(s));
    }
}
