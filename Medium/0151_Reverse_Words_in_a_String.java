/*
 * Problem: Reverse Words in a String
 * Problem ID: 151
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 44 MB
 * Synced From: LeetCode
 * Date: 2026-09-06
 */

class Solution {
    public String reverseWords(String s) {
        String[] words =s.trim().split("\\s+");//starting/ending spaces hataata hai.
        StringBuilder ans=new StringBuilder();//ek ya multiple spaces ke basis par words separate karta hai.
        for (int i=words.length-1;i>=0;i--) {
            ans.append(words[i]);
            if (i!=0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}