/*
 * Problem: Binary Tree Postorder Traversal
 * Problem ID: 145
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        if(root == null){
            return ls;
        }
        ls.addAll(postorderTraversal(root.left));
        ls.addAll(postorderTraversal(root.right));
        ls.add(root.val);
        return ls;
    }
}