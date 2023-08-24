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
    void swap(TreeNode t){
        TreeNode t2;
        t2=t.left;
        t.left=t.right;
        t.right=t2;
    }
    void invert(TreeNode temp) {
        if (temp == null)
            return;
        invert(temp.left);
        System.out.print(temp.val + " ");
        swap(temp);
        invert(temp.left);
    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}