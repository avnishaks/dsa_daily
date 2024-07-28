package DSA_quick_reacap.Sorting.Insertion_Quick_Sort;

public class MaxChunckToMakeSorted {
    public static int solution(int [] A){
        int msf=0,count=0;
        for(int i=0;i<A.length;i++){
            msf=Math.max(msf,A[i]);
            if(msf==i) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] A=new int[]{2, 0, 1, 3};
        int ans=solution(A);
        System.out.println("The max chunk to make the array sorted is : "+ans);
    }
}


/*

1, 2, 3, 4, 0
2, 0, 1, 3

->
msf=0
count=0


-> msf = 1(0)  2(1)  3(2)  4(3)  4(4) => 4=4 ( count =1 )
-> 2(0) 2(1) 2(2) 3(3)

 */