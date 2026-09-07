/*
 * Problem: Longest Consecutive Sequence
 * Problem ID: 128
 * Difficulty: Medium
 * Language: Java
 * Runtime: 21 ms
 * Memory: 77.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-07
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                count++;
            }
            else if(nums[i] == nums[i-1]) {
                continue;
            }
            else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}