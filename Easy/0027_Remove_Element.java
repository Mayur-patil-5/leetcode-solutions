/*
 * Problem: Remove Element
 * Problem ID: 27
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-09
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}