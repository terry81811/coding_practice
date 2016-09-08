package leetcode_08_2016;

import util.ListNode;

public class E_83_RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	if(head == null) return null;
    	ListNode cur = head;
    	
    	while(cur != null) {
    		if(cur.next == null)
    			break;
    		
    		if(cur.val == cur.next.val) {
    			cur.next = cur.next.next;
    		} else {
    			cur = cur.next;
    		}
    	}
    	
        return head;
    }
    
    
}
