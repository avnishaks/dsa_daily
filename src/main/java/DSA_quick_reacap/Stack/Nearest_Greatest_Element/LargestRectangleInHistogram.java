package DSA_quick_reacap.Stack.Nearest_Greatest_Element;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int [] prevSmallerLeft(int [] A){
        int n=A.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int [] prevSmallerRight(int [] A){
        int n=A.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(st.size()>0 && A[st.peek()]>=A[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static int maximumArea(int [] A){
        int area=0;
        int [] left=prevSmallerLeft(A);
        int [] right=prevSmallerRight(A);
        for(int i=0;i<A.length;i++){
            int height=A[i];
            int width=right[i]-left[i]-1;
            area=Math.max(area,height*width);
        }
        return area;
    }
    public static void main(String[] args) {
        int [] A=new int[]{47,69,67,97,86,34,98,16,65,95,66,69,18,1,99,56,35,9,48,72,49,47,1,72,87,52,13,23,95,55,21,92,36,88,48,39,84,16,15,65,7,58,2,21,54,2,71,92,96,100,28,31,24,10,94,5,81,80,43,35,67,33,39,81,69,12,66,87,86,11,49,94,38,44,72,44,18,97,23,11,30,72,51,61,56,41,30,71,12,44,81,43,43,27};
        int ans=maximumArea(A);
        System.out.println("Maximum area value fromed by Rectangle in Histogram is : "+ans);
    }
}
