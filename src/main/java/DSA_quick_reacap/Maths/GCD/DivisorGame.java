package DSA_quick_reacap.Maths.GCD;

public class DivisorGame {
    public static int __gcd(int a,int b){
        if(b==0) return a;
        return __gcd(b,a%b);
    }
    public static int solution(int A,int B,int C){
        int lcm=B*C/__gcd(B,C);
        return A/lcm;
    }
    public static void main(String[] args) {
        int A=6;
        int B=1;
        int C=4;
        int ans=solution(A,B,C);
        System.out.println("Number of special Integer less than or equal to A is "+ ans);
    }
}
