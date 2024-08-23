package DSA_quick_reacap.Maths.Prime_Number;

import java.util.Scanner;

public class CountDivisor {
    public static int [] solution(int [] A){
        int n=A.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j*j<=A[i];j++){
                if(A[i]%j==0){
                    if(A[i]/j==j){
                        count++;
                    }
                    else{
                        count+=2;
                    }
                }
            }
            ans[i]=count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{8, 9, 10};
        int [] ans=solution(A);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
