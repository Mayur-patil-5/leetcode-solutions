/*
 * Problem: Smallest Missing Integer Greater Than Sequential Prefix Sum
 * Problem ID: 3236
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class Solution {
    public int missingInteger(int[] nums) {
       int sum = nums[0];

        // Longest sequential prefix ka sum
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Sum se start karke missing number find karo
        while (true) {

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }
}