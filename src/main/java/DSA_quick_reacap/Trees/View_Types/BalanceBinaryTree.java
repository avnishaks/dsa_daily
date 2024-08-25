package DSA_quick_reacap.Trees.View_Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BalanceBinaryTree {
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
    private int isBalanced(TreeGraph root){
        if(root==null) return 0;
        int left_height=isBalanced(root.left);
        if(left_height==-1) return left_height;
        int right_height=isBalanced(root.right);
        if(right_height==-1) return right_height;
        if(Math.abs(left_height-right_height)>1) return -1;
        return 1+Math.max(left_height,right_height);
    }

    private static final ArrayList<ArrayList<Integer>> listLevelOrder=new ArrayList<>();


    private ArrayList<ArrayList<Integer>> levelOrder(TreeGraph root){
        if(root==null) return listLevelOrder;
        Queue<TreeGraph> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> tempList = new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeGraph temp=q.peek();
                q.poll();
                tempList.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            listLevelOrder.add(tempList);
        }

        return listLevelOrder;
    }


    /*
            Finding the top view of the binary tree
     */

    private static final ArrayList<Integer> topViewList=new ArrayList<>();

    private ArrayList<Integer> topViewBT(TreeGraph root){
        if(root==null) return topViewList;
        if(root.left==null && root.right==null){
            topViewList.add(root.val);
            return topViewList;
        }
        TreeGraph lleft=root.left;
        TreeGraph rright=root.right;

        topViewList.add(root.val);

        while(lleft!=null){
            topViewList.add(lleft.val);
            lleft=lleft.left;
        }

        while (rright!=null){
            topViewList.add(rright.val);
            rright=rright.right;
        }
        return topViewList;
    }


    /*

    ZigZag Level Order Traversal BT


     */

    private static final ArrayList<ArrayList<Integer>> zigzagList=new ArrayList<>();

    private ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeGraph root){
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeGraph> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeGraph node = q.poll();
                if (leftToRight) {
                    temp.add(node.val);
                } else {
                    temp.add(0, node.val);
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }


            leftToRight = !leftToRight;
            zigzagList.add(temp);
        }
        return zigzagList;
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
        int ans = balanceBinaryTree.isBalanced(balanceBinaryTree.root) == -1 ? 0 : 1;

        System.out.println("Given binary tree is balance : "+ans);


        System.out.println("Level order for the Binary Tree : ");

        balanceBinaryTree.levelOrder(balanceBinaryTree.root);
        for (ArrayList<Integer> integers : listLevelOrder) {
            System.out.print(integers + " ");
        }

        System.out.println();


        System.out.println(" Top View of the Binary Tree : ");

        balanceBinaryTree.topViewBT(balanceBinaryTree.root);

        for(Integer integers:topViewList){
            System.out.print(integers+" ");
        }


        System.out.println();

        System.out.println("ZigZag Level Order Traversal BT");

        balanceBinaryTree.zigzagLevelOrder(balanceBinaryTree.root);
        for (ArrayList<Integer> integers : zigzagList) {
            System.out.print(integers + " ");
        }







    }

}
