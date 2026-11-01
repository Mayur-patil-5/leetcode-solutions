/*
 * Problem: Palindrome Number
 * Problem ID: 9
 * Difficulty: Easy
 * Language: Java
 * Runtime: 15 ms
 * Memory: 46 MB
 * Synced From: LeetCode
 * Date: 2026-11-01
 */

class Solution {
    public boolean isPalindrome(int x){
        // int original=x;
        // int reverse=0;
        // if(x<0){
        //     return false;
        // }
        // while(x>0){
        //     int digit=x%10;
        //     reverse=(reverse*10)+digit;
        //     x=x/10;
        // }
        // return original  == reverse;
        String s=String.valueOf(x);
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}