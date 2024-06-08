package DSA_Leetcode_POD;

import java.util.Scanner;

public class ClearDigit {
    private static int findTheClosetNonDigitLeft(StringBuilder sb,int indx){
        for (int i = indx - 1; i >= 0; i--) {
            if (!Character.isDigit(sb.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
    private static String clearDigit(String st){
        StringBuilder sb=new StringBuilder(st);
        int i=0;
        while(i<sb.length()){
            if(Character.isDigit(sb.charAt(i))){
                int nonDigitIdx=findTheClosetNonDigitLeft(sb,i);
                if(nonDigitIdx!=-1){
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(nonDigitIdx);
                    i=nonDigitIdx;
                }
                else {
                    sb.deleteCharAt(i);
                }
                i=Math.max(i-1,0);
            }
            else{
                i++;
            }
        }
        return  sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("The remaining character left after performing the action on digit and nearby character are : " + clearDigit(s));
    }
}
