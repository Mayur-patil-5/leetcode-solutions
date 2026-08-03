/*
 * Problem: Longest Common Prefix
 * Problem ID: 14
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-03
 */

class Solution {
     public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}