package DSA_quick_reacap.Maths.GCD;

public class GCDPair {
    public static int[] solution(int [] A){
        int [] original;
        int length_original=(int) Math.sqrt(A.length);
        original=new int[length_original];
        int maxValue=0;
        int j=0;
        for(int i=0;i<length_original;i++){
            for(;j<(i+1)*length_original;j++){
                maxValue=Math.max(maxValue,A[j]);
            }
            original[i]=maxValue;
            maxValue=0;
        }
        return original;
    }
    public static void main(String[] args) {
        System.out.println("! GCD of all the pair combination of Array is given , Need to print the Original Array !");
        int [] A=new int[]{2, 2, 2, 2, 8, 2, 2, 2, 10};
        int [] ans=solution(A);
        System.out.println();
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"  ");
        }
        System.out.println();
    }
}
