package DSA_quick_reacap.Array.Array_2_dimension;

public class SearchInRowWiseAndColWise {
    public static int solve(int[][]A ,int B){
        int position=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==B){
                    position=(i+1)*1009+(j+1);
                    mini=Math.min(mini,position);
                }
            }
        }
        if(mini==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return mini;
        }
    }
    public static void main(String[] args) {
        int [][] A=new int[][]{{1, 2},{3,3}};
        int B=3;
        System.out.println("Position of B present in 2-d array A : "+solve(A,B));
    }
}
