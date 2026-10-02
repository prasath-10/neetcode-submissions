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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0 , head);
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp != null){
            ListNode next = temp.next;
            if(temp.val == val){
                prev.next = next;
            }
            else{
                prev = temp;
            }
            temp = next;
        }
        return dummy.next;
        
    }
}