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
    public TreeNode InvertTree(TreeNode root) {
        if(root==null) return null;

        Queue<TreeNode> q = new Queue<TreeNode>();
        q.Enqueue(root);

        while(q.Count!=0){
            TreeNode top= q.Dequeue();
            TreeNode temp=top.left;
            top.left=top.right;
            top.right=temp;

            if(top.left!=null)
            q.Enqueue(top.left);
            if(top.right!=null)
            q.Enqueue(top.right);
        }
        
        return root;
    }
}
