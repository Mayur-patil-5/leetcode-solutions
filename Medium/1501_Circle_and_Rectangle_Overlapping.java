/*
 * Problem: Circle and Rectangle Overlapping
 * Problem ID: 1501
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.3 MB
 * Synced From: LeetCode
 * Date: 2026-09-19
 */

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if(xCenter+radius<x1||xCenter-radius>x2||yCenter+radius<y1||yCenter-radius>y2){
            return false;
           }
           //the corner case conditions
        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));
        int dx = xCenter - closestX;
        int dy = yCenter - closestY;
        if(dx*dx+dy*dy>radius*radius){
            return false;
        }
           return true;
    }
}