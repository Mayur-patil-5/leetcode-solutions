/*
 * Problem: Shuffle String
 * Problem ID: 1651
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-15
 */

class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] answer = new char[n];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            answer[indices[i]] = ch;
        }
         return new String(answer);
    }
}