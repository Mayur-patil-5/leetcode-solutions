/*
 * Problem: Delete Node in a Linked List
 * Problem ID: 237
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 45.5 MB
 * Synced From: LeetCode
 * Date: 2026-09-12
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode head = node;   //jo node delete krna hai usse head bana diya
        // [4.5(head),1,9]
        head.val = head.next.val; //usse delete nhi kr rhee hai bs val replace kr rhe hai 
        //[4,1,1,9]
        head.next = node.next.next; //jiske val se replace kiya usko skip kiya kara
        //[4,1,9]      
    }
}