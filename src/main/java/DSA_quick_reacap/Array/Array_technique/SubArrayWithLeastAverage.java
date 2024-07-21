package DSA_quick_reacap.Array.Array_technique;

public class SubArrayWithLeastAverage {
    public static int solve(int[] A,int B){
        int ans=0;
        int idx=0;
        for(int i=0;i<B;i++){
            ans+=A[i];
        }
        int startIdx=0;
        int endIdx=B;
        int avg=ans;
        while(startIdx<=A.length-B-1){
            ans=ans-A[startIdx]+A[endIdx];
            if(ans<avg){
                avg=ans;
                idx=startIdx+1;
            }
            startIdx++;
            endIdx++;
        }
        return  idx;
    }
    public static void main(String[] args) {
        int [] A=new int[]{3, 7, 90, 20, 10, 50, 40};
        int B=3;
        int ans=solve(A,B);
        System.out.println("Answer is : "+ans);
    }

}
