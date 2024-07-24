package DSA_quick_reacap.String;

import java.util.Stack;

public class ReverseWordInString {
    public static String reverseWordOptimized(String s){
        String temp="";
        String ans="";
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char ch=s.charAt(left);
            if(ch!=' '){
                temp+=ch;
            }
            else if(ch==' '){
                if(!ans.equals("")){
                    ans=temp+" "+ans;
                }
                else{
                    ans=temp;
                }
                temp="";
            }
            left++;
        }

        if(!temp.equals("")){
            if(!ans.equals("")){
                ans=temp+" "+ans;
            }
            else{
                ans=temp;
            }
        }
        return ans;
    }
    public static String reverseWord(String s){
        // TC : Time complexity of the above example is O(n) & O(n) !
        s+=" ";
        String out="";
        Stack<String> st=new Stack<>();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                st.push(out);
                out="";
            }
            else{
                out+=s.charAt(i);
            }
        }
        String ans="";
        while(st.size()!=1){
            ans+=st.peek()+" ";
            st.pop();
        }
        ans+=st.peek();


        return ans;
    }
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println("The final answer after reversing the string is : "+reverseWordOptimized(s));
    }
}
