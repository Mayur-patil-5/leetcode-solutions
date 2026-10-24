/*
 * Problem: Count Days Spent Together
 * Problem ID: 2496
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-24
 */

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,String arriveBob, String leaveBob){
        int[] days = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        int aStart = convert(arriveAlice, days);
        int aEnd   = convert(leaveAlice, days);
        int bStart = convert(arriveBob, days);
        int bEnd   = convert(leaveBob, days);
        // Find the overlap
        int start=Math.max(aStart,bStart);
        int end=Math.min(aEnd,bEnd);
        // If there is no overlap
        if (start>end) {
            return 0;
        }
        // Count both the starting and ending days
        return end-start+1;
    }
private int convert(String date, int[] days) {
        int month=Integer.parseInt(date.substring(0, 2));
        int day=Integer.parseInt(date.substring(3, 5));
        int total = 0;
        for (int i=0;i<month-1;i++) {
            total+=days[i];
        }
        return total+day;
    }
}
