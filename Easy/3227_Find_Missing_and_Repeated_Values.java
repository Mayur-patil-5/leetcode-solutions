/*
 * Problem: Find Missing and Repeated Values
 * Problem ID: 3227
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-14
 */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;

        int[] count = new int[n * n + 1];

        // Count every number
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        // Find repeated
        int repeated = 0;

        for(int i = 1; i <= n * n; i++) {
            if(count[i] > 1) {
                repeated = i;
            }
        }

        // Expected sum: 1 to n²
        int total = 0;

        for(int i = 1; i <= n * n; i++) {
            total += i;
        }

        // Actual sum, each number only once
        int sum = 0;

        for(int i = 1; i <= n * n; i++) {
            if(count[i] > 0) {
                sum += i;
            }
        }

        int missing = total - sum;

        return new int[]{repeated, missing};
    }
}