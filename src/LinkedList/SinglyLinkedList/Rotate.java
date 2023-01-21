package LinkedList.SinglyLinkedList;

public class Rotate{

    /*
     61. Rotate List (0ms runtime Beats 100%)
     ### Statement--
     Given the head of a linked list, rotate the list to the right by k places.

     Cases Handled: k>length and head=null
    */
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int len = length(head);
        k=len-k%len;
        if(k==0||k==len)
            return head;
        ListNode temp=head;
        while(k-->1)
            temp=temp.next;
        ListNode root=temp.next;
        temp.next=null;
        temp=root;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return root;
    }

    public int length(ListNode head)
    {
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
}
