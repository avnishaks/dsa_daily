package DSA_quick_reacap.Maths.Modular_Arthematic;

public class PrimeInverseModulo {
    public static int solution(int A,int B){

        // This approach going to provide TLE for the questions

        int ans=-1;
        for(int i=1;i<B;i++){
            if((A*i)%B==1){
                ans=i;
                return ans;
            }
        }
        return ans;
    }
    public static int primeInverseModulo(int A,int power,int B){
        if (power == 0) {
            return 1;
        }
        if (power % 2 == 1) {
            long halfPowerValue = primeInverseModulo(A, power / 2, B);
            return (int) ((A % B * halfPowerValue % B * halfPowerValue % B) % B);
        } else {
            long halfPowerValue = primeInverseModulo(A, power / 2, B);
            return (int) ((halfPowerValue % B * halfPowerValue % B) % B);
        }
    }
    public static void main(String[] args) {
        System.out.println("Prime Modulo Inverse");
        int A=6;
        int B=23;
        int ans=solution(A,B);
        int power = B - 2;
        int powerFunctionValue = primeInverseModulo(A, power, B);
        System.out.println("Modulo inverse of given two number A and B is : "+ans);
        System.out.println("Modulo inverse of given two number A and B in optimized manner : "+powerFunctionValue);
    }
}
