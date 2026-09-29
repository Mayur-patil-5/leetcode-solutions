/*
 * Problem: House Robber
 * Problem ID: 198
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.2 MB
 * Synced From: LeetCode
 * Date: 2026-09-29
 */

class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if (n == 1) {
            return nums[0];
        }
        int prev2 = 0;
        int prev1 = 0;
        for (int i = 0; i < n; i++) {
            int take = nums[i] + prev2;
            int skip = prev1;
            int current = Math.max(take, skip);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}