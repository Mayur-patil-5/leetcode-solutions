/*
 * Problem: Pass the Pillow
 * Problem ID: 2645
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 41.5 MB
 * Synced From: LeetCode
 * Date: 2026-11-04
 */

class Solution {
    public int passThePillow(int n, int time) {
        int position=time%(2*(n-1));
        if(position<n){
            return position+1;
        }
        return 2*n-1-position;
    }
}