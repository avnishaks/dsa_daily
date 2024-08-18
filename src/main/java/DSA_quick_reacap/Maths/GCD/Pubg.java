package DSA_quick_reacap.Maths.GCD;

public class Pubg {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int solve(int[] A) {
        if(A.length<2){
            return A[0];
        }
        int min_health=A[0];
        for(int i=1;i<A.length;i++){
            min_health=gcd(min_health,A[i]);
        }

        return min_health;

    }
    public static void main(String[] args) {
        int [] A=new int[]{6,4};
        System.out.println("Minimum health of the player who survive last is : "+ solve(A));
    }
}
