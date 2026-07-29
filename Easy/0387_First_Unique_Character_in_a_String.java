/*
 * Problem: First Unique Character in a String
 * Problem ID: 387
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms
 * Memory: 47.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-29
 */

import java.util.*;
class Solution {
        public static int firstUniqChar(String s) {
        int freq[]=new int[26];
        for (int i=0;i<s.length();i++) {
        freq[s.charAt(i)-'a']++;
    }
        for (int i=0;i<s.length();i++) {
        if(freq[s.charAt(i)-'a']==1){
        return i;
    }
}

        return -1;
    }
}