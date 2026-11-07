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
    public List<List<int>> LevelOrder(TreeNode root) {
        if(root==null)return new List<List<int>>();
        Queue<TreeNode> q= new Queue<TreeNode>();
        List<List<int>> traversal = new List<List<int>>();
        q.Enqueue(root);
        while(q.Count!=0){
            int level=q.Count;
            List<int> lev = new List<int>();
            for(int i=0;i<level;i++){
                TreeNode top = q.Dequeue();
                lev.Add(top.val);
                if(top.left!=null){
                    q.Enqueue(top.left);
                }
                if(top.right!=null){
                    q.Enqueue(top.right);
                }
            }
            traversal.Add(lev);
        }
        return traversal;
    }
}
