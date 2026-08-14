/*
 * Problem: Maximum Length Substring With Two Occurrences
 * Problem ID: 3349
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 45.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-14
 */

class Solution {
    public int maximumLengthSubstring(String s) {
    int max = 0;
    for(int i = 0; i < s.length(); i++) {
    int[] freq = new int[26];
    for(int j = i; j < s.length(); j++) {
    freq[s.charAt(j) - 'a']++;
        if(freq[s.charAt(j) - 'a'] > 2) {
        break;
        }

        max = Math.max(max, j - i + 1);
    }
}
    return max;
    }
}