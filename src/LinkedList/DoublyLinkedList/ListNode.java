package LinkedList.DoublyLinkedList;
public class ListNode {
    int val;
    ListNode prev, next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
    @Override
    public String toString() {
        if(this.next==null)
            return (this.val)+"->";
        return (this.val)+"->"+ this.next;
    }
}
