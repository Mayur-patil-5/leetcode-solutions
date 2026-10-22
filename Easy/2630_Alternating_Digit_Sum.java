/*
 * Problem: Alternating Digit Sum
 * Problem ID: 2630
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 41.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-22
 */

class Solution {
    public int alternateDigitSum(int n) {
       int sum = 0;
        int count = 0;
        while (n > 0) {

            int digit = n % 10;
            if (count % 2 == 0) {
                sum-=digit;
            } else {
                sum+=digit;
            }
            count++;
            n /= 10;
        }
        if (count % 2 == 0) {
            return sum;
        } else {
            return -sum;
        }
    }
}