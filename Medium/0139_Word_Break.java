/*
 * Problem: Word Break
 * Problem ID: 139
 * Difficulty: Medium
 * Language: Java
 * Runtime: 10 ms
 * Memory: 46.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-13
 */

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}