package DSA_quick_reacap.Array.Array_1_Dimension;

public class Max_Sum_Continious_Array {
    public static int maxSubArray(int [] A){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            ans=Math.max(sum,ans);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans=maxSubArray(A);
        System.out.println("The maximum sum continious sub-array is  : "+ans);
    }
}
