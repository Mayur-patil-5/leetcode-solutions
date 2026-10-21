/*
 * Problem: Time Needed to Buy Tickets
 * Problem ID: 2195
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.4 MB
 * Synced From: LeetCode
 * Date: 2026-10-21
 */

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i=0;i<tickets.length; i++) {
            if (i<=k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return time;
    }
}