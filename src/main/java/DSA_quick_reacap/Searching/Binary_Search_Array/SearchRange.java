package DSA_quick_reacap.Searching.Binary_Search_Array;

public class SearchRange {
    public static int [] solution(int []A,int B){
        int n=A.length;
        if(n==1 && A[0]==B){
            return new int[]{0,0};
        }
        int left=-1,right=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==B&&(mid==0||A[mid]!=A[mid-1])){
                left=mid;
                break;
            }
            if(A[mid]<B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(A[mid]==B&&(mid==n-1||A[mid]!=A[mid+1])){
                right=mid;
                break;
            }
            if(A[mid]<=B){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return new int[]{left,right};
    }
    public static void main(String[] args) {
        int [] A=new int[]{5, 7, 7, 8, 8, 10};
        int B=8;
        int [] range=solution(A,B);
        System.out.println("The given range for the answer is : ");
        for(int i=0;i<range.length;i++){
            System.out.print(range[i]+" ");
        }
    }
}
