package leetcode_08_2016;

import util.ListNode;

public class E_24_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while(prev.next != null && prev.next.next != null) {
        	
        	ListNode first = prev.next;
        	ListNode second = prev.next.next;
        	first.next = second.next;
        	prev.next = second;
        	second.next = first;
        	prev = prev.next.next;
        	
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
    	E_24_SwapNodesinPairs o = new E_24_SwapNodesinPairs();
    	ListNode a = new ListNode(1);
    	ListNode b = new ListNode(2);
    	ListNode c = new ListNode(3);
    	ListNode d = new ListNode(4);
    	ListNode e = new ListNode(5);
    	ListNode f = new ListNode(6);
    	a.next = b;
    	b.next = c;
    	c.next = d;
    	d.next = e;
    	e.next = f;
    	o.swapPairs(a);
    }
}
