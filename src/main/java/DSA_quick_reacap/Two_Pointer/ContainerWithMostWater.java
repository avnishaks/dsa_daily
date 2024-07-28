package DSA_quick_reacap.Two_Pointer;

public class ContainerWithMostWater {
    public static int solve(int []A){
        int ans=0,area;
        int left=0,right=A.length-1;
        while(left<right){
            int height=Math.min(A[left],A[right]);
            int width=right-left;
            area=height*width;
            ans=Math.max(ans,area);
            if(A[left]<A[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 5, 4, 3};
        System.out.println("Container with Most Water is : "+solve(A));
    }
}
