/*
 * Problem: Find Peak Element
 * Problem ID: 162
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}