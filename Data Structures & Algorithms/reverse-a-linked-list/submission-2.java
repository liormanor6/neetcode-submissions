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
    public ListNode reverseList(ListNode head) {

        return recurse(head);
    }


    public ListNode recurse(ListNode curr)
    {
        if (curr == null)
        {
            return curr;
        }
        if (curr.next == null)
        {
            return curr;
        }
        ListNode head = recurse(curr.next);
        ListNode temp = curr.next;
        curr.next = null;
        temp.next = curr;
        return head;
    }
}
