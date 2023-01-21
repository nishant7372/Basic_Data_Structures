package LinkedList.SinglyLinkedList;
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        if(this.next==null)
            return (this.val)+"->";
        return (this.val)+"->"+ this.next;
    }
}
