/*
 * Problem: Sum Game
 * Problem ID: 2039
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-23
 */

class Solution {
    public boolean sumGame(String num) {

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        int mid = num.length() / 2;

        for (int i = 0; i < mid; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = mid; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        int diff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        if(qDiff == 0){
            if(diff==0){
                return false;
            }else{
                return true;
            }
        }
        else if((leftQ+rightQ)%2 !=0){
            return true;
        }
        else{
            int maxDiff=-9* qDiff/2;
            if(diff == maxDiff){
                return false;
            }else{
                return true;
            }
        }
    }
}