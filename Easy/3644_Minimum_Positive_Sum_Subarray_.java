/*
 * Problem: Minimum Positive Sum Subarray 
 * Problem ID: 3644
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms
 * Memory: 45.8 MB
 * Synced From: LeetCode
 * Date: 2026-11-14
 */

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums.get(j);
                int len = j - i + 1;
                if (len >= l && len <= r && sum > 0) {
                    ans = Math.min(ans, sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}