/*
 * Problem: Lowest Common Ancestor of a Binary Tree
 * Problem ID: 236
 * Difficulty: Medium
 * Language: Java
 * Runtime: 15 ms
 * Memory: 69.9 MB
 * Synced From: LeetCode
 * Date: 2026-09-13
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null){
        return null;
       }
       if(root.val==p.val || root.val==q.val){
        return root;
       }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(right==null){
            return left;
        }
        if(left==null){
            return right;
        }
        return root;
    }
}