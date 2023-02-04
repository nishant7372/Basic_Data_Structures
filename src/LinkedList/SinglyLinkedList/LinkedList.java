package LinkedList.SinglyLinkedList;

import LinkedList.SinglyLinkedList.Operations.*;

public class LinkedList {
    private final String name;
    private ListNode root;
    private final Rotate rotate;
    private final Partition partition;
    private final Insert insert;
    private final Utility utility;
    private final Delete delete;

    public LinkedList(String name) {
        this.name = name;
        rotate = new Rotate();
        partition = new Partition();
        insert = new Insert();
        utility=new Utility();
        delete = new Delete();
    }

    public String toString() {
        if(root==null)
            return "The Linked List is Empty...";
        return "Linked List: " + root;
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
        return utility.length(root);
    }

    //partition linked list such that node<x comes in front of nodes>=x
    public void partition(int x){
        root=partition.partition(root,x);
    }

    //Split Linked List in Parts
    public ListNode[] splitListToParts(int k){
        return partition.splitListToParts(root,k);
    }

    //group nodes at even indices followed by node at odd indices
    public void oddEvenList(){
        root = rotate.oddEvenList(root);
    }

    public int maximum(){
        return utility.maximum(root);
    }

    public int minimum(){
        return utility.minimum(root);
    }

    public long sum(){return utility.sum(root);}

    public long product(){return utility.product(root);}

    // delete by data
    public void delete(int data){
        root = delete.delete(root,data);
    }

    //delete From Front
    public void deleteFront(){
        root = delete.deleteFront(root);
    }

    //delete From End
    public void deleteEnd(){
        root = delete.deleteEnd(root);
    }

    //delete all nodes containing data
    public void deleteAll(int data){
        root = delete.deleteAll(root,data);
    }

    //delete by index
    public void deleteByIndex(int index){
        root = delete.deleteByIndex(root,index);
    }

}
