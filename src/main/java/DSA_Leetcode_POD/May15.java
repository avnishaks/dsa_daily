package DSA_Leetcode_POD;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class May15 {

    final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] matrix = new int[n][n];
        Queue<int[]> multiSourceQueue = new LinkedList<>();

        // Initialize the matrix and the queue with sources
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    multiSourceQueue.add(new int[]{i, j});
                    matrix[i][j] = 0; // Safe zone starting point
                } else {
                    matrix[i][j] = -1; // Unsafe and unvisited
                }
            }
        }

        // Multi-source BFS to calculate safe distances
        while (!multiSourceQueue.isEmpty()) {
            int size = multiSourceQueue.size();
            while (size-- > 0) {
                int[] curr = multiSourceQueue.poll();
                for (int[] d : directions) {
                    int di = curr[0] + d[0];
                    int dj = curr[1] + d[1];
                    if (isValidCell(matrix, di, dj) && matrix[di][dj] == -1) {
                        matrix[di][dj] = matrix[curr[0]][curr[1]] + 1;
                        multiSourceQueue.add(new int[]{di, dj});
                    }
                }
            }
        }

        // Using priority queue to find the maximum minimum path safeness
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        pq.add(new int[]{0, 0, matrix[0][0]});
        matrix[0][0] = -1;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (curr[0] == n - 1 && curr[1] == n - 1) {
                return curr[2];
            }
            for (int[] d : directions) {
                int di = curr[0] + d[0];
                int dj = curr[1] + d[1];
                if (isValidCell(matrix, di, dj) && matrix[di][dj] != -1) {
                    pq.add(new int[]{di, dj, Math.min(curr[2], matrix[di][dj])});
                    matrix[di][dj] = -1; // Mark as visited
                }
            }
        }

        return -1; // No path found
    }

    private boolean isValidCell(int[][] matrix, int i, int j) {
        int n = matrix.length;
        return i >= 0 && j >= 0 && i < n && j < n;
    }

    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(List.of(0,0,1));
        grid.add(List.of(0,0,0));
        grid.add(List.of(0,0,0));

        May15 solution = new May15();
        int result = solution.maximumSafenessFactor(grid);
        System.out.println("Maximum Safeness Factor: " + result);
    }
}
