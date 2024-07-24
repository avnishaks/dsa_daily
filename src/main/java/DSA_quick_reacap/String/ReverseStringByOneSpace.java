package DSA_quick_reacap.String;

public class ReverseStringByOneSpace {
    public static String ReverseWord(String s){
        String temp="";
        String [] words=s.trim().split("\\s+");
        for(int i= words.length-1;i>=0;i--) {
            temp = temp + words[i] + " ";

        }
        return temp;
    }
    public static void main(String[] args) {
        String s="a good programmar";
        System.out.println("The final answer for the string is: "+ReverseWord(s));
    }
}
