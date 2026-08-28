/*
 * Problem: Bulb Switcher
 * Problem ID: 319
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42 MB
 * Synced From: LeetCode
 * Date: 2026-08-28
 */

class Solution {
    public int bulbSwitch(int n) {
        // return (int)Math.sqrt(n); one line solution for it 
        //core logic building of the line
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            count++;
        }
        return count;
    }
}