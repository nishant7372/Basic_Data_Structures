package LinkedList.DoublyLinkedList;

public class Insert {

    //add data to front of linked list
    public ListNode addFront(ListNode root,int data){
        return addFront(root,new ListNode(data));
    }

    //add array to front of linked list
    public ListNode addFront(ListNode root,int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev=temp;
            temp = temp.next;
        }
        return addFront(root,head);
    }

    //add node to front of linked list
    private ListNode addFront(ListNode root,ListNode node){
        if(root!=null){
            ListNode temp = node;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=root;
            root.prev=temp;
        }
        root=node;
        return root;
    }

    //append data to end of linked list
    public ListNode append(ListNode root,int data){
        return append(root,new ListNode(data));
    }

    //append arr to end of linked list
    public ListNode append(ListNode root,int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            newNode.prev=temp;
            temp = temp.next;
        }
        return append(root,head);
    }

    //append node to end of linked list
    private ListNode append(ListNode root,ListNode node){
        if(root==null){
            root=node;
        }
        else{
            ListNode temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
        return root;
    }
}
