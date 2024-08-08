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
    public static void main(String[] args) {
        int A=6;
        int B=23;
        int ans=solution(A,B);
        System.out.println("Module inverse of given two number A and B is : "+ans);
    }
}
