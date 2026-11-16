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
    public List<int> RightSideView(TreeNode root) {
        List<int> rightSide = new List<int>();
        findView(root,rightSide,0);
        return rightSide;
    }

    public void findView(TreeNode root , List<int> rightSide , int level){
        if(root==null) return;

        if(rightSide.Count==level){
            rightSide.Add(root.val);
        }

        findView(root.right,rightSide,level+1);
        findView(root.left,rightSide,level+1);
    }
}
