/*
 * Problem: Reverse Integer
 * Problem ID: 7
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    public int reverse(int x) {
    int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}