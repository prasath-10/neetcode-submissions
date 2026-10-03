/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> sc = new HashSet <> ();
        ListNode temp = headA;
        while(temp != null){
            sc.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(sc.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
        
    }
}