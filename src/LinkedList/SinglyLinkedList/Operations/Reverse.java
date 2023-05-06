package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.ListNode;

public class Reverse {
    ListNode root = null;
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        reverse(head).next = null;
        return root;
    }

    private ListNode reverse(ListNode head){
        if(head.next==null){
            return root=head;
        }
        return reverse(head.next).next = head;
    }
}