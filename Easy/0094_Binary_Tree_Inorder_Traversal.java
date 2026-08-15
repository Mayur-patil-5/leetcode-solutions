/*
 * Problem: Binary Tree Inorder Traversal
 * Problem ID: 94
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-15
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
    public List<Integer> inorderTraversal(TreeNode root) {
       
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        // Left
        list.addAll(inorderTraversal(root.left));

        // Root
        list.add(root.val);

        // Right
        list.addAll(inorderTraversal(root.right));

        return list;
    }
}