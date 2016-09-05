package leetcode_08_2016;

import util.ListNode;

public class E_237_DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
