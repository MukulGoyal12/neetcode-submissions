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
    public int DiameterOfBinaryTree(TreeNode root) {
        int[] max= new int[1];
        Diameter(root,max);
        return max[0];
    }

    public int Diameter(TreeNode root,int[] max){
        if(root == null)return 0;

        int left=Diameter(root.left,max);
        int right=Diameter(root.right,max);
        max[0]=Math.Max(max[0],left+right);

        return Math.Max(left,right)+1;
    }
}
