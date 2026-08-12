/*
 * Problem: Number of Students Doing Homework at a Given Time
 * Problem ID: 1560
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-12
 */

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for(int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }

        return count;
    }
}