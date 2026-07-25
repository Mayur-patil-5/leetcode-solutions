/*
 * Problem: Maximum Product of Two Digits
 * Problem ID: 3859
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-25
 */

class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        while(n!=0){
            int d=n%10;
            if(d>max1){
                max2=max1;
                max1=d;
            }else if(d>max2){
                max2=d;
            }
            n=n/10;
        }
         return max1*max2;

    }
}