package DSA_Leetcode_POD;


class TreeNode{
    int val;
    TreeNode left , right;

    public TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}

public class May18 {


    int count =0;
    int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_extra=helper(root.left);
        int right_extra=helper(root.right);
        count+=Math.abs(left_extra)+Math.abs(right_extra);
        return root.val + left_extra + right_extra - 1;
    }
    public int distributeCoins(TreeNode root) {
        helper(root);
        return count;
    }

    public static void main(String[] args) {
        // Write the Driver code run the code
    }
}
