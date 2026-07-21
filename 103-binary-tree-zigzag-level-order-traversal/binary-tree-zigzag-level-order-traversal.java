/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> l=new ArrayList<>();
        if (root==null)return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=1;
        while(!q.isEmpty()){
            List<Integer> m=new ArrayList<>();
            int n=q.size();
            for (int i=0;i<n;i++){
                TreeNode x=q.poll();
                if (c%2==0) m.add(0,x.val);
                else m.add(x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
            l.add(m);
            c++;
        }
        return l; 
    }
}