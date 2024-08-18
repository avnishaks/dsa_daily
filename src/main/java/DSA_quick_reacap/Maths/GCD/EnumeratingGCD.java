package DSA_quick_reacap.Maths.GCD;

public class EnumeratingGCD {

    public static String solution(String s1,String s2){
        return s1.equals(s2) ? s1 : "1";
    }
    public static void main(String[] args) {
        String s1="1";
        String s2="3";
        System.out.println("string which contains the digits of the integer which represents the GCD ");
        System.out.println(solution(s1,s2));
    }
}
