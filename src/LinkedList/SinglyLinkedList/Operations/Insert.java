package LinkedList.SinglyLinkedList.Operations;

import LinkedList.SinglyLinkedList.ListNode;

public class Insert {
    //append arr to end of linked list
    public ListNode append(ListNode root, int[] arr) {
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return append(root,head);
    }

    //append data to end of linked list
    public ListNode append(ListNode root,int data){
        return append(root,new ListNode(data));
    }

    //append node to end of linked list
    private ListNode append(ListNode root,ListNode node){
        if(root==null){
            root=node;
        }
        else {
            ListNode temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next=node;
        }
        return root;
    }

    //add array to front of linked list
    public ListNode addFront(ListNode root,int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return addFront(root, head);
    }

    //add data to front of linked list
    public ListNode addFront(ListNode root,int data){
        return addFront(root,new ListNode(data));
    }

    //add node to front of linked list
    private ListNode addFront(ListNode root,ListNode newNode){
        if(root!=null){
            ListNode temp = newNode;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=root;
        }
        return newNode;
    }
}
