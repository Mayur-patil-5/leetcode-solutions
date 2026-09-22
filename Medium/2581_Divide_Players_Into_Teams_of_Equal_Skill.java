/*
 * Problem: Divide Players Into Teams of Equal Skill
 * Problem ID: 2581
 * Difficulty: Medium
 * Language: Java
 * Runtime: 20 ms
 * Memory: 76.6 MB
 * Synced From: LeetCode
 * Date: 2026-09-22
 */

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int totalskill=0;
        int n=skill.length;
        // int sum=skill[0]+skill[n-1];
        int left=0;
        int right=n-1;
        long chem=0;
        for(int i=0;i<n;i++){
            totalskill+=skill[i];
        }
        if(totalskill%(n/2)!=0){
            return -1;
        }
        int teamskill = totalskill/(n/ 2);          //pairse mai divide krne ke liye ye 
        while(left<right){
            if(teamskill==skill[left]+skill[right])
            {
                chem += (long) skill[left] * skill[right];    //product of pairs cal krne ke liye 
                left++;
                right--;
            }else{
                return -1;
            }
        }
        return chem;
    }
}