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
        ListNode temp = head;
        Stack<Integer> sc = new Stack <>();
        while(temp != null){
            sc.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        System.out.println(sc);
        while(temp != null && !sc.isEmpty()){
            if(temp.val != sc.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
        
    }
}