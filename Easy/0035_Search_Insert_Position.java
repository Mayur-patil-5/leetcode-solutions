/*
 * Problem: Search Insert Position
 * Problem ID: 35
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-16
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        for (int i=0;i<n;i++) {
            if (nums[i]>=target) {
                return i;
            }
        }
        return n;
    }
}