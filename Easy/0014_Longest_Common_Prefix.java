/*
 * Problem: Longest Common Prefix
 * Problem ID: 14
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-03
 */

import java.util.*;
class Solution {
     public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String str1=strs[0];
     String str2=strs[strs.length-1];
     int index=0;
     while(index<str1.length()){
        if(str1.charAt(index)==str2.charAt(index)){
            index++;
        }else{
            break;
        }
     }
      return index==0 ? "":str1.substring(0,index);
}
}