package DSA_quick_reacap.Stack.Implementation_And_Basic;

import java.util.Stack;

public class BalanceParathesis {
    public static boolean solution(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0||st.peek()!='('){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0||st.peek()!='{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==']'){
                if(st.size()==0||st.peek()!='['){
                    return false;
                }
                else{
                    st.pop();
                }
            }

        }
        return (st.size()==0);
    }
    public static int balanceParathesis(String s){
        if(solution(s)){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Balance Paranthesis");
        String A="))))))))";
        int ans=balanceParathesis(A);
        System.out.println("0 denotes Not Balance Parathesis , while 1 denotes Balance Parathesis : "+ans);
    }
}
