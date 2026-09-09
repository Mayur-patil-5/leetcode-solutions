/*
 * Problem: Count Commas in Range II
 * Problem ID: 4248
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-09-09
 */

class Solution {
    public long countCommas(long n) {
        long ans = 0;      //ans store kr rhe hai
        long start = 1000; //range hr baar bdege
        long commas = 1;   //commas counting
        while (start <= n) {
            long end = start * 1000 - 1;   //numbers between rrange including 
            if (end > n) {
                end = n;
            }
            ans += (end - start + 1) * commas;    //commmas wale numbers
            start *= 1000;                        //range increase krte jayenge
            commas++;                            
        }
        return ans;
    }
}