/*
 * Problem: Palindrome Number
 * Problem ID: 9
 * Difficulty: Easy
 * Language: Java
 * Runtime: 14 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-11-01
 */

class Solution {
    public boolean isPalindrome(int x){
        int original=x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit=x%10;
            reverse=(reverse*10)+digit;
            x=x/10;
        }
        return original  == reverse;
    }
}