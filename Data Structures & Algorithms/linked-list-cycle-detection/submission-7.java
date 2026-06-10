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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> h= new HashSet<>();
        ListNode tempL=head;
        ListNode tempF=head;
        if(tempF==null || tempF.next==null){
            return false;
            }
        while(tempF != null && tempF.next != null){
            tempF=tempF.next.next;
            tempL=tempL.next;
            if(tempL==tempF){
                return true;
            }
        }
        return false;
    }
}
