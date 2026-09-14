/*
 * Problem: Rectangle Overlap
 * Problem ID: 866
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.8 MB
 * Synced From: LeetCode
 * Date: 2026-09-14
 */

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //rec1=[x1,y1,x2,y2]
        //rec2=[a1,b1,a2,b2]
        //overlap ke condition dekhne se acha no overlap dekho bs kb kb ho rha 
        //overlap kab nhi honga jb overlap nhi honga 
        //[r1][r2] [r2][r1] top[r1]bottom[r2] top[r2]bottom[r1]
        //once revisit draw the diagram
        if(rec1[2]<=rec2[0] || rec2[2]<=rec1[0] || rec1[3]<=rec2[1] || rec2[3]<=rec1[1]){
            return false;
        }  
        return true;
    }
}