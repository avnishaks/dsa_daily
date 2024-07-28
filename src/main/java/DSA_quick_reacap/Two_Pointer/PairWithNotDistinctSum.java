package DSA_quick_reacap.Two_Pointer;

public class PairWithNotDistinctSum {
    public static int solve(int[] A,int B){
                int count = 0, count_l = 0, count_r = 0;
                long ans = 0;
                int mods = 1000 * 1000 * 1000 + 7;
                int l = 0, r = A.length - 1;

                while (l <= r) {
                    if (A[l] + A[r] == B) {
                        if (A[l] == A[r]) {
                            count = r - l + 1;
                            ans += (count * (count - 1) / 2) % mods;
                            ans %= mods;
                            break;
                        }
                        count_l = 0;
                        for (int i = l; i <= r && A[i] == A[l]; i++) {
                            count_l++;
                        }
                        count_r = 0;
                        for (int i = r; i >= l && A[i] == A[r]; i--) {
                            count_r++;
                        }
                        ans += (count_l * count_r) % mods;
                        ans %= mods;
                        l += count_l;
                        r -= count_r;
                    } else if (A[l] + A[r] < B) {
                        l++;
                    } else {
                        r--;
                    }
                }
                return (int) (ans % mods);
    }
    public static void main(String[] args) {
        int [] A=new int[]{2,3,3,5,7,7,8,9,9,10,10};
        int B=11;
        System.out.println("The total count of pair with distinct sum is : "+solve(A,B));
    }
}
