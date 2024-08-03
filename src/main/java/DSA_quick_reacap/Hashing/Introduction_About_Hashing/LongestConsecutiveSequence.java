package DSA_quick_reacap.Hashing.Introduction_About_Hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int solution(int [] A){
        int max_len=Integer.MIN_VALUE,value,chain,next_value;
        HashSet<Integer> hashSet=new HashSet<>();
        for(int x:A){
            hashSet.add(x);
        }
        for(int i=0;i<A.length;i++){
            value=A[i];
            if(hashSet.contains(value-1)==false){
                chain=1;
                next_value=value+1;
                while (hashSet.contains(next_value)){
                    chain++;
                    next_value=next_value+1;
                }
                max_len=Math.max(max_len,chain);

            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int [] A=new int[]{100, 4, 200, 1, 3, 2};
        int length=solution(A);
        System.out.println("The length of longest consecutive sequence is : "+length);
    }
}
