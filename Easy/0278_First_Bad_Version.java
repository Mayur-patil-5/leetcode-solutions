/*
 * Problem: First Bad Version
 * Problem ID: 278
 * Difficulty: Easy
 * Language: Java
 * Runtime: 13 ms
 * Memory: 42.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start<end){
            int mid = start+(end-start)/2;

            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}