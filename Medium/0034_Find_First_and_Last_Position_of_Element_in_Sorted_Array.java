/*
 * Problem: Find First and Last Position of Element in Sorted Array
 * Problem ID: 34
 * Difficulty: Medium
 * Language: Java
 * Runtime: 99 ms
 * Memory: 48.4 MB
 * Synced From: LeetCode
 * Date: 2026-09-05
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;

        // First occurrence
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;   // aur left side check karo
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // Last occurrence
        left = 0;
        right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;    // aur right side check karo
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}