/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<ListNode>();
        while(head != null){
            if(h.contains(head))
                return head;
            h.add(head);
            head = head.next;
        }
        return null;
    }
}