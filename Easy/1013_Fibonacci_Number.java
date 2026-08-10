/*
 * Problem: Fibonacci Number
 * Problem ID: 1013
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-10
 */

class Solution {
     public int fib(int n) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return a;
    }
}