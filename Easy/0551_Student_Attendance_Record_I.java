/*
 * Problem: Student Attendance Record I
 * Problem ID: 551
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-09-15
 */

class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A') {
                absent++;
                if (absent > 1) {
                    return false;
                }
                late = 0;
            }
            else if (ch == 'L') {
                late++;
                if (late > 2) {
                    return false;
                }
            }
            else {
                late = 0;
            }
        }
        return true;
    }
}