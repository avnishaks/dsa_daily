package DSA_quick_reacap.Stack.Implementation_And_Basic;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static String solution(String s){
        Stack<Character> st=new Stack<>();
        String ans="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(st.size()>0&&ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(st.size()>0){
            ch=st.pop();
            ans=ch+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="abccbc";
        String ans=solution(s);
        System.out.println("The final answer is : "+ans);
    }
}
