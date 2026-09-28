/*
 * Problem: Maximum Nesting Depth of the Parentheses
 * Problem ID: 1737
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-09-28
 */

class Solution {
    public int maxDepth(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
            if(ch=='('){
                count++;
                ans=Math.max(count,ans);
            }
            else if(ch==')'){
                count--;
            }
        }
        return ans;
    }
}