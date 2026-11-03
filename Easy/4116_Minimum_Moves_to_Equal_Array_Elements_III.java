/*
 * Problem: Minimum Moves to Equal Array Elements III
 * Problem ID: 4116
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 46.3 MB
 * Synced From: LeetCode
 * Date: 2026-11-03
 */

class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            res+=nums[n-1]-nums[i];
        }
        return res;
    }
}