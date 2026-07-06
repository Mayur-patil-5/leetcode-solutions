/*
 * Problem: Missing Number
 * Problem ID: 268
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-06
 */

class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int total = l;
        int summ = 0;
        
        
        for (int i = 0; i < l; i++) {
            total += i;
            summ += nums[i];
        }
        
        
        return total - summ;
    }
}