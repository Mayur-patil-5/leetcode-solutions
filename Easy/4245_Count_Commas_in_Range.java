/*
 * Problem: Count Commas in Range
 * Problem ID: 4245
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 42.4 MB
 * Synced From: LeetCode
 * Date: 2026-09-08
 */

class Solution {
    public int countCommas(int n) {
        // return Math.max(n-999,0);  
        int count=0;
        for(int i=1000;i<=n;i++){
            count++;
        }
        return count;
    }
}