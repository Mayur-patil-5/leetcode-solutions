/*
 * Problem: Best Sightseeing Pair
 * Problem ID: 1063
 * Difficulty: Medium
 * Language: Java
 * Runtime: 4 ms
 * Memory: 54.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-03
 */

class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxLeft = values[0];
        int ans = 0;
        for (int j = 1; j < values.length; j++) {
            ans = Math.max(ans, maxLeft + values[j] - j);
            maxLeft = Math.max(maxLeft, values[j] + j);
        }
        return ans;
    }
}