package LinkedList.SinglyLinkedList;

public class Delete {
    // delete by data
    public ListNode delete(ListNode root,int data){
        if(root==null)
            return null;
        if(root.val==data){
            return deleteFront(root);
        }
        ListNode temp = root;
        ListNode prev = root;
        while(temp!=null){
            if(temp.val==data){
                prev.next=temp.next;
                temp.next=null;
                break;
            }
            prev=temp;
            temp = temp.next;
        }
        return root;
    }

    // delete by index
    public ListNode deleteByIndex(ListNode root,int idx){
        ListNode temp = root;
        ListNode prev = root;
        if(idx==0){
            return deleteFront(root);
        }
        int i=0;
        while(temp!=null){
            if(i==idx) {
                prev.next=temp.next;
                temp.next=null;
                break;
            }
            i++;
            prev=temp;
            temp = temp.next;
        }
        return root;
    }

    // delete all nodes of data
    public ListNode deleteAll(ListNode root,int data){
        while(root!=null && root.val==data){
            root = deleteFront(root);
        }
        ListNode temp = root;
        ListNode prev = temp;
        while(temp!=null){
            if(temp.val==data) {
                prev.next=temp.next;
                temp.next=null;
                temp=prev;
            }
            prev=temp;
            temp = temp.next;
        }
        return root;
    }

    // delete From Front
    public ListNode deleteFront(ListNode root){
        if(root==null)
            return null;
        ListNode newRoot=root.next;
        root.next=null;
        return newRoot;
    }

    // delete From End
    public ListNode deleteEnd(ListNode root){
        if(root==null)
            return null;
        ListNode temp = root;
        ListNode prev = root;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        if(prev==temp){
            return null;
        }
        prev.next=null;
        return root;
    }
}
