/*
 * Problem: Subarray Sum Equals K
 * Problem ID: 560
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1552 ms
 * Memory: 48.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        int output = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if(sum == k) {
                    output++;
                }
            }
        }
        return output;
    }
}