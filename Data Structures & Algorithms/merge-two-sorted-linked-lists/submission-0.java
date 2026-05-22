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
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode head=new ListNode(0);
        ListNode newNode=head;
        while(l1!=null || l2!=null){
            if(l1==null){
                newNode.next=l2;
                l2=l2.next;
                newNode = newNode.next;
                continue;
            }
            if(l2==null){
                newNode.next=l1; 
                l1=l1.next;
                newNode = newNode.next;
                continue;  
            }
            if(l1.val<l2.val){
                 newNode.next=l1;
                 l1=l1.next;
            }
            else{
                 newNode.next=l2;
                 l2=l2.next;
            }
            newNode = newNode.next;
        }
        return head.next;
    }
}