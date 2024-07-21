package DSA_quick_reacap.Array.Array_technique;

public class ProductPuzzle {
    public static int[] productPuzzle(int [] A){
        int pd=1;
        int [] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            pd*=A[i];
        }
        for(int i=0;i<A.length;i++){
            ans[i]=pd/A[i];
        }
        return  ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{5, 1, 10, 1};
        int []ans=productPuzzle(A);
        System.out.println("Answer for Product Puzzle");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
