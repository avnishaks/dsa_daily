package DSA_Leetcode_POD;

import java.util.Arrays;
import java.util.Scanner;

public class HeightChecker {
    public static int heightChecker(int[] height){
        int count=0;
        int [] expected=new int[height.length];
        for(int i=0;i<height.length;i++){
            expected[i]=height[i];
        }
        Arrays.sort(expected);
        for(int i=0;i<expected.length;i++){
            if(height[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] height=new int[size];
        for(int i=0;i<height.length;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("The number indicies where expected height is not equal to actual height : "+ heightChecker(height));
    }
}
