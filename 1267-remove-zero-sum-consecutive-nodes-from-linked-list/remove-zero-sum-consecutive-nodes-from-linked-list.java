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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            int sum = 0;
            ListNode temp = curr;

            while (temp != null) {
                sum += temp.val;
                if (sum == 0) {
                    prev.next = temp.next;
                    curr = temp.next;
                    break;
                }
                temp = temp.next;
            }

            if (temp == null) {
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
