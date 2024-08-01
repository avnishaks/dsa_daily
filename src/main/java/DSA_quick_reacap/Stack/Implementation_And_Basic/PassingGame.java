package DSA_quick_reacap.Stack.Implementation_And_Basic;

import java.util.Stack;

public class PassingGame {
    public static int solution(int A,int B,int [] C){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<C.length;i++){
            if(C[i]==0&&!st.empty()){
                st.pop();
            }
            else{
                st.push(C[i]);
            }
        }
        if(!st.empty()){
            return st.peek();
        }

        return B;
    }
    public static void main(String[] args) {
        int A=10;
        int B=23;
        int [] C=new int[]{86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        int ans=solution(A,B,C);
        System.out.println("Ball with player after final passing is : "+ans);
    }
}
