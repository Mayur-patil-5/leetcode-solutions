/*
 * Problem: Search a 2D Matrix
 * Problem ID: 74
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 44 MB
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

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
