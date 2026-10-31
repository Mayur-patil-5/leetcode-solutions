/*
 * Problem: Remove Trailing Zeros From a String
 * Problem ID: 2819
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 45.9 MB
 * Synced From: LeetCode
 * Date: 2026-10-31
 */

class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        while(num.charAt(n-1)=='0'){
            n--;
        }
        return num.substring(0, n);
    }
}