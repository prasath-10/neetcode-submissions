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
    public void insertionsort(ArrayList<Integer> ans){
        for(int  i = 1 ; i < ans.size() ; i++)
        {
            int key = ans.get(i);
            int  j = i - 1;

            while( j >= 0  && ans.get(j)  >   key){
                ans.set(j + 1 , ans.get(j));
                j--;
            }
            ans.set(j + 1 , key);
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(head != null){
            ans.add(head.val);
            head = head.next;
        }
        insertionsort(ans);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = 0 ; i < ans.size() ; i++)
        {
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }
        return dummy.next;
        

    }
}