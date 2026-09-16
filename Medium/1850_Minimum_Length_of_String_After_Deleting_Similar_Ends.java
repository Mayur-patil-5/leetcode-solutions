/*
 * Problem: Minimum Length of String After Deleting Similar Ends
 * Problem ID: 1850
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-09-16
 */

class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right && s.charAt(left) == s.charAt(right)) {
        char ch = s.charAt(left);
        while(left <= right && s.charAt(left) == ch) {
        left++;
        }
        while(left <= right && s.charAt(right) == ch) {
        right--;
        }
        }
        return right-left+1;
    }
}
