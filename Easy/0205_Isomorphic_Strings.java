/*
 * Problem: Isomorphic Strings
 * Problem ID: 205
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms
 * Memory: 43.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-27
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if (smap[a]!=tmap[b]) {
                return false;
            }
            smap[a]=i+1;
            tmap[b]=i+1;
        }
        return true;
    }
}