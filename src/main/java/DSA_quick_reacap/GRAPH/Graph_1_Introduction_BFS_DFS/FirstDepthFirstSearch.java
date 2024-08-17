package DSA_quick_reacap.GRAPH.Graph_1_Introduction_BFS_DFS;

public class FirstDepthFirstSearch {

    public static void main(String[] args) {

    }
    /*
    public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    boolean visited[];
    public int solve(ArrayList < Integer > A, final int B, final int C) {
        int n = A.size();
        if (n == 1) return 1;
        HashMap < Integer, ArrayList < Integer >> graph = new HashMap < > ();
        visited = new boolean[n + 1];
        for (int i = 1; i < n; i++) {
            int node = A.get(i);
            if (!graph.containsKey(node)) graph.put(node, new ArrayList < Integer > ());
            graph.get(node).add(i + 1);
        }

        return DFS(B, C, graph);
    }

    private int DFS(int destination, int current, HashMap < Integer, ArrayList < Integer >> graph) {
        if (current == destination) return 1;
        if (graph.get(current) == null) return 0;
        visited[current] = true;
        int ans = 0;
        for (int neb: graph.get(current)) {
            if (!visited[neb]) ans |= DFS(destination, neb, graph);
        }
        return ans;
    }
}
     */
}
