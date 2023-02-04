package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.ListNode;

public class Utility {
    public int length(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    public int maximum(ListNode head){
        int max=Integer.MIN_VALUE;
        while(head!=null){
            max=Math.max(max,head.val);
            head=head.next;
        }
        return max;
    }
    public int minimum(ListNode head){
        int min=Integer.MAX_VALUE;
        while(head!=null){
            min=Math.min(min,head.val);
            head=head.next;
        }
        return min;
    }
    public long sum(ListNode head){
        long sum=0;
        while(head!=null){
            sum+=head.val;
            head=head.next;
        }
        return sum;
    }
    public long product(ListNode head){
        long product=1;
        while(head!=null){
            product*=head.val;
            head=head.next;
        }
        return product;
    }
}
