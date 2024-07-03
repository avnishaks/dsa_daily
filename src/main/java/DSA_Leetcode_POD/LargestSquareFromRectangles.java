package DSA_Leetcode_POD;


public class LargestSquareFromRectangles {
    public static int countLargestSquares(int[][] rectangles) {
        int maxLen = 0;
        int count = 0;

        for (int[] rectangle : rectangles) {
            int sideLen = Math.min(rectangle[0], rectangle[1]);
            if (sideLen > maxLen) {
                maxLen = sideLen;
                count = 1;
            } else if (sideLen == maxLen) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.out.println(countLargestSquares(rectangles));
    }
}

