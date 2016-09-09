package leetcode_08_2016;

import util.ListNode;

public class E_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
    	if(head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null && slow != null) {
        	if(fast == slow) return true;
        	fast = fast.next.next;
        	slow = slow.next;
        }
        return false;
    }
}
