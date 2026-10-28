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
    public int pairSum(ListNode head) {
        ArrayList<Integer> ans  = new ArrayList<>();
        int max = 0;
        ListNode temp = head;
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = ans.size() - 1;
        while(i < j){
            max = Math.max(max , ans.get(i) + ans.get(j));
            i++;
            j--;
        }
        return max;
        
    }
}