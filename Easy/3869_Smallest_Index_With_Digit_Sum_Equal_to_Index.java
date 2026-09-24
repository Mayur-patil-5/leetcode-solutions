/*
 * Problem: Smallest Index With Digit Sum Equal to Index
 * Problem ID: 3869
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 45.6 MB
 * Synced From: LeetCode
 * Date: 2026-09-24
 */

class Solution {
    public int smallestIndex(int[] nums) {
    for(int i=0;i<nums.length;i++){
    int num=nums[i];
    int sum=0;
    while(num>0){
        int digit=num%10;
        sum +=digit;
        num =num/10;
    }
    if(sum == i){
        return i;
    }
    }
    return -1;
    }
}
