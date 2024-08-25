package DSA_quick_reacap.Trees.View_Types;

import java.util.*;

public class VerticalOrderTraversals {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructor to initialize
        // the node with a value
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Map<Integer, Map<Integer, List<Integer>>> nodes = new TreeMap<>();

        Queue<Pair<TreeNode, Pair<Integer, Integer>>> todo = new LinkedList<>();
        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        while (!todo.isEmpty()) {
            Pair<TreeNode, Pair<Integer, Integer>> p = todo.poll();
            TreeNode temp = p.getKey();
            int x = p.getValue().getKey();  // vertical
            int y = p.getValue().getValue();  // level

            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                    .computeIfAbsent(y, k -> new ArrayList<>())
                    .add(temp.val);

            if (temp.left != null) {
                todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
            }
            if (temp.right != null) {
                todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, List<Integer>>> entry : nodes.entrySet()) {
            ArrayList<Integer> col = new ArrayList<>();
            for (List<Integer> set : entry.getValue().values()) {
                col.addAll(set);
            }
            ans.add(col);
        }
        return ans;
    }
    // Helper function to print the result
    private static void printResult(ArrayList<ArrayList<Integer>> result) {
        for (List<Integer> level : result) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(9);

        VerticalOrderTraversals solution = new VerticalOrderTraversals();

        // Get the Vertical traversal
        ArrayList<ArrayList<Integer>> verticalTraversal = solution.verticalOrderTraversal(root);

        // Print the result
        System.out.print("Vertical Traversal: ");
        printResult(verticalTraversal);
    }
}
