/*
 * Problem: Minimum Number of Changes to Make Binary String Beautiful
 * Problem ID: 3174
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 46.6 MB
 * Synced From: LeetCode
 * Date: 2026-11-18
 */

class Solution {
    public int minChanges(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = left+1;
        int cnt=0;
        

        while(right<chars.length){
           if(chars[left]!=chars[right]){
            cnt++;
            
           }
           left+=2;
           right+=2;
        }
        return cnt;
        

        
    }
}