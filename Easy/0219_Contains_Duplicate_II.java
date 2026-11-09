/*
 * Problem: Contains Duplicate II
 * Problem ID: 219
 * Difficulty: Easy
 * Language: Java
 * Runtime: 33 ms
 * Memory: 123.6 MB
 * Synced From: LeetCode
 * Date: 2026-11-09
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}