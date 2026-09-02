/*
 * Problem: Construct Uniform Parity Array I
 * Problem ID: 4256
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 45 MB
 * Synced From: LeetCode
 * Date: 2026-09-02
 */

class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean hasEven = false;
        boolean hasOdd = false;

        for (int num : nums1) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // If there is an even number, we can make the array uniform
        if (hasEven) {
            return true;
        }

        // All numbers are odd
        // They can also be made uniform
        return true;
    }
}