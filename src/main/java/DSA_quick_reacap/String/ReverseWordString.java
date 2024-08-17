package DSA_quick_reacap.String;

import java.util.Random;
import java.util.Stack;

public class ReverseWordString {
    public static String solution(String s){
        s+=" ";
        String str="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                st.push(str);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        String ans="";
        while (!st.isEmpty()){
            ans=ans+st.peek()+" ";
            st.pop();
        }


        return ans;
    }
    public static void main(String[] args) {
        String s="the sky is blue";
        Random random=new Random();
        int value=10;
        int value2=23;
        String s1=String.valueOf(value2)+String.valueOf(value);
        System.out.println("String addition is "+s1);
        // blue is sky the
        System.out.println("After reversing the word in String output will become : "+solution(s));
    }
}
