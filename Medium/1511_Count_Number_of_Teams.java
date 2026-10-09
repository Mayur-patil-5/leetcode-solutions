/*
 * Problem: Count Number of Teams
 * Problem ID: 1511
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2204 ms
 * Memory: 44.1 MB
 * Synced From: LeetCode
 * Date: 2026-10-09
 */

class Solution {
    public int numTeams(int[] rating) {
        int count=0;
      int n=rating.length;
      for(int i=0;i<n;i++){
        int r1=rating[i];
        for(int j=i+1;j<n;j++){
            int r2=rating[j];
            for(int k=j+1;k<n;k++){
                int r3=rating[k];
                if(r1>r2 && r2>r3 || r1<r2 && r2<r3){
                    count++;
                }
            }
        }
      }
      return count;
    }
}