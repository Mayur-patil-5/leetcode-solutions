/*
 * Problem: Maximum Subarray
 * Problem ID: 53
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 77.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
         return max;
    }
}