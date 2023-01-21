package LinkedList.SinglyLinkedList;

public class LinkedList {
    private final String name;
    private ListNode root;
    private final Rotate rotate;
    private final Partition partition;
    private final Insert insert;
    public LinkedList(String name) {
        this.name = name;
        rotate = new Rotate();
        partition = new Partition();
        insert = new Insert();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(root==null)
            return "The Linked List is Empty...";
        ListNode temp=root;
        while(temp!=null){
            sb.append(temp.val).append("->");
            temp=temp.next;
        }
        return sb.toString();
    }

    //append arr to linked list
    public void append(int[] arr) {
        root = insert.append(root,arr);
    }

    //append data to linked list
    public void append(int data){
        root = insert.append(root,data);
    }

    //add arr to front of linked list
    public void addFront(int[] arr) {
        root = insert.addFront(root,arr);
    }

    //add data to front of linked list
    public void addFront(int data){
        root = insert.addFront(root,data);
    }

    //rotate linked list right by k
    public void rotateRight(int k){
        root=rotate.rotateRight(root,k);
    }

    //length of linked list
    public int length(){
        return rotate.length(root);
    }

    //partition linked list such that node<x comes in front of nodes>=x
    public void partition(int x){
        root=partition.partition(root,x);
    }


}
