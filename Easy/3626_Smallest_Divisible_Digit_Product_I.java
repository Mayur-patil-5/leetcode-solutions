/*
 * Problem: Smallest Divisible Digit Product I
 * Problem ID: 3626
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-06
 */

class Solution {
   public int smallestNumber(int n, int t) {

        int x = n;

        while (true) {
            int temp = x;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }

            if (product % t == 0) {
                return x;
            }

            x++;
        }
    }
}