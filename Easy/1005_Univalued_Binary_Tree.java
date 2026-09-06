/*
 * Problem: Univalued Binary Tree
 * Problem ID: 1005
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-09-06
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
    public boolean isUnivalTree(TreeNode root) {
       if(root == null){
        return true;
       }
       if(root.left !=null && root.left.val!=root.val){
        return false;
       }
       if(root.right !=null && root.right.val!=root.val){
        return false;
       }
       return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}