/*
 * Problem: Reverse Degree of a String
 * Problem ID: 3811
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 44.2 MB
 * Synced From: LeetCode
 * Date: 2026-09-20
 */

class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int result=0;
        for(int i=0;i<n;i++){
             int value = 'z' - s.charAt(i) + 1;   //reverse the order
             int pos=i+1;   //postion of char start from 1
            result+=value*pos;  
        }
        return result;
    }
}