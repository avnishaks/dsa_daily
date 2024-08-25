package DSA_quick_reacap.Trees.View_Types;
//
//public class Basic {
//
//}

/*
 static class TreeGraph {
        int val;
        TreeGraph left, right;

        public TreeGraph(int value) {
            this.val = value;
            this.left = null;
            this.right = null;
        }
    }

    private TreeGraph root;
    private final ArrayList<Integer> answer = new ArrayList<>();

    public RightViewTree() {
        root = null;
    }

    // Method to set children of a node
    private void setChildren(TreeGraph node, TreeGraph leftChild, TreeGraph rightChild) {
        if (node != null) {
            node.left = leftChild;
            node.right = rightChild;
        }
    }

    private void getRightViewTree(TreeGraph node) {
        if (node == null) {
            return;
        }

        Queue<TreeGraph> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                TreeGraph temp = queue.poll();
                if (i == size) {
                    assert temp != null;
                    answer.add(temp.val);
                }
                assert temp != null;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        RightViewTree rightViewTree = new RightViewTree();
        rightViewTree.root = new TreeGraph(1);

        TreeGraph node2 = new TreeGraph(2);
        TreeGraph node3 = new TreeGraph(3);
        TreeGraph node4 = new TreeGraph(4);
        TreeGraph node5 = new TreeGraph(5);
        TreeGraph node6 = new TreeGraph(6);
        TreeGraph node7 = new TreeGraph(7);
        TreeGraph node8 = new TreeGraph(8);

        rightViewTree.setChildren(rightViewTree.root, node2, node3);
        rightViewTree.setChildren(node2, node4, node5);
        rightViewTree.setChildren(node3, node6, node7);
        rightViewTree.setChildren(node4, node8, null);

        System.out.println("Computing right view of the tree:");
        rightViewTree.getRightViewTree(rightViewTree.root);
        System.out.println("Right view elements are:");
        for (int val : rightViewTree.answer) {
            System.out.print(val + " ");
        }
    }
 */
