package Array.Heap;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Heap Capacity:");
        int capacity = scan.nextInt();
        MaxHeap maxHeap = new MaxHeap(capacity);
        MinHeap minHeap = new MinHeap(capacity);
        boolean flag = true;
        while(flag){
            System.out.println("""
                     1. Insert
                     2. Delete
                     3. PrintHeap
                     4. Exit""");
            System.out.println("Enter choice:");
            int ch = scan.nextInt();
            switch (ch){
                case 1 -> insert(maxHeap,minHeap);
                case 2 -> delete(maxHeap,minHeap);
                case 3 -> printHeap(maxHeap,minHeap);
                case 4 -> flag=false;
            }
        }
    }

    private static void insert(MaxHeap maxHeap, MinHeap minHeap){
        System.out.print("Enter Element: ");
        int element = scan.nextInt();
        maxHeap.insert(element);
        minHeap.insert(element);
        printHeap(maxHeap,minHeap);
    }

    private static void printHeap(MaxHeap maxHeap, MinHeap minHeap){
        maxHeap.printHeap();
        minHeap.printHeap();
    }

    public static void delete(MaxHeap maxHeap, MinHeap minHeap){
        System.out.print("Enter Element:");
        int element=scan.nextInt();

        maxHeap.delete(element);
        minHeap.delete(element);

        printHeap(maxHeap,minHeap);
    }
}
