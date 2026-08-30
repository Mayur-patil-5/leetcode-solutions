/*
 * Problem: Longest Substring Without Repeating Characters
 * Problem ID: 3
 * Difficulty: Medium
 * Language: Java
 * Runtime: 65 ms
 * Memory: 47.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-30
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}