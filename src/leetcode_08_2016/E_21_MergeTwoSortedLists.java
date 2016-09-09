package leetcode_08_2016;

import util.ListNode;

public class E_21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	ListNode c1 = l1;    		
    	ListNode c2 = l2;
    	ListNode c3 = l1.val < l2.val ? l1 : l2;
    	ListNode head = c3;
    	if(l1.val < l2.val) {
        	c1 = c1.next;    		
    	} else {
        	c2 = c2.next;    		
    	}
    	
    	while(c1 != null && c2 != null) {
    		if(c1.val < c2.val) {
    			c3.next = c1;
    			c1 = c1.next;
    		} else {
    			c3.next = c2;
    			c2 = c2.next;
    		}
    		c3 = c3.next;
    	}
    	if(c1 != null) {
    		c3.next = c1;
    	} else if(c2 != null) {
    		c3.next = c2;
    	}
    	return head;
    }
}
