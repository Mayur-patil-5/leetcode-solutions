/*
 * Problem: Remove Duplicates from Sorted Array
 * Problem ID: 26
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-02
 */

class Solution {
   public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}