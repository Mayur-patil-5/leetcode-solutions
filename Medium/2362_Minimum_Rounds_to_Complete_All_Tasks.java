/*
 * Problem: Minimum Rounds to Complete All Tasks
 * Problem ID: 2362
 * Difficulty: Medium
 * Language: Java
 * Runtime: 18 ms
 * Memory: 106.2 MB
 * Synced From: LeetCode
 * Date: 2026-09-04
 */

class Solution {
    public int minimumRounds(int[] tasks) {
       int n=tasks.length;
       int count=1;
       ArrayList<Integer> cnt = new ArrayList<>();
       Arrays.sort(tasks);
       if(n==1){
        return -1;
       }
       for(int i=1;i<n;i++){
        if(tasks[i]==tasks[i-1]){
            count++;
        }else{
            cnt.add(count);
            count=1;
        }
       }
       cnt.add(count);
       count=0;
       for(int i=0;i<cnt.size();i++){
        if(cnt.get(i)==1){
            return -1;
        }
        if(cnt.get(i)==2 || cnt.get(i)==3){
            count++;
        }
        if(cnt.get(i)>3){
            count +=(cnt.get(i)+2)/3;
        }
       }
       return count;
    }
}