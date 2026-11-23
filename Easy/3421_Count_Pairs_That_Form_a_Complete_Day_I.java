/*
 * Problem: Count Pairs That Form a Complete Day I
 * Problem ID: 3421
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms
 * Memory: 43.7 MB
 * Synced From: LeetCode
 * Date: 2026-11-23
 */

class Solution {
    public int countCompleteDayPairs(int[] hours) {
         int n=hours.length;
         int count=0;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((hours[i]+hours[j])%24==0){
                    count++;
                }
            }
         }
         return  count;
    }
}