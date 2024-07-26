package DSA_quick_reacap.Array.Array_2_dimension;

public class MaxiumSumSquareSubMatrix {
    public static int solve(int [][] A,int B){
        int [][] ans=new int[A.length-B+1][A.length];
        int totalSum=Integer.MIN_VALUE;
        int sum=0;
        for(int col=0;col<A[0].length;col++){
            sum=0;
            for(int row=0;row<B;row++){
                sum+=A[row][col];
            }
            ans[0][col]=sum;
            for(int row=B;row<A.length;row++){
                sum=sum+A[row][col]-A[row-B][col];
                ans[row-B+1][col]=sum;
            }
        }
        for(int row=0;row<A.length-B+1;row++){
            sum=0;
            for(int col=0;col<B;col++){
                sum+=ans[row][col];
            }
            totalSum=Math.max(totalSum,sum);
            for(int col=B;col<A.length;col++){
                sum=sum+ans[row][col]-ans[row][col-B];
                totalSum=Math.max(totalSum,sum);
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int [][] A=new int[][]{{1,1,1,1,1},{2,2,2,2,2},{3,8,6,7,3},{4,4,4,4,4},{5,5,5,5,5}};
        int B=3;
        System.out.println("Maximum sum of sub-matrix of size B X B is : "+solve(A,B));
    }
}
