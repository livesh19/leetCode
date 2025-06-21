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
        Set<Integer> unq = new HashSet<>();
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null){
            if(unq.contains(curr.val)){
                prev.next=curr.next;
            }
            else{
                unq.add(curr.val);
                prev=curr;
                
            }
            curr=curr.next;
            
        }
        return dummy.next;

    }
}