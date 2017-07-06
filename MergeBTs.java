/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode node = null;
        if(t1 != null && t2 != null){
            t1.val += t2.val;
            node = t1;
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
        }else if(t1 != null){
            node = t1;
            node.left = mergeTrees(node.left, null);
            node.right = mergeTrees(node.right, null);
        }else if(t2 != null){
            node = t2;
            node.left = mergeTrees(null, node.left);
            node.right = mergeTrees(null, node.right);
        }else{
            node = null;
        }
        return node;
    }
}
