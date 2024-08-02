package DSA_quick_reacap.Stack.Nearest_Greatest_Element;

import java.util.Stack;

public class NearestSmallerElement {
    public static int [] prevSmaller(int [] A){
        int n=A.length;
        int [] ans=new int[A.length];
        int min_value=Integer.MAX_VALUE;
        ans[0]=-1;
        for(int i=1;i<n;i++){
            min_value=-1;
            for(int j=i-1;j>=0;j--){
                if(A[i]>A[j]){
                    min_value=A[j];
                    break;
                }
            }
            ans[i]=min_value;
        }
        return ans;
    }

    public static int [] prevSmallerLeft(int [] A){
        int n=A.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(st.size()>0 && st.peek()>=A[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(A[i]);
        }
        return ans;
    }
    public static int [] prevSmallerRight(int [] A){
        int n=A.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(st.size()>0 && st.peek()>=A[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(A[i]);
        }
        return ans;
    }

    public static int [] nextGreaterRight(int[]A){
        int n=A.length;
        int [] ans=new int[A.length];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=A[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=n;
            else ans[i]=st.peek();
            st.push(A[i]);
        }
        return ans;
    }

    public static int [] nextGreaterLeft(int[]A){
        int n=A.length;
        int [] ans=new int[A.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&st.peek()<=A[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(A[i]);
        }
        return ans;
    }



    /*
            4, 5, 2, 10, 8
    ->      0  1  2  3  4
    ->     -1  4 -1  2  2
     */
    public static void main(String[] args) {
        int [] A=new int[]{2,1,5,6,2,3};
        int [] ans;
        ans=prevSmaller(A);

        System.out.println("Previous smaller Answer using Brute Force Approach: ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

        ans=prevSmallerLeft(A);

        System.out.println("Optimized Answer: Previous Element Left : --> ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println();

        ans=prevSmallerRight(A);

        System.out.println("Optimized Answer: Previous Element Right : --> ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println();

        ans=nextGreaterRight(A);

        System.out.println("Next Greater Right : ::::  ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

        System.out.println();

        ans=nextGreaterLeft(A);

        System.out.println("Next Greater Left : ::::  ");

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
