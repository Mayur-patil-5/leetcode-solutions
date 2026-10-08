/*
 * Problem: Remove Outermost Parentheses
 * Problem ID: 1078
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms
 * Memory: 43.3 MB
 * Synced From: LeetCode
 * Date: 2026-10-08
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans= new StringBuilder();
        int next=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(next>0){
                ans.append(ch);
                }
                next++;
            }else{
                next--;
                if(next>0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}