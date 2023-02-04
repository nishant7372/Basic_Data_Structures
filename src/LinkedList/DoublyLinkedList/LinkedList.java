package LinkedList.DoublyLinkedList;

import LinkedList.DoublyLinkedList.Operations.* ;

public class LinkedList {
    private final String name;
    private ListNode root;
    private final Insert insert;
    private final Delete delete;
    private final Utility utility;

    public LinkedList(String name){
        this.name = name;
        insert = new Insert();
        delete = new Delete();
        utility = new Utility();
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

    // delete data from list if present
    public void delete(int data){
        root = delete.delete(root,data);
    }

    // delete data by index from list if present
    public void deleteByIndex(int index){
        root = delete.deleteByIndex(root,index);
    }

    // delete all nodes containing data
    public void deleteAll(int data){
        root = delete.deleteAll(root,data);
    }

    //delete Front
    public void deleteFront(){
        root= delete.deleteFront(root);
    }

    //delete End
    public void deleteEnd(){
        root= delete.deleteEnd(root);
    }

    // length of linked list
    public int length(){return utility.length(root);}

    // maximum element in linked list
    public int maximum(){
        return utility.maximum(root);
    }

    //minimum element in linked list
    public int minimum(){
        return utility.minimum(root);
    }

    // sum of all elements in linked list
    public long sum(){return utility.sum(root);}

    // product of all elements in linked list
    public long product(){return utility.product(root);}

}
