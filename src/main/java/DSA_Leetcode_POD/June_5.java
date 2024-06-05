package DSA_Leetcode_POD;

import java.util.*;

public class June_5 {

    public static List<String> commonString(String[] A){
        List<String> common_chars=new ArrayList<>();

        int [] min_frequencies = new int[26];
        Arrays.fill(min_frequencies,Integer.MAX_VALUE);

        for(String current_string : A){
            int [] char_frequency=new int[26];

            for(char c: current_string.toCharArray()){
                char_frequency[c-'a']++;
            }

            for(int i=0;i<26;i++){
                min_frequencies[i]=Math.min(min_frequencies[i],char_frequency[i]);
            }
        }

        for(int i=0;i<26;i++){
            while(min_frequencies[i]>0){
                common_chars.add(""+(char)(i+'a'));
                min_frequencies[i]--;
            }
        }

        return common_chars;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len_str=sc.nextInt();
        String [] str_arr=new String[len_str];
        for (int i=0;i<len_str;i++){
            str_arr[i]=sc.next();
        }

        List<String> commonStringArray= new ArrayList<>();
        commonStringArray=commonString(str_arr);

        System.out.println("Common Character in the String is : " + commonStringArray);
    }
}
