package DSA_quick_reacap.Trees.Structural_Transversal;

public class BinaryTreeInorderPostorder {
    static class TreeNode{
        int value;
        TreeNode left,right;
        public TreeNode(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    TreeNode root;
    private static TreeNode helper(int [] inorder,int [] postorder,int startIdx,int endIdx,int[] rootIdx){
        if(startIdx>endIdx) return null;
        TreeNode root=new TreeNode(postorder[rootIdx[0]]);
        rootIdx[0]--;
        int midIdx=-1;
        for(int i=startIdx;i<=endIdx;i++){
            if(inorder[i]==root.value){
                midIdx=i;
                break;
            }
        }

        root.right=helper(inorder,postorder,midIdx+1,endIdx,rootIdx);
        root.left=helper(inorder,postorder,startIdx,midIdx-1,rootIdx);

        return root;
    }

    private static TreeNode printTree(int[] inorder, int[] postorder){
        int[] rootIdx = {postorder.length - 1};
        return helper(inorder,postorder,0,inorder.length-1,rootIdx);
    }

    private static void printTreeTransversal(TreeNode root){
        if(root==null) return;
        printTreeTransversal(root.left);
        System.out.print(" "+root.value);
        printTreeTransversal(root.right);
    }

    public static void main(String[] args) {
        int [] inorder=new int[]{2,1,3};
        int [] postorder=new int[]{2,3,1};
        TreeNode root= printTree(inorder,postorder);
        printTreeTransversal(root);
    }
}
