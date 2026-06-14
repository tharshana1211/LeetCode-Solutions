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
    public int pairSum(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode c1=rev(s);
        ListNode c2=head;

        int x=0;
        while(c1!=null){
            x=Math.max(c1.val+c2.val,x);
            c1=c1.next;
            c2=c2.next;
        }

        return x;
    }
}