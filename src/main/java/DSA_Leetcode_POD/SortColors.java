package DSA_Leetcode_POD;

import java.util.Scanner;

public class SortColors {
    /*
    Given an array of size of length n , element inserted in the array is 0,1,2 , sort the array based on digit in ascending order
    , Please don't use any kind of sorting algorithm

    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
     */
    private static void swapping(int[] nums,int a,int b){
        int temp;
        temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void sortcolor(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                swapping(nums,start,mid);
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swapping(nums,mid,end);
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        sortcolor(arr);
        System.out.println("The final array after sorting the color is : "+ arr);

    }
}
