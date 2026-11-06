/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {
    public bool IsBalanced(TreeNode root) {
        if(root==null) return true;

        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.Abs(lh-rh)>1) return false;

        bool left = IsBalanced(root.left);
        bool right = IsBalanced(root.right);

        return left && right;
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.Max(left,right)+1;
    }
}
