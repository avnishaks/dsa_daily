package DSA_Leetcode_POD;

import java.util.Arrays;
import java.util.Scanner;

public class MinMoveToSeat {
    public static int minMoveToSeat(int [] seats,int [] students){
        int minCount=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            minCount+=Math.abs(seats[i]-students[i]);
        }
        return minCount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [] seats=new int[len];
        int [] students=new int[len];
        for(int i=0;i<len;i++){
            seats[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            students[i]=sc.nextInt();
        }
        System.out.println("The minimum number of the move to seat : "+ minMoveToSeat(seats,students));
    }
}
