/*
 * Problem: Two Sum
 * Problem ID: 1
 * Difficulty: Easy
 * Language: Java
 * Runtime: 45 ms
 * Memory: 46.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-01
 */

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
        }
    }
    return new int[] {};
}
}