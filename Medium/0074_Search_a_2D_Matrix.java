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

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m=matrix.length;
//         for(int i=0;i<m;i++){
//             int n=matrix[i].length;
//             for(int j=0;j<n;j++){
//         if(target==matrix[i][j]){
//             return true;
//         }
//         }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}