/*
 * Problem: Majority Element
 * Problem ID: 169
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 55.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-14
 */

class Solution {
     public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {
                candidate = nums[i];
            }

            if(nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}