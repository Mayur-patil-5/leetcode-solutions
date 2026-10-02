/*
 * Problem: Search a 2D Matrix
 * Problem ID: 74
 * Difficulty: Medium
 * Language: Java
 * Runtime: N/A
 * Memory: N/A
 * Synced From: LeetCode
 * Date: 2026-10-02
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        for(int i=0;i<m;i++){
            int n=matrix[i].length;
            for(int j=0;j<n;j++){
        if(target==matrix[i][j]){
            return true;
        }
        }
        }
        return false;
    }
}