package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList list = new LinkedList("Nishant - Doubly LinkedList");
        boolean flag = true;
        while(flag){
            System.out.println("""
                Press - :
                0. Print
                1. Insert
                2. Delete
                3. LeetCode Section
                4. Utilities
                5. Exit""");
            int ch = scan.nextInt();
            switch (ch){
                case 0 -> print(list);
                case 1 -> insert(list);
                case 2 -> delete(list);
                case 3 -> leetCode(list);
                case 4 -> utilities(list);
                case 5 -> flag=false;
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
                    2. Delete By Index
                    3. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> deleteByData(list);
                case 2 -> deleteByIndex(list);
                case 3 -> {flag=false;
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
                    
                    5. Go Back
                    """);
            int ch = scan.nextInt();
            switch (ch) {

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
    private static void appendData(LinkedList  list){
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
    private static void deleteByData(LinkedList list){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        list.delete(data);
        print(list);
    }
    private static void deleteByIndex(LinkedList list){
        System.out.println("Enter Index:");
        int index = scan.nextInt();
        list.deleteByIndex(index);
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
    private static void print(LinkedList list){
        System.out.println(list.toString());
    }
}
