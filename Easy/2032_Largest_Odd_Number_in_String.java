/*
 * Problem: Largest Odd Number in String
 * Problem ID: 2032
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-10-01
 */

class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}