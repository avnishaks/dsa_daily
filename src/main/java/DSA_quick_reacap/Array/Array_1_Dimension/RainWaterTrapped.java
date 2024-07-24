package DSA_quick_reacap.Array.Array_1_Dimension;

public class RainWaterTrapped {
    public static int trap(int [] A){
        int ans=0;
        int [] larray=new int[A.length];
        int [] rarray=new int[A.length];
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            lmax=Math.max(lmax,A[i]);
            larray[i]=lmax;
        }
        for(int i=A.length-1;i>=0;i--){
            rmax=Math.max(rmax,A[i]);
            rarray[i]=rmax;
        }
        for(int i=0;i<A.length;i++){
            ans+=(Math.min(rarray[i],larray[i])-A[i]);
        }
        return  ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The total amount of water stored in tap is : "+trap(A));
    }
}
