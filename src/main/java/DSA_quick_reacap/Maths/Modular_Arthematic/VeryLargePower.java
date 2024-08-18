package DSA_quick_reacap.Maths.Modular_Arthematic;

public class VeryLargePower {
    public static long highPower(int A,long fact,long mod){
        if(fact==0){
            return 1;
        }
        long half=highPower(A,fact/2,mod)%mod;
        if(fact%2==0){
            return (int) ((half*half)%mod);
        }
        else{
            return (((A*half)%mod)*half)%mod;
        }
    }
    public static int solution(int A,int B){
        long mod=1000000007;
        long fact=1;
        for(long i=2;i<=B;i++){
            fact=(fact*i)%(mod-1);
        }
        return (int)highPower(A,fact,mod);
    }
    public static void main(String[] args) {
        System.out.println("Very Large Power");
        int A=2;
        int B=100007;
        int ans=solution(A,B);
        System.out.println("(A ^ (B!)) % (1e9 + 7) equivalent to : "+ans);
    }
}
