package DSA_quick_reacap.Array.Array_2_dimension;

public class SumOfSubArray {
    public static int solve(int [][] A){
        int totalSum=0,contribution=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                contribution=(i+1)*(j+1)*(A.length-i)*(A.length-j);
                totalSum=totalSum+contribution*A[i][j];
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int [][] A=new int[][]{{1,2},{3,4}};
        System.out.println("The sum of all possible sub-matrix in the given matrix : "+solve(A));
    }
}
