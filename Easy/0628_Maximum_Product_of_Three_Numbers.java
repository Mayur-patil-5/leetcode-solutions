/*
 * Problem: Maximum Product of Three Numbers
 * Problem ID: 628
 * Difficulty: Easy
 * Language: Java
 * Runtime: 17 ms
 * Memory: 48.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-26
 */

class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}
 