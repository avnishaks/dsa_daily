package DSA_quick_reacap.Maths.Modular_Arthematic;

public class PairSumDivisibleByM {
    // optimized Approach
    public static int solutionOptimized(int[] A,int B){
        int count=0;

        return count;
    }

    // brute force approach
    public static int solutionTLE(int [] A,int B){
        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if((A[i]+A[j])%B==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1,2,3,4,5};
        int B=2;
        int ans=solutionTLE(A,B);
        System.out.println("Total number of pairs for which sum is divisible by B is : "+ans);
    }
}
