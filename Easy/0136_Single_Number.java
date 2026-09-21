/*
 * Problem: Single Number
 * Problem ID: 136
 * Difficulty: Easy
 * Language: Java
 * Runtime: 12 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-09-21
 */

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int num : nums){
       map.put(num, map.getOrDefault(num, 0) + 1);
       }
    for(int num : nums){
    if(map.get(num)==1){
        return num;
    }
    }
    return 0;
    }
}