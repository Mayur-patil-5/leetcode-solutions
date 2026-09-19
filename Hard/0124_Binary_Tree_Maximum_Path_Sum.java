/*
 * Problem: Binary Tree Maximum Path Sum
 * Problem ID: 124
 * Difficulty: Hard
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-19
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
 //cases 
//  1.sum of leftsubtree and right subtree plus root
//2.max of leftsubtree and rigthsubtree plus root
//3.only root is maxmium among three.
class Solution {
    int maxsum;
    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);

        //cases trust the process
        //niche hi milega answer
        int a=left+right+root.val;
         //koi_acha_hai
         int b=Math.max(left,right)+root.val;
         //only root acha hai
         int c=root.val;
         int sum=Math.max(b,c);
         maxsum=Math.max(maxsum,Math.max(a,sum));

         return sum;
    }
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        solve(root);
        return maxsum;
    }
}