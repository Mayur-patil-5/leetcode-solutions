/*
 * Problem: Maximum Gap
 * Problem ID: 164
 * Difficulty: Medium
 * Language: Java
 * Runtime: 45 ms
 * Memory: 91.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-30
 */

class Solution {
    public int maximumGap(int[] nums) {

        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int result = 0;

        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, nums[i] - nums[i - 1]);
        }

        return result;
    }
}