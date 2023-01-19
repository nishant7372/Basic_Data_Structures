package LinkedList.SinglyLinkedList;

public class LinkedList {
    private final String name;
    private ListNode root;
    private final Solution solution;
    public LinkedList(String name) {
        this.name = name;
        solution = new Solution();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode temp=root;
        while(temp!=null){
            sb.append(temp.val).append("->");
            temp=temp.next;
        }
        return sb.toString();
    }

    //append arr to linked list
    public void append(int[] arr) {
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        append(head);
    }

    //append data to linked list
    public void append(int data){
        append(new ListNode(data));
    }

    //append node to linked list
    private void append(ListNode node){
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
    }

    //rotate linked list right by k
    public void rotateRight(int k){
        root=solution.rotateRight(root,k);
    }

    //length of linked list
    public int length(){
        return solution.length(root);
    }
}
