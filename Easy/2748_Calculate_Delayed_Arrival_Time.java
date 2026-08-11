/*
 * Problem: Calculate Delayed Arrival Time
 * Problem ID: 2748
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-11
 */

class Solution {
    // public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    //     int result=arrivalTime+delayedTime;
    //     if(result==24){
    //         return 0;
    //     }
    //     if(result==25){
    //         return 1;
    //     }
    //     return result;
    // }
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    return (arrivalTime + delayedTime) % 24;
}
}