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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        while(list1!=null){
            ar.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            ar.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(ar);
        ListNode head=null;
        ListNode prev=null;
        for(int i=0;i<ar.size();i++){
            ListNode curr = new ListNode();
            if(head==null){
                head=curr;
                prev=curr;
            }
            curr.val=ar.get(i);
            prev.next=curr;
            prev=curr;
        }
        if(ar.size()==1){
            head.next=null;
        }
        return head;
    }
}