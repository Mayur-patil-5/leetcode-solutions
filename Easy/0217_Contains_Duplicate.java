/*
 * Problem: Contains Duplicate
 * Problem ID: 217
 * Difficulty: Easy
 * Language: Java
 * Runtime: 18 ms
 * Memory: 108.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-25
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}