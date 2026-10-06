/*
 * Problem: Remove Duplicates from Sorted List II
 * Problem ID: 82
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms
 * Memory: 44.4 MB
 * Synced From: LeetCode
 * Date: 2026-10-06
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode point1=head;
        ListNode point2=head.next;
        while(point2!=null){
           if(point1.val==point2.val){
               int dupli=point1.val;
               while(point2!=null && point2.val==dupli){
                point2=point2.next;
               }
               if(prev==null){
                head=point2;
               }else{
                prev.next=point2;
               }
               point1=point2;

               if(point2!=null){
                point2=point2.next;
               }
           }else{
            prev=point1;
            point1=point2;
            point2=point2.next;
           }
        }
        return head;
    }
}

//revise once more time