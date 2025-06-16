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
    public ListNode middleNode(ListNode head) {
        ListNode dtemp =head;
        ListNode stemp=head;
        while(dtemp!=null && dtemp.next!=null && stemp.next!=null){
            dtemp=dtemp.next.next;
            stemp=stemp.next;
        }
        return stemp;
    }
}