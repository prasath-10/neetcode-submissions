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
    public void reverse(ArrayList<Integer> ans , int left , int right){
        while(left <= right){
            int temp = ans.get(left);
            ans.set(left , ans.get(right));
            ans.set(right , temp);
            left++;
            right--;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(head != null){
            ans.add(head.val);
            head = head.next;
        }
         reverse(ans , left - 1 , right - 1);
        
        ListNode dummy =  new ListNode(0);
        ListNode curr = dummy;
        for(int i = 0 ; i  < ans.size() ; i++)
        {
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }
        return dummy.next;
        
    }
}