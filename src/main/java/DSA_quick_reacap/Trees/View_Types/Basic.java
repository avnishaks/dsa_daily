/*
  static class TreeGraph {
        int val;
        TreeGraph left;
        TreeGraph right;

        public TreeGraph(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }
    private TreeGraph root;
    private void setChildren(TreeGraph node, TreeGraph leftChild, TreeGraph rightChild) {
        if (node != null) {
            node.left = leftChild;
            node.right = rightChild;
        }
    }

    public static void main(String[] args) {
        BalanceBinaryTree balanceBinaryTree=new BalanceBinaryTree();
        balanceBinaryTree.root=new TreeGraph(1);
        TreeGraph node2 = new TreeGraph(2);
        TreeGraph node3 = new TreeGraph(3);
        TreeGraph node4 = new TreeGraph(4);
        TreeGraph node5 = new TreeGraph(5);
        TreeGraph node6 = new TreeGraph(6);
        TreeGraph node7 = new TreeGraph(7);
        TreeGraph node8 = new TreeGraph(8);
        balanceBinaryTree.setChildren(balanceBinaryTree.root, node2, node3);
        balanceBinaryTree.setChildren(node2, node4, node5);
        balanceBinaryTree.setChildren(node3, node6, node7);
        balanceBinaryTree.setChildren(node4, node8, null);

    }
 */

