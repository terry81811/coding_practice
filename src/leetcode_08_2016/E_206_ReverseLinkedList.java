package leetcode_08_2016;

import util.ListNode;

public class E_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        if(head.next == null) return head;
        else {
        	ListNode cur = head;
        	ListNode prev = null;
        	ListNode tmp = null;
        	while(cur != null) {
        		tmp = cur.next;
        		cur.next = prev;
        		prev = cur;
        		cur = tmp;
        	}
            return prev;
        }
    }
}
