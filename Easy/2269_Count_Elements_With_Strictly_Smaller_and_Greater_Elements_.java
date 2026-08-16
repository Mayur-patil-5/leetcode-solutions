/*
 * Problem: Count Elements With Strictly Smaller and Greater Elements 
 * Problem ID: 2269
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-16
 */

class Solution {
    public int countElements(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }

        if (nums[i] > max) {
            max = nums[i];
        }
    }

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > min && nums[i] < max) {
            count++;
        }
    }

    return count;
}
}