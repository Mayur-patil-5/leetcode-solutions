/*
 * Problem: Count Nodes Equal to Average of Subtree
 * Problem ID: 2347
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 45.7 MB
 * Synced From: LeetCode
 * Date: 2026-09-10
 */

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
    int answer = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return answer;
    }
    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        // Get left subtree sum and count
        int[] left = dfs(root.left);
        // Get right subtree sum and count
        int[] right = dfs(root.right);
        // Total sum
        int sum = left[0] + right[0] + root.val;
        // Total nodes
        int count = left[1] + right[1] + 1;
        // Average
        int average = sum / count;
        // Check
        if (root.val == average) {
            answer++;
        }
        // Return sum and count
        return new int[]{sum, count};
    }
}