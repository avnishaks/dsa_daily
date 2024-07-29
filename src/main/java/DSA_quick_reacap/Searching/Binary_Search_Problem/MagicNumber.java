package DSA_quick_reacap.Searching.Binary_Search_Problem;

public class MagicNumber {
    public static int lcm(int a,int b){
        int x=a;
        int y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        return lcm;
    }
    public static int solution(int A,int B,int C){
        int count=0;

        return count;
    }
    public static void main(String[] args) {
        int A=1;
        int B=2;
        int C=3;
        int ans=solution(A,B,C);
        System.out.println("A-th magical number "+ans);
    }
}
