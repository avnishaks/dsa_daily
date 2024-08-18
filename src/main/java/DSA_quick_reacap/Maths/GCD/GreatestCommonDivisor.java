package DSA_quick_reacap.Maths.GCD;

public class GreatestCommonDivisor {
    public static int solution(int A, int B){
        if(B==0) return A;
        return solution(B,A%B);
    }
    public static int gcd(int A, int B) {
        return solution(A,B);
    }
    public static void main(String[] args) {
        int A=6;
        int B=4;
        System.out.println("GCD of the two number A & B is "+gcd(A,B));
    }
}
