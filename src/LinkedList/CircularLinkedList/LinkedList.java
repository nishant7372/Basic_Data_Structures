package LinkedList.CircularLinkedList;

import java.util.List;

public class LinkedList {
    private String name;
    private ListNode root;
    private ListNode end;
    public void append(int val){
        ListNode temp = new ListNode(val);
        if(root==null){
            root=temp;
        }
        else{
            end.next=temp;
            temp.next=root;
        }
        end=temp;
    }

    public void insertAtBegin(int val){
        if(root==null) {
            append(val);
        }
        else {
            ListNode temp = new ListNode(val);
            end.next = temp;
            temp.next = root;
            root=temp;
        }
    }

    public void delete(int val){
        if(root==null)
            return;
        if(root.val==val){
            end.next=root.next;
            root.next=null;
            root=end.next;
            return;
        }
        ListNode prev = root;
        ListNode temp = root;
        while(temp!=end){
            if(temp.val==val){
                prev.next=temp.next;
                temp.next=null;
                return;
            }
            prev=temp;
            temp=temp.next;
        }
        if(end.val==val) {
            prev.next=root;
            end.next=null;
            end=prev;
        }
    }

    public void print() {
        if(root==null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        ListNode temp = root;
        int length=1;
        System.out.print("┌->");
        while (temp != end) {
            System.out.print(temp.val+"-->");
            length+=(temp.val+"-->").length();
            temp = temp.next;
        }
        System.out.print(temp.val+"--┐\n");
        length+=(temp.val+"---").length();
        System.out.println("⌊"+"_".repeat(length)+"⌋");
    }

    public int length(){
        if(root==null){
            return 0;
        }
        int length=0;
        ListNode temp = root;
        while(temp!=end){
            temp = temp.next;
            length++;
        }
        return length+1;
    }
}
