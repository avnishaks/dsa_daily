package DSA_Leetcode_POD;

import java.util.Scanner;

public class SumOfSquareNumber {
    public static boolean isSumSquare(int n){
      long start=0,sum;
      long end=(long)Math.sqrt(n);
      while(start<=end){
          sum=start*start+end*end;
          if(sum<n){
              start++;
          }
          else if(sum>n){
              end--;
          }
          else{
              return true;
          }
      }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Given number is sum of square Number : "+ isSumSquare(n));

    }
}
