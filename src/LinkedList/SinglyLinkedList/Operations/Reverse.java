package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.ListNode;

public class Reverse {

    // 0ms runtime, Beats 100%
    // TC -> O(n)
    ListNode root;
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        reverse(head).next = null;
        return root;
    }

    private ListNode reverse(ListNode head){
        if(head.next==null){
            return root=head;
        }
        return reverse(head.next).next = head;
    }


    // 0ms runtime, Beats 100%
    // TC -> O(n)
    ListNode root2,last;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        left--; right--;
        ListNode temp = head, first = null;
        while(left-->0){
            first=temp;
            temp=temp.next;
            right--;
        }
        reverse(temp,right).next = last;

        if(first!=null){
            first.next=root2;
            return head;
        }
        return root2;
    }

    private ListNode reverse(ListNode temp,int right)
    {
        if(right==0){
            last=temp.next;
            return root2=temp;
        }
        return reverse(temp.next,right-1).next = temp;
    }
}