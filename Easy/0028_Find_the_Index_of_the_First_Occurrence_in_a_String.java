/*
 * Problem: Find the Index of the First Occurrence in a String
 * Problem ID: 28
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-22
 */

class Solution {
    public int strStr(String haystack, String needle) {

        int length1 = haystack.length();
        int length2 = needle.length();

        for (int i = 0; i <= length1 - length2; i++) {

            int j = 0;

            while (j < length2 && 
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == length2) {
                return i;
            }
        }

        return -1;
    }
}