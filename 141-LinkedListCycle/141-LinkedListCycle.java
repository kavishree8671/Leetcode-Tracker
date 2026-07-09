// Last updated: 7/9/2026, 3:12:42 PM
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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
            while(fast!=null && fast.next!=null) {
                 slow=slow.next;
                 fast=fast.next.next;    
                 if(fast==slow) {
                    return true;
                }
            }
            return false;

    }
}