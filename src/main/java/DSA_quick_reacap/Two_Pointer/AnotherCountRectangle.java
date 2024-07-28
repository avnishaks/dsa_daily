package DSA_quick_reacap.Two_Pointer;

public class AnotherCountRectangle {
    public static int solve(int [] A,int B){
        long count=0;
        long area=0;
        long mods = 1000 * 1000 * 1000 + 7;
        int l=0,r=A.length-1;
        while(l<A.length && r>=0){
            area=(long)A[l]*A[r];
            if(area<B){
                count=count+r+1;
                count%=mods;
                l++;
            }
            else{
                r--;
            }
        }
        return (int) count;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1,2};
        int B=5;
        System.out.println("Number of Rectangle with distinct configuration : "+solve(A,B));

    }
}
