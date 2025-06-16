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
    public boolean isPalindrome(ListNode head) {
     ListNode Ftemp = head;
     ListNode Stemp = head;
     while(Ftemp.next!=null && Ftemp.next.next!=null){
        Ftemp = Ftemp.next.next;
        Stemp=Stemp.next;
     }
     ListNode reversed = reverseLinkedList(Stemp.next);
     ListNode temp= head;
     while(reversed.next!=null){
        if(temp.val!=reversed.val){
            return false;
        }
        temp=temp.next;
        reversed=reversed.next;
        
     }
     return true;
    }
    public ListNode reverseLinkedList(ListNode node){
        ListNode temp = node;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}