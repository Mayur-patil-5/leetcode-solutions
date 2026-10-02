/*
 * Problem: Valid Square
 * Problem ID: 593
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-10-02
 */

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        //square has 4 equl sides and 2 eql diagnls
        int d1 = distance(p1, p2);
        int d2 = distance(p1, p3);
        int d3 = distance(p1, p4);
        int d4 = distance(p2, p3);
        int d5 = distance(p2, p4);
        int d6 = distance(p3, p4);
        int[] d = {d1, d2, d3, d4, d5, d6}; //{1,1,1,1,2,2}
        Arrays.sort(d); 
        return d[0] > 0 &&
               d[0] == d[1] &&
               d[1] == d[2] &&
               d[2] == d[3] &&
               d[4] == d[5] &&
               d[4] == 2 * d[0];   //sq property diagonal=2*sides
    }
public int distance(int[] p1, int[] p2) {
        int x = p1[0] - p2[0];
        int y = p1[1] - p2[1];
        return x * x + y * y;   //dist formule 
    }
}