/*
 * Problem: Climbing Stairs
 * Problem ID: 70
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 41.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-24
 */

class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        for(int i = 3; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
       
    }
}