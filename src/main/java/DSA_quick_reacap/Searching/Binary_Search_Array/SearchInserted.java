package DSA_quick_reacap.Searching.Binary_Search_Array;

public class SearchInserted {
    public static int solution(int [] A,int B){
        int low=0;
        int high=A.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==B){
                return mid;
            }
            else if(A[mid]>B){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 4, 9};
        int B=3;
        int ans=solution(A,B);
        System.out.println("The index denoting the target value is : "+ans);
    }
}
