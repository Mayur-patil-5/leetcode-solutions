/*
 * Problem: Sort Colors
 * Problem ID: 75
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-05
 */

class Solution {
     public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}