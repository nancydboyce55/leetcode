/**
 * Reverse a singly linked list.
 * 
 * Hint:
 * A linked list can be reversed either iteratively or recursively. 
 * Could you implement both?
 * 
 * https://leetcode.com/problems/reverse-linked-list/description/
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}