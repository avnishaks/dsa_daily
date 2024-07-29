package DSA_quick_reacap.String;

public class LongestCommonSubsequence {
    public static int lcs(String s1,String s2,int s1_idx,int s2_idx){
        if(s1_idx<0||s2_idx<0){
            return 0;
        }
        if(s1.charAt(s1_idx)==s2.charAt(s2_idx)){
            return 1+lcs(s1,s2,s1_idx-1,s2_idx-1);
        }

        return Math.max(lcs(s1,s2,s1_idx-1,s2_idx),lcs(s1,s2,s1_idx,s2_idx-1));
    }
    public static int solutionLCS(String s1,String s2){
        int s1_len=s1.length();
        int s2_len=s2.length();
        if(s1_len==0){
            return -1;
        }
        if(s2_len==0){
            return -1;
        }
        return lcs(s1,s2,s1_len-1,s2_len-1);
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcrt";
        System.out.println("Longest common subsequence is : "+solutionLCS(s1,s2));
    }
}
