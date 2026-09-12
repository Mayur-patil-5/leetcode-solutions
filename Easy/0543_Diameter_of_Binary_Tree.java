/*
 * Problem: Diameter of Binary Tree
 * Problem ID: 543
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.8 MB
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
 //brrute force takes o(n^2)  worst code writing make it more optimized by running at o(n);
// class Solution {
//     public static int height(TreeNode root){
//         if(root==null){
//             return 0;
//         }
//         int leftht=height(root.left);
//         int rightht=height(root.right);
//         int height = Math.max(leftht, rightht) + 1;
//         return height;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//         int leftdia=diameterOfBinaryTree(root.left);
//         int rightdia=diameterOfBinaryTree(root.right);
//         int leftht=height(root.left);
//         int rightht=height(root.right);
//         int selfdia=leftht+rightht;

//         return Math.max(selfdia,Math.max(leftdia,rightdia));
//     }
// }
class Solution {
    static class Info {
        int diam;
        int ht;
        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam;
    }
}