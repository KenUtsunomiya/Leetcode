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
        if (root == null) {
            return false;
        }

        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int sumSoFar, int targetSum) {
        sumSoFar += node.val;
        if (node.left == null && node.right == null) {
            return sumSoFar == targetSum;
        }
        if (node.left != null && dfs(node.left, sumSoFar, targetSum)) {
            return true;
        }
        if (node.right != null && dfs(node.right, sumSoFar, targetSum)) {
            return true;
        }
        return false;
    }
}