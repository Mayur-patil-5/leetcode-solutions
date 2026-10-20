/*
 * Problem: Ugly Number
 * Problem ID: 263
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.2 MB
 * Synced From: LeetCode
 * Date: 2026-10-20
 */

class Solution {
    public boolean isUgly(int n) {
       if(n<=0){
        return false;
       }
       while(n%2==0){
        n=n/2;
       }
       while(n%3==0){
        n=n/3;
       }
       while(n%5==0){
        n=n/5;
       }
       return n==1;
    }
}