/*
 * Problem: Next Greater Element II
 * Problem ID: 503
 * Difficulty: Medium
 * Language: Java
 * Runtime: 92 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-18
 */

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n; //circular hai isliye 
                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }
        return ans;
    }
}