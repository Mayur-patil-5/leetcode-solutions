/*
 * Problem: Minimum Moves to Equal Array Elements
 * Problem ID: 453
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-27
 */

class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];

        // minimum element find karo
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        int moves = 0;

        // har element ko minimum tak lana hai
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - min;   //sabse important line logic building line *********
        }

        return moves;
    }
}