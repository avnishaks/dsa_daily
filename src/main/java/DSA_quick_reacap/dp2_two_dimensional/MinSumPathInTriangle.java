package DSA_quick_reacap.dp2_two_dimensional;

import java.util.ArrayList;
import java.util.Scanner;

public class MinSumPathInTriangle {

        public static int minimumTotal(ArrayList<ArrayList<Integer>> A){
            int m=A.size();
            int n=A.get(m-1).size();
            int [] dp=new int[n+1];
            int size=n;
            for(int i=m-1;i>=0;i--){
                for(int j=0;j<size;j++){
                    dp[j]=Math.min(dp[j],dp[j+1])+A.get(i).get(j);
                }
                size--;
            }

            return dp[0];
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> A = new ArrayList<>();
            System.out.println("Enter the number of inner lists you want to create: ");
            int numLists = scanner.nextInt();
            for (int i = 0; i < numLists; i++) {
                System.out.println("Enter the elements for inner list " + (i + 1) + " (separated by spaces): ");
                ArrayList<Integer> innerList = new ArrayList<>();
                while (true) {
                    String input = scanner.next();
                    try {
                        int element = Integer.parseInt(input);
                        innerList.add(element);
                    } catch (NumberFormatException e) {
                        break;
                    }
                }
                A.add(innerList);
            }
            System.out.println("The created ArrayList: " + A);

            System.out.println("The minimum sum path from top to bottom is : "+minimumTotal(A));

            scanner.close();
        }
}
