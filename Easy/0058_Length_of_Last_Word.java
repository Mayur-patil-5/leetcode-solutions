/*
 * Problem: Length of Last Word
 * Problem ID: 58
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-08-01
 */

class Solution {
     public static  int lengthOfLastWord(String str) {
        int count=0;
       for (int i=str.length()-1;i>=0;i--) {
       char ch=str.charAt(i);
       if (ch==' ') {
        if (count == 0)
            continue;
        else
            break;
    }
    count++;
}
return count;
    }
}