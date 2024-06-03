package DSA_Leetcode_POD;

import java.util.*;

public class June_3 {

    public static int appendCharacter(String s,String t){
        int length_t=t.length();
        System.out.println(length_t);
        int start_index_s=0;
        int start_index_t=0;
        while(s.length()>start_index_s){
            if(length_t == 0) { return length_t ;}
            if(s.charAt(start_index_s)==t.charAt(start_index_t)){
                length_t--;
                start_index_t++;
            }
            start_index_s++;
        }

        return length_t;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int ans = appendCharacter(s,t);
        System.out.println("The minimum number of the character need to append at the end of the string s , so that it can become subsequence of the string t : "+ ans);
    }
}
