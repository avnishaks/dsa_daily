package DSA_quick_reacap.Trees.Structural_Transversal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BinaryTreeInOrderPreOrder {
    static class TreeNode {
        int val;
        TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private static TreeNode helper(ArrayList<Integer> inorder, ArrayList<Integer> preorder, int startIdx, int endIdx, int[] rootIdx) {
        if (startIdx > endIdx) return null;
        TreeNode root = new TreeNode(preorder.get(rootIdx[0]));
        int midIdx = -1;
        for (int i = startIdx; i <= endIdx; i++) {
            if (Objects.equals(inorder.get(i), preorder.get(rootIdx[0]))) {
                midIdx = i;
                break;
            }
        }
        rootIdx[0]++;
        root.left = helper(inorder, preorder, startIdx, midIdx - 1, rootIdx);
        root.right = helper(inorder, preorder, midIdx + 1, endIdx, rootIdx);
        return root;
    }

    private static TreeNode binaryTreeInOrderPreOrder(ArrayList<Integer> inorder, ArrayList<Integer> preorder) {
        int[] rootIdx = {0};
        return helper(inorder, preorder, 0, inorder.size() - 1, rootIdx);
    }

    private static void printTreeTraversal(TreeNode root) {
        if (root == null) return;
        printTreeTraversal(root.left);
        System.out.print(" " + root.val);
        printTreeTraversal(root.right);
    }

    public static void main(String[] args) {
        ArrayList<Integer> inorder = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> preorder = new ArrayList<>(Arrays.asList(3, 2, 4, 1, 5));
        TreeNode root = binaryTreeInOrderPreOrder(preorder, inorder);
        printTreeTraversal(root);
    }
}
