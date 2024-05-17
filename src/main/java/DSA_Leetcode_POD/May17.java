package DSA_Leetcode_POD;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left , right;

    public Node(int val){
        this.val=val;
        left=right=null;
    }
}

public class May17 {
    Node root;

    public Node insertLevelOrder(Integer[] arr, int i) {
        Node root = null;
        // Base case for recursion
        if (i < arr.length && arr[i] != null) {
            root = new Node(arr[i]);

            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }

    // Method to remove leaf nodes with the target value
    public Node removeLeafNodes(Node root, int target) {
        if (root != null) {
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);

            // If the current node is a leaf and its value is equal to the target, remove it
            if (root.left == null && root.right == null && root.val == target) {
                return null;
            }
            return root;
        }
        return null;
    }

    // Utility method to print the tree in level-order traversal
    public void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp != null) {
                System.out.print(temp.val + " ");
                queue.add(temp.left);
                queue.add(temp.right);
            } else {
                System.out.print("null ");
            }
        }
    }

    public static void main(String[] args) {
       May17 tree = new May17();
        Integer[] arr = {1, 2, 3, 2, null, 2, 4};
        int target = 2;

        tree.root = tree.insertLevelOrder(arr, 0);
        tree.root = tree.removeLeafNodes(tree.root, target);

        // Print the tree after removing the target leaf nodes
        tree.printLevelOrder(tree.root);
    }

}
