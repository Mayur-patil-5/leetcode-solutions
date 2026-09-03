/*
 * Problem: Construct Uniform Parity Array II
 * Problem ID: 4258
 * Difficulty: Medium
 * Language: Java
 * Runtime: 9 ms
 * Memory: 121.8 MB
 * Synced From: LeetCode
 * Date: 2026-09-03
 */

class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 != 0) {
                minOdd = Math.min(minOdd, num);
            }
        }

        // No odd number -> all are even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        for (int num : nums1) {
            if (num % 2 == 0 && num < minOdd) {
                return false;
            }
        }

        return true;
    }
}