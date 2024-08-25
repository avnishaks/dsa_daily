package DSA_quick_reacap.Trees.Structural_Transversal;

/*
Type of transversal in Tree: -
1. Inorder transversal: [ Left subtree → Data → Right subtree ]
2. Pre-order transversal: [ Data → Left subtree → Right subtree ]
3. Post-order transversal: [ Left subtree → Right subtree → Data ]
 */
public class TransversalTree {
    static class TreeNode {
        int value;
        TreeNode right, left;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root;

    public TransversalTree() {
        root = null;
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current; // Value already exists, no action taken
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(" " + root.value);
            inOrderTraversal(root.right);
        }
    }

    private void preOrderTransversal(TreeNode root){
        if(root!=null){
            System.out.print(" "+root.value);
            preOrderTransversal(root.left);
            preOrderTransversal(root.right);
        }
        return;
    }

    public static void main(String[] args) {
        TransversalTree tree = new TransversalTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("In-Order Transversal");

        tree.inOrderTraversal(tree.root);

        System.out.println();

        System.out.println("Pre-Order Transversal");

        tree.preOrderTransversal(tree.root);

        // You might want to add calls to traversal methods here to demonstrate the tree structure.
    }
}
