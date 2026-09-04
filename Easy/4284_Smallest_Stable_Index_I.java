/*
 * Problem: Smallest Stable Index I
 * Problem ID: 4284
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-04
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        // suffix minimum
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        // prefix maximum
        int maxLeft = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);

            int score = maxLeft - minRight[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}