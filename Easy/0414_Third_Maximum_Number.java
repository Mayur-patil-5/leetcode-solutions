/*
 * Problem: Third Maximum Number
 * Problem ID: 414
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 45.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-07
 */

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i + 1]) {
                count++;
                if(count == 3) {
                    return nums[i];
                }
            }
        }
        return max;
    }
}