/*
 * Problem: Valid Triangle Number
 * Problem ID: 611
 * Difficulty: Medium
 * Language: Java
 * Runtime: 27 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-10-09
 */

// class Solution {
//     public int triangleNumber(int[] nums) {
//         int count=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int size1=nums[i];
//             for(int j=i+1;j<n;j++){
//                 int size2=nums[j];
//                 for(int k=j+1;k<n;k++){
//                     int size3=nums[k];
//                     if(size1+size2>size3){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }


// optimized way

import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        int n = nums.length;

        Arrays.sort(nums);

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;
    }
}