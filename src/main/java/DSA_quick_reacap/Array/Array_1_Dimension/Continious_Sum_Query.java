package DSA_quick_reacap.Array.Array_1_Dimension;

public class Continious_Sum_Query {
    public static int[] solve(int A,int[][]B){
        int [] ans=new int[A];
        int queries=B.length;
        for(int i=0;i<queries;i++){
            int start=B[i][0];
            int end=B[i][1];
            int val=B[i][2];
            ans[start-1]+=val;
            if(end<A){
                ans[end]-=val;
            }
        }
        int sum=0;
        for(int i=0;i<A;i++){
            sum+=ans[i];
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        int A=5;
        int [][] B=new int[][]{{1,2,10},{2,3,10},{2,5,25}};
        int [] ans=solve(A,B);
        System.out.println("The final answer for the continious sum query is: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
