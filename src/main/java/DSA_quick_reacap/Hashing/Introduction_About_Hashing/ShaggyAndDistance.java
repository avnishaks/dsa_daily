package DSA_quick_reacap.Hashing.Introduction_About_Hashing;

import java.util.HashMap;

public class ShaggyAndDistance {
    public static int solution(int [] A){
        int min_distance=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hashMap.containsValue(A[i])){
                min_distance=Math.min(min_distance,i-hashMap.get(A[i]));
            }
            hashMap.put(A[i],i);
        }
        return min_distance;
    }
    public static void main(String[] args) {
        int [] A=new int[]{7, 1, 3, 4, 1, 7};
        int ans=solution(A);
        System.out.println("Minimum Possible distance b/w the special pair is : "+ans);
    }
}
