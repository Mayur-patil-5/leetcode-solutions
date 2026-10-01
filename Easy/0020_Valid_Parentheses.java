/*
 * Problem: Valid Parentheses
 * Problem ID: 20
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-10-01
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {  

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}