/*
 * Problem: Minimum Add to Make Parentheses Valid
 * Problem ID: 957
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-10-06
 */

class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
            }else{
            if(open>0){
                open--;
            }else{
                ans++;
            }
            }
            
        }
        return open+ans;
    }
}