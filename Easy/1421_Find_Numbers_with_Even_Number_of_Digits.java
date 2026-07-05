/*
 * Problem: Find Numbers with Even Number of Digits
 * Problem ID: 1421
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 44.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-05
 */

class Solution {
     public static int findNumbers(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            int digitCount = 0;

            while (temp != 0) {
                temp = temp / 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}