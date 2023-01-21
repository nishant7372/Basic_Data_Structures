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

    /*
    725. Split Linked List in Parts (0ms runtime Beats 100%)
    ### Statement--
    Given the head of a singly linked list and an integer k,
    split the linked list into k consecutive linked list parts.
    The length of each part should be as equal as possible:
    no two parts should have a size differing by more than one.
    This may lead to some parts being null.
    The parts should be in the order of occurrence in the input list,
    and parts occurring earlier should always have a size greater than
    or equal to parts occurring later.
    Return an array of the k parts.
    */
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = length(head);
        int main = len/k;
        int extra = len%k;

        ListNode[] res = new ListNode[k];
        res[0]=head;
        int i=1;
        while(i<k)
        {
            ListNode temp = res[i-1];
            int a = main+Math.min(1,extra);
            while(--a>0){
                temp=temp.next;
            }
            if(extra>0)
                extra--;
            if(temp!=null){
                res[i]=temp.next;
                temp.next=null;
            }
            i++;
        }
        return res;
    }

    private int length(ListNode head) {
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}
