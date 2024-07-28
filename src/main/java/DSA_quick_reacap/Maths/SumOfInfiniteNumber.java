package DSA_quick_reacap.Maths;

import java.math.BigInteger;

public class SumOfInfiniteNumber {
    /*
    Given two string , s1 & s2 , s1 <-> s2 contains infinite number
    we need to find the sum of number in the infinite series
     */
    public static String solution(String s1,String s2){
        // storing the value of resultant answer here
        String str="";
        int len_s1=s1.length();
        int len_s2=s2.length();
        // Idea behind is the lets add the number , if len_s1 < len_s2 , starting
        // element might be missing , so rever the order start adding it
        s1=new StringBuilder(s1).reverse().toString();
        s2=new StringBuilder(s2).reverse().toString();
        /*

        s1: 129
        s2:73722
        921
        22737
        15837->73851
         */
        int carry=0;
        for(int i=0;i<len_s1;i++){
            int sum= (int)(s1.charAt(i)-'0')+(int)(s2.charAt(i)-'0')+carry;
            int val=sum%10;
            val=val+'0';
            str+=(char)(val);
            carry=sum/10;
        }
        for(int i=len_s1;i<len_s2;i++){
            int sum=(int)(s2.charAt(i)-'0')+carry;
            int val=sum%10;
            val=val+'0';
            str+=(char)(val);
            carry=sum/10;
        }
        if(carry>0){
            str+=(char)(carry+'0');
        }
        str=new StringBuilder(str).reverse().toString();
        return str;
    }
    public static void main(String[] args) {
        String s1="129";
        String s2="73722";
        System.out.println("!!! Applying BigInteger -> Method !!! ");

        BigInteger a=new BigInteger(s1);
        BigInteger b=new BigInteger(s2);
        System.out.println("Answer using BigInteger Method of JAVA : "+ a.add(b));

        System.out.println("!!  Iterative Apporach for this Method : !!");
        String ans=solution(s1,s2);
        System.out.println("The sum of the infinite number after adding s1 & s2 is : "+ ans);

    }
}
