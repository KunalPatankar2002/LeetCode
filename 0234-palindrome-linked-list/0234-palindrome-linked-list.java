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
        Stack<Integer> st = new Stack<Integer>();
        ListNode t = head;
        while(t!=null){
            st.push(t.val);
            t=t.next;
        }
        while(head != null){
            if(st.pop() == head.val)
                head=head.next;
            else return false;
        }
        return true;
    }
}