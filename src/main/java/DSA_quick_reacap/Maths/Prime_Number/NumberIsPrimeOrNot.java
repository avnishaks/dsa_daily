package DSA_quick_reacap.Maths.Prime_Number;

import java.util.Scanner;

public class NumberIsPrimeOrNot {

    public static boolean checkPrime(int value){
        int count=0;
        for(int i=1;i<Math.sqrt(value);i++){
            if(value%i==0){
                if(i==value/i){
                    count++;
                }
                else {
                    count+=2;
                }
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        boolean ans=checkPrime(value);
        System.out.println("Given number ( "+ value+" )  is the Prime Number : "+ans);

    }
}
