/*
 * Problem: Earliest Time to Finish One Task
 * Problem ID: 4012
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 47.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class Solution {
    public int earliestTime(int[][] tasks) {
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < tasks.length; i++){
    int finish = tasks[i][0] + tasks[i][1];
    ans = Math.min(ans, finish);
} 
    return ans;
    }
}