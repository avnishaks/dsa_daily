package DSA_Leetcode_POD;

import java.util.*;

public class June_4 {

    public static int longestPallindrome(String s){
        int length=0;
        HashSet<Character> hashSet=new HashSet<>();
        for(char character: s.toCharArray()){
            if(hashSet.contains(character)){
                hashSet.remove(character);
                length+=2;
            }else{
                hashSet.add(character);
            }
        }
        if(!hashSet.isEmpty()){
            length+=1;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int ans=longestPallindrome(s);
        System.out.println("The length of the longest Palindrome is : "+ ans);
    }
}
