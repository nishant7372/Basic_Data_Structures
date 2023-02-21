package Array.Heap;

// MinHeap -> Parent.val<Child.val
// Node Index -> index
// Left Child Index -> 2*index+1
// Right Child Index -> 2*index+2
// Parent Index -> floor((index-1)/2)

public class MinHeap {
    private final int[] heap;
    private int size;

    public MinHeap(int capacity){
        this.heap = new int[capacity];
    }

    // Insert in MinHeap
    public void insert(int element){
        if(isFull()) {
            System.out.println("Heap is Full");
            return;
        }
        heap[size]=element;
        fixHeap(size);
        size++;
    }

    // Deletion
    public void delete(int element){
        if(isEmpty()){
            System.out.println("Heap is Empty");
            return;
        }
        return;
    }

    private boolean isFull(){
        return size == heap.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    // Heapify
    private void fixHeap(int index) {
        int newValue = heap[index];
        while(index>0 && newValue<heap[getParent(index)]){
            heap[index]=heap[getParent(index)];
            index=getParent(index);
        }
        heap[index] = newValue;
    }


    // return Parent Index
    private int getParent(int index){
        return (index-1)/2;
    }

    // swap values at two indices
    private void swap(int i,int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Print Heap
    public void printHeap(){
        if(size==0) {
            System.out.println("Heap is Empty");
            return;
        }
        int i=0;
        int space = (2<<(int)(Math.log(size)/Math.log(2)))/2;
        int copy = space;
        System.out.println("## MinHeap");
        System.out.println("-".repeat(8).repeat(space*2)+"\n");
        System.out.print(" ".repeat(7).repeat(space));
        System.out.println((printInteger(heap[i++]))+"\n\n");
        int pos=4;
        while(i<size){
            space = space>>1;
            System.out.print(" ".repeat(7).repeat(space));
            int k=0;
            int m=0;
            while(i<size&&i<pos-1){
                System.out.print((printInteger(heap[i++]))+" ".repeat(7).repeat(k%2==0||m%4==1||m%4==3? (space*2)-1:space));
                k++; m++;
            }
            pos=pos<<1;
            System.out.println("\n\n");
        }
        System.out.println("-".repeat(8).repeat(copy*2));
    }

    private String printInteger(int a){
        int len = 5-Integer.toString(a).length();
        int[] space = new int[2];
        if(len%2==0){
            space[0]=space[1]=len/2;
        }
        else{
            space[0]=len/2;
            space[1]=(len/2)+1;
        }
        return ("["+" ".repeat(space[0]) + a + " ".repeat(space[1]) + "]");
    }
}
