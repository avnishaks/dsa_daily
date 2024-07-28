package DSA_quick_reacap.Two_Pointer;

public class SubArrayWithGivenSum {
    public static int [] solve(int [] A,int B){
        int left=0;
        int right=0;
        int sum=A[left];
        while(right<A.length){
            if(sum==B){
                int [] subarray=new int[right-left+1];
                for(int i=left;i<=right;i++){
                    subarray[i-left]=A[i];
                }
                return subarray;
            }
            else if(sum<B){
                right++;
                if(right<A.length){
                    sum+=A[right];
                }
            }
            else{
                sum-=A[left];
                left++;
                if(left>right && left<A.length-1){
                    right++;
                    sum+=A[right];
                }
            }
        }


        int [] subarray=new int[1];
        subarray[0]=-1;
        return subarray;
    }
    public static void main(String[] args) {
        int [] A=new int[]{5, 6, 3, 4, 6};
        int B=11;
        int [] ans=solve(A,B);
        System.out.println("Element in the Answer Array is : ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
