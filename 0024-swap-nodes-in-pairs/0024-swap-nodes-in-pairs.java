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
    public ListNode swapPairs(ListNode head) {
        ListNode cur = new ListNode(0, head);
        ListNode root = cur;
        ListNode a, b;
        
        while (cur.next != null && cur.next.next != null) {
            a = cur.next;
            b = cur.next.next;
            
            a.next = b.next;
            cur.next = b;
            b.next = a;
            
            cur = cur.next.next;
        }
        
        return root.next;
    }
}