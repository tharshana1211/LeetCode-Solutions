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
    public ListNode rev(ListNode head){
        ListNode p=null;
        ListNode c=head;
        ListNode next;

        while(c!=null){
            next=c.next;
            c.next=p;
            p=c;
            c=next;
        }
        return p;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode d=new ListNode(0);

        head=rev(head);

        d.next=head;
        ListNode x=d;
        while(x.next!=null){
            if (x.val>x.next.val) x.next=x.next.next;
            else x=x.next;
        }

        return rev(d.next);
    }
}