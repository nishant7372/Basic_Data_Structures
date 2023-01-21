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

    /*
     328. Odd Even Linked List (0ms runtime Beats 100%)
     ### Statement--
     Given the head of a singly linked list,
     group all the nodes with odd indices together
     followed by the nodes with even indices, and return the reordered list.
     The first node is considered odd, and the second node is even, and so on.

     Note that the relative order inside both the even and
     odd groups should remain as it was in the input.
     You must solve the problem in O(1) extra space complexity and O(n) time complexity.
    */
    public ListNode oddEvenList(ListNode head) {
        ListNode root1 = new ListNode(0), temp1 = root1;
        ListNode root2 = new ListNode(0), temp2 = root2;
        int c=0;
        while(head!=null)
        {
            if(c%2==0){
                temp1.next = head;
                temp1 = temp1.next;
            }
            else{
                temp2.next = head;
                temp2 = temp2.next;
            }
            head=head.next;
            c++;
        }
        temp1.next = root2.next;
        temp2.next=null;
        return root1.next;
    }

    private int length(ListNode head) {
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }
}
