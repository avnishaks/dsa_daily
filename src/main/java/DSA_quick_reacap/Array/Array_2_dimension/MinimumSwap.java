package DSA_quick_reacap.Array.Array_2_dimension;

public class MinimumSwap {
    public static int minimumSwap(int []A,int B){
        int ans=0,count=0;

        // count the number of element less than B
        for(int i=0;i<A.length;i++){
            if(A[i]<=B){
               count++;
            }
        }

        // count the number of the bad elements
        if(count<=1) return 0;
        else{
            int l=0,r=0,x=0;
            // count the number of bad element present in 0 to B ranges
            while(r<count){
                if(A[r]>B){
                    x++;
                }
                r++;
            }

            ans=x;
            while(r<A.length){
                if(A[r]>B){
                    x++;
                }
                if(A[l]>B){
                    x--;
                }
                ans=Math.min(ans,x);
                r++;
                l++;
            }

        }

        return ans;
    }
    public static void main(String[] args) {

        int [] A=new int[]{5, 17, 100, 11};
        int B=20;
        System.out.println("The minimum number of swap is : "+minimumSwap(A,B));
    }
}
