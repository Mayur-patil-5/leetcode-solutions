/*
 * Problem: Diameter of Binary Tree
 * Problem ID: 543
 * Difficulty: Easy
 * Language: Java
 * Runtime: 196 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-12
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
 //brrute force takes o(n^2)
class Solution {
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
        int height = Math.max(leftht, rightht) + 1;
        return height;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftdia=diameterOfBinaryTree(root.left);
        int rightdia=diameterOfBinaryTree(root.right);
        int leftht=height(root.left);
        int rightht=height(root.right);
        int selfdia=leftht+rightht;

        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
}