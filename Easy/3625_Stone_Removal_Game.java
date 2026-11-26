/*
 * Problem: Stone Removal Game
 * Problem ID: 3625
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 41.6 MB
 * Synced From: LeetCode
 * Date: 2026-11-26
 */

class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10;
        int moves = 0;
        while (n>=stones) {
            n -=stones;
            stones--;
            moves++;
        }
        return moves%2==1;
    }
}