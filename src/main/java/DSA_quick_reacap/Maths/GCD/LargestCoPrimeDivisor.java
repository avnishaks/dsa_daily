package DSA_quick_reacap.Maths.GCD;

public class LargestCoPrimeDivisor {
    public static int __gcd(int a,int b){
        if(b==0) return a;
        return __gcd(b,a%b);
    }
    public static int solution(int A,int B){
        while (__gcd(A,B)!=1){
            A/=__gcd(A,B);
        }
        return A;
    }
    public static void main(String[] args) {
        int A=5;
        int B=10;
        int ans=solution(A,B);
        System.out.println(ans);
    }
}
