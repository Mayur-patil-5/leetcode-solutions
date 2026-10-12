/*
 * Problem: Combination Sum
 * Problem ID: 39
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms
 * Memory: 45.8 MB
 * Synced From: LeetCode
 * Date: 2026-10-12
 */

import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0, candidates, target, list, result);
        return result;
    }
    public void solve(int index, int[] candidates, int target,
                      List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (index == candidates.length || target < 0) {
            return;
        }
        // Pick the current element
        list.add(candidates[index]);
        solve(index, candidates, target - candidates[index], list, result);
        // Backtrack: remove the element
        list.remove(list.size() - 1);
        // Skip the current element
        solve(index + 1, candidates, target, list, result);
    }
}
// ???????????????????????????????? bayankar level of backtracking
