/*
 * Problem: Image Overlap
 * Problem ID: 864
 * Difficulty: Medium
 * Language: Java
 * Runtime: 44 ms
 * Memory: 44.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-13
 */

class Solution {
    //practice one more time.
    public static int  countoverlap(int[][] img1,int[][] img2,int row_offset,int col_offset){
        int n=img1.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int img2_i=i+row_offset;
                int img2_j=j+col_offset;
                if(img2_i<0 || img2_i>=n || img2_j<0 || img2_j>=n ){
                    continue;
                }
                if(img1[i][j]== 1 && img2[img2_i][img2_j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int result=0;
        int n=img1.length;
        int maxoverlap=0;
        for(int row_offset=-n+1;row_offset<n;row_offset++){
            for(int col_offset=-n+1;col_offset<n;col_offset++){
                int count=countoverlap(img1,img2,row_offset,col_offset);
                 result=Math.max(result,count);
            }
        }
        return result;
    }
}