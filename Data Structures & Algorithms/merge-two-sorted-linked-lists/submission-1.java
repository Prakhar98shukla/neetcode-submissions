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
        if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        ListNode head=new ListNode(0);
        ListNode dum=head;
        ListNode l1=list1;
        ListNode l2=list2;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                dum.next=l1;
                l1=l1.next;
            }
            else{
                dum.next=l2;
                l2=l2.next;
            }
            dum=dum.next;
        }
        if(l1==null){
                dum.next=l2;    
            }
            else{
                dum.next=l1;
            }
        return head.next;
    }
}