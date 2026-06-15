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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode t=null;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            t=s;
            s=s.next;
            f=f.next.next;
        }
        t.next=t.next.next;
        return head;
    }
}