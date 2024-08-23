package DSA_quick_reacap.Maths.Prime_Number;

import java.util.Arrays;
import java.util.Scanner;

public class PrintPrimeFromOnetoN {
    public static void printAllPrimeNumber(int value){
        boolean [] prime=new boolean[value+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=value;i++){
            if(prime[i]){
                for(int j=i*i;j<=value;j=j+i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=value;i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int value){
        int count=0;
        for(int i=1;i<=Math.sqrt(value);i++){
            if(value%i==0){
                if(i==value/i){
                    count++;
                }
                else {
                    count+=2;
                }
            }
        }
        return count == 2;
    }
    public static void printPrimeNumber(int value){
        for(int i=2;i<=value;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Print all the Prime number from number 1 to N !");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println("All the Prime Number from 1 to N are : ");
        printPrimeNumber(value);
        System.out.println();
        printAllPrimeNumber(value);
    }
}
