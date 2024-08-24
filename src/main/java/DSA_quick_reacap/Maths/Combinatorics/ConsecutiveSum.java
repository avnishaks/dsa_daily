package DSA_quick_reacap.Maths.Combinatorics;

import java.util.Scanner;

public class ConsecutiveSum {
    public static int solution(int A){
        int count=0;
        int i=1;
        while(A>0){
            A=A-i;
            if(A%i==0){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println("Number of ways it can be represented as sum of consecutive positive integer: "+solution(value));
    }
}
