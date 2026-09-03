/*
 * Problem: Squares of a Sorted Array
 * Problem ID: 1019
 * Difficulty: Easy
 * Language: Java
 * Runtime: 10 ms
 * Memory: 49 MB
 * Synced From: LeetCode
 * Date: 2026-09-03
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        for(int i = 0; i < n; i++){
            res[i] = nums[i] * nums[i];
        }

        Arrays.sort(res);

        return res;
    }
}