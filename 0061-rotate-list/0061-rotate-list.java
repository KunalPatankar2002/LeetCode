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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null||k == 0) return head;
        int l=1;
        ListNode temp = head;
        while(temp.next != null){
            l++;
            temp=temp.next;
        }
        k=k%l;
        temp.next=head;
        for(int i = 0;i<l-k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}