package DSA_quick_reacap.Searching.Binary_Search_Array;

public class PeakElement {
    public static int solution(int [] A){
        int n=A.length;
        if(n==1){
            return A[0];
        }
        if(A[0]>A[1]){
            return A[0];
        }
        if(A[n-1]>A[n-2]){
            return A[n-1];
        }
        int low=1;
        int high=n-2;
        int mid=low+(high-low)/2;
        while(mid>=low && mid <=high){
            if(A[mid]>=A[mid+1] && A[mid]>=A[mid-1]){
                return A[mid];
            }
            else if(A[mid]<A[mid+1]){
                mid+=1;
            }
            else if(A[mid]<A[mid-1]){
                mid-=1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] A=new int[]{1, 2, 100, 4, 3};
        int peak_element=solution(A);
        System.out.println("The peak element in the array is : "+peak_element);
    }
}
