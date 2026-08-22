/*
 * Problem: Check Divisibility by Digit Sum and Product
 * Problem ID: 3918
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-22
 */

class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int prod=1;
        int sum=0;
        while(n>0){
            int digit=n%10;
            prod=prod*digit;
            sum=sum+digit;
            n=n/10;
        }
            if(original%(prod+sum)==0){
                return true;
            }
        return false;

    }
}