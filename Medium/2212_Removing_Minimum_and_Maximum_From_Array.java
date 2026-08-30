/*
 * Problem: Removing Minimum and Maximum From Array
 * Problem ID: 2212
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 86.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-30
 */

class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        // Find min and max index
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Put smaller index in left
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // 3 possible ways
        int bothLeft = right + 1;
        int bothRight = n - left;
        int oneEach = (left + 1) + (n - right);

        return Math.min(bothLeft, Math.min(bothRight, oneEach));
    }
}