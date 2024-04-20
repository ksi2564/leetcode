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
import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        ListNode node = head;
        while (node != null) {
            deque.add(node.val);
            node = node.next;
        }
        
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        
        return true;
    }
}