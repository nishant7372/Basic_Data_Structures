package LinkedList.SinglyLinkedList;

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
                2. LeetCode Section
                3. Exit""");
            int ch = scan.nextInt();
            switch (ch){
                case 0 -> print(list);
                case 1 -> insert(list);
                case 2 -> leetCode(list);
                case 3 -> flag=false;
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }

    private static void insert(LinkedList list) {
        System.out.println("""
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
            case 5 -> System.out.println("going back...");
        }
        System.out.println("\n-----------------------------------------------------------\n");
    }

    private static void leetCode(LinkedList list){
        System.out.println("""
                Press - :
                1. Rotate Right by k (Leetcode - 61)
                2. Partition List (Leetcode - 86)
                3. Go Back
                """);
        int ch = scan.nextInt();
        switch (ch) {
            case 1 -> rotateRight(list); //61. Rotate List
            case 2 -> partition(list);  //86. Partition List
            case 3 -> System.out.println("going back...");
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

    private static void print(LinkedList list){
        System.out.println(list.toString());
    }
}
