/*
 * Problem: Number of Segments in a String
 * Problem ID: 434
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42 MB
 * Synced From: LeetCode
 * Date: 2026-10-18
 */

// class Solution {
//     public int countSegments(String s) {
//         int n=s.length();
//         int count=0;
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             if(n==0){
//                 return 0;
//             }
//             if(ch!=' '){
//                 ch++;
//             }
//             if(ch==' '){
//                 count++;
//             }
//         }
//         return count+1;
//     }
// }

class Solution {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' &&
                (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}