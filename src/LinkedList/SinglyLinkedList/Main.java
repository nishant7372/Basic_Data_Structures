package LinkedList.SinglyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList list = new LinkedList("Nishant");
        boolean flag = true;
        while(flag){
            System.out.println("""
                Press - :
                0. Print
                1. Insert
                2. Delete
                3. Reverse
                4. LeetCode Section
                5. Utilities
                6. Exit""");
            int ch = scan.nextInt();
            switch (ch){
                case 0 -> print(list);
                case 1 -> insert(list);
                case 2 -> delete(list);
                case 3 -> reverse(list);
                case 4 -> leetCode(list);
                case 5 -> utilities(list);
                case 6 -> flag=false;
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private static void insert(LinkedList list) {
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    ### Insertion :\s
                    Press - :
                    1. Append Array
                    2. Add Front Array
                    3. Append Data
                    4. Add Front Data
                    5. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> appendArray(list);
                case 2 -> addFrontArray(list);
                case 3 -> appendData(list);
                case 4 -> addFrontData(list);
                case 5 -> {flag=false;
                    System.out.println("going back...");}
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private static void delete(LinkedList list){
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    ### Deletion :\s
                    Press - :
                    1. Delete By Data
                    2. Delete All By Data
                    3. Delete By Index
                    4. Delete Front
                    5. Delete End
                    6. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> deleteByData(list);
                case 2 -> deleteAllByData(list);
                case 3 -> deleteByIndex(list);
                case 4 -> deleteFront(list);
                case 5 -> deleteEnd(list);
                case 6 -> {flag=false;
                    System.out.println("going back...");}
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private static void reverse(LinkedList list){
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    ### Reverse :\s
                    Press - :
                    1. ReverseList
                    2. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> reverseList(list);
                case 2 -> {flag=false;
                    System.out.println("going back...");}
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private static void leetCode(LinkedList list){
        boolean flag=true;
        while(flag) {
            System.out.println("""
                    ### Leetcode :\s
                    Press - :
                    1. Rotate Right by k (Leetcode - 61)
                    2. Partition List (Leetcode - 86)
                    3. Odd Even Linked List (Leetcode - 328)
                    4. Split Linked List in Parts (Leetcode - 725)
                    5. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> rotateRight(list); //61. Rotate List
                case 2 -> partition(list);  //86. Partition List
                case 3 -> oddEvenList(list);  //328. Odd Even Linked List
                case 4 -> splitListToParts(list);  //725. Split Linked List in Parts
                case 5 -> {flag=false;
                    System.out.println("going back...");}
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private  static void utilities(LinkedList list){
        boolean flag=true;
        while(flag) {
            System.out.println("""
                    ### Utilities :\s
                    Press - :
                    1. Length
                    2. Maximum Element
                    3. Minimum Element
                    4. Sum of Elements
                    5. Product of Elements
                    6. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> length(list);
                case 2 -> maximum(list);
                case 3 -> minimum(list);
                case 4 -> sum(list);
                case 5 -> product(list);
                case 6 -> {flag=false;
                          System.out.println("going back...");}
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }
    private static void appendArray(LinkedList list){
        System.out.println("Enter size:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();
        list.append(array);
        print(list);
    }
    private static void appendData(LinkedList list){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        list.append(data);
        print(list);
    }
    private static void addFrontArray(LinkedList list){
        System.out.println("Enter size:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++)
            array[i]=scan.nextInt();
        list.addFront(array);
        print(list);
    }
    private static void addFrontData(LinkedList list){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        list.addFront(data);
        print(list);
    }
    private static void rotateRight(LinkedList list){
        System.out.println("Enter k:");
        int k = scan.nextInt();
        list.rotateRight(k);
        print(list);
    }
    private static void partition(LinkedList list){
        System.out.println("Enter x:");
        int x = scan.nextInt();
        list.partition(x);
        print(list);
    }
    private static void splitListToParts(LinkedList list){
        System.out.println("Enter k:");
        int k = scan.nextInt();
        ListNode[] res = list.splitListToParts(k);
        System.out.println(Arrays.toString(res));
        //connecting partitions again
        for(int i=0;i<res.length-1;i++){
            if(res[i]==null)
                break;
            while(res[i].next!=null){
                res[i]=res[i].next;
            }
            res[i].next=res[i+1];
        }
    }
    private static void oddEvenList(LinkedList list){
        list.oddEvenList();
        print(list);
    }
    private static void length(LinkedList list){
        System.out.println("Length: "+list.length());
    }
    private static void maximum(LinkedList list){
        System.out.println("Maximum: "+list.maximum());
    }
    private static void minimum(LinkedList list){
        System.out.println("Minimum: "+list.minimum());
    }
    private static void sum(LinkedList list){System.out.println("Sum: "+list.sum());}
    private static void product(LinkedList list){System.out.println("Product: "+list.product());}
    private static void deleteByData(LinkedList list){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        list.delete(data);
        print(list);
    }
    private static void deleteAllByData(LinkedList list){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        list.deleteAll(data);
        print(list);
    }
    private static void deleteByIndex(LinkedList list){
        System.out.println("Enter Index:");
        int index = scan.nextInt();
        list.deleteByIndex(index);
        print(list);
    }
    private static void deleteFront(LinkedList list){
        list.deleteFront();
        print(list);
    }
    private static void deleteEnd(LinkedList list){
        list.deleteEnd();
        print(list);
    }
    private static void reverseList(LinkedList list){
        list.reverse();
        print(list);
    }
    private static void print(LinkedList list){
        System.out.println(list.toString());
    }
}
