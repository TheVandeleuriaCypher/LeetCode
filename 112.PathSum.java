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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.val == targetSum && root.left == null && root.right == null)
            return true;

        boolean leftTrue = hasPathSum(root.left, targetSum - root.val);
        boolean rightTrue = hasPathSum(root.right, targetSum - root.val);
        return (leftTrue || rightTrue);
    }
}