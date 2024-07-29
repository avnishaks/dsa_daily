package DSA_quick_reacap.Searching.Binary_Search_Problem;

public class RotateSortedArray {
    public static int search(int [] A,int B){
        int left=0,right=A.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[left]<A[mid]){
                if(B>=A[left] && B<A[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(B<=A[right]&&B>A[mid]){
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] A=new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        int B=4;
        int ans=search(A,B);
        System.out.println("Search Element in Rotated Array : "+ans);
    }
}
