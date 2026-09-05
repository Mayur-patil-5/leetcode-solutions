/*
 * Problem: Smallest Stable Index II
 * Problem ID: 4285
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms
 * Memory: 126.7 MB
 * Synced From: LeetCode
 * Date: 2026-09-05
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n==0){
            return -1;
        }
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        prefixMax[0] = nums[0];
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],nums[i]);
        }
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if ((int) prefixMax[i] - suffixMin[i] <= k) {
                return i;
            }
        }
        return -1;
    }
}