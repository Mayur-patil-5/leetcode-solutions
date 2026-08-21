/*
 * Problem: Max Sum of a Pair With Equal Sum of Digits
 * Problem ID: 2473
 * Difficulty: Medium
 * Language: Java
 * Runtime: 20 ms
 * Memory: 87.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-21
 */

class Solution {
    public int maximumSum(int[] nums) {
        
        int ans = -1;
        int[] max = new int[82];

        for(int i = 0; i < nums.length; i++) {
            
            int num = nums[i];
            int sum = 0;
            int temp = num;

            while(temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }

            if(max[sum] != 0) {
                ans = Math.max(ans, nums[i] + max[sum]);
            }

            max[sum] = Math.max(max[sum], nums[i]);
        }

        return ans;
    }
}