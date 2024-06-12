package DSA_Leetcode_POD;

import java.util.*;

public class RelativeSortOrder {
    public static int [] relativeSortOrder(int [] arr1,int [] arr2){
        int[] arr3 = new int[arr1.length];
        int k = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int x : arr1) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (int x : arr2) {
            if (hashMap.containsKey(x)) {
                int count = hashMap.get(x);
                while (count-- > 0) {
                    arr3[k++] = x;
                }
                hashMap.remove(x);
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (int x : hashMap.keySet()) {
            int count = hashMap.get(x);
            while (count-- > 0) {
                remaining.add(x);
            }
        }

        Collections.sort(remaining);

        for (int x : remaining) {
            arr3[k++] = x;
        }

        return arr3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length_arr1=sc.nextInt();
        int length_arr2=sc.nextInt();
        int [] arr1=new int[length_arr1];
        int [] arr2=new int[length_arr2];
        for(int i=0;i<length_arr1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<length_arr2;i++){
            arr2[i]=sc.nextInt();
        }
        int [] arr3;
        arr3=relativeSortOrder(arr1,arr2);
        System.out.println("The output for the relative sort order is : "+ arr3);

    }
}
