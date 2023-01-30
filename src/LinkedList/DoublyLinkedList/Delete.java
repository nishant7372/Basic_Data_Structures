package LinkedList.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Delete {

    // delete data from list if present
    public ListNode delete(ListNode root,int data){
        ListNode node = search(root,data);
        if(node!=null){
            return delete(root,node);
        }
        return root;
    }

    // delete data from list by index if present
    public ListNode deleteByIndex(ListNode root,int idx){
        int i=0;
        ListNode temp = root;
        while(temp!=null){
            if(i==idx) {
                return delete(root, temp);
            }
            i++;
            temp=temp.next;
        }
        return root;
    }

    // delete node from list (must be present)
    private ListNode delete(ListNode root,ListNode node){
        if(node.prev==null && node.next==null)
            root = null;
        else if(node.prev==null){
            node.next.prev=null;
            root = node.next;
            node.next=null;
        }
        else if(node.next==null){
            node.prev.next=null;
            node.prev=null;
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev=null;
            node.next=null;
        }
        return root;
    }

    // search data in a list and return its corresponding node.
    private ListNode search(ListNode root,int data){
        while(root!=null){
            if(root.val==data)
                return root;
            root=root.next;
        }
        return null;
    }

    // delete all nodes containing data
    public ListNode deleteAll(ListNode root,int data){
        List<ListNode> list = new ArrayList<>();
        ListNode temp=root;
        while(temp!=null){
            if(temp.val==data) {
                list.add(temp);
            }
            temp=temp.next;
        }
        for(ListNode node:list){
            root=delete(root,node);
        }
        return root;
    }

    //delete Front node
    public ListNode deleteFront(ListNode root){
        if(root==null){
            return null;
        }
        ListNode newRoot = root.next;
        root.next=null;
        return newRoot;
    }

    //delete End Node
    public ListNode deleteEnd(ListNode root){
        if(root==null){
            return null;
        }
        ListNode temp = root;
        while(temp.next!=null){
            temp=temp.next;
        }
        return delete(root,temp);
    }
}
