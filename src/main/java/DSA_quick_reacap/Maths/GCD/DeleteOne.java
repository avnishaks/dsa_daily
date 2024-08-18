package DSA_quick_reacap.Maths.GCD;

public class DeleteOne {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int solution(int [] A){
        int ans=0;
        int n=A.length;
        int [] prefix=new int[n];
        int [] suffix=new int[n];

        prefix[0]=A[0];
        suffix[n-1]=A[n-1];

        // finding the gcd in prefix manner
        for(int i=1;i<n;i++){
            prefix[i]=gcd(prefix[i-1],A[i]);
        }

        // finding the gcd in suffix manner
        for(int i=n-2;i>=0;i--){
            suffix[i]=gcd(suffix[i+1],A[i]);
        }

        ans=Math.max(prefix[n-1],suffix[1]);

        for(int i=1;i<n-1;i++){
            int left=prefix[i-1];
            int right=suffix[i+1];
            int val=gcd(left,right);
            ans=Math.max(ans,val);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] A=new int[]{5, 15, 30};
        int max_value=solution(A);
        System.out.println("Integer denoting the maximum value of the GCD is : "+max_value);
    }
}
