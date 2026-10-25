/*
 * Problem: Total Distance Traveled
 * Problem ID: 2857
 * Difficulty: Easy
 * Language: Java
 * Runtime: 16 ms
 * Memory: 45.6 MB
 * Synced From: LeetCode
 * Date: 2026-10-25
 */

// class Solution {
//     public int distanceTraveled(int mainTank, int additionalTank) {
//         int distance=0;
//         while(mainTank>=5){
//             mainTank-=5;
//             distance+=50;
//             if(additionalTank>0){
//                 mainTank++;
//                 additionalTank--;
//             }
//         }
//         distance+=mainTank*10;
//         return distance;
//     }
// }

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int transfers = Math.min((mainTank - 1) / 4, additionalTank);
        return (mainTank + transfers) * 10;
    }
}

