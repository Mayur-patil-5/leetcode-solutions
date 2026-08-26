/*
 * Problem: Find the Duplicate Number
 * Problem ID: 287
 * Difficulty: Medium
 * Language: Java
 * Runtime: 37 ms
 * Memory: 79.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-26
 */

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return -1;
    }
}