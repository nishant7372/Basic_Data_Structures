package LinkedList.SinglyLinkedList;

public class Partition {
/*
    86. Partition List (0ms runtime Beats 100%)
    ### Statement--
    Given the head of a linked list and a value x,
    partition it such that all nodes less than x
    come before nodes greater than or equal to x.
    You should preserve the original relative order
    of the nodes in each of the two partitions.
*/
     public ListNode partition(ListNode head, int x) {
        //A sentinel node is a dummy node that goes at the front of a list.
        ListNode root1=new ListNode(0), head1=root1; // nodes >= x
        ListNode root2=new ListNode(0), head2=root2; // nodes < x
        while(head!=null){
            if(head.val<x){
                head1.next=head;
                head1=head1.next;
            }
            else{
                head2.next=head;
                head2=head2.next;
            }
            head=head.next;
        }
        head1.next=root2.next;
        head2.next=null;
        return root1.next;
    }
}
