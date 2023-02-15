package LinkedList.CircularLinkedList;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        boolean flag = true;
        while(flag){
            System.out.println("""
                Press - :
                1. Append At Last
                2. Insert At Beginning
                3. Delete
                4. Length
                5. Print
                6. Exit""");
            int ch = scan.nextInt();
            switch (ch){
                case 1 -> append(list);
                case 2 -> insertAtBegin(list);
                case 3 -> delete(list);
                case 4 -> length(list);
                case 5 -> print(list);
                case 6 -> flag=false;
            }
        }
    }

    private static void append(LinkedList list){
        System.out.println("Enter Data:");
        int  val = scan.nextInt();
        list.append(val);
        print(list);
    }

    private static void insertAtBegin(LinkedList list){
        System.out.println("Enter Data:");
        int  val = scan.nextInt();
        list.insertAtBegin(val);
        print(list);
    }

    private static void delete(LinkedList list){
        System.out.println("Enter data:");
        int val = scan.nextInt();
        list.delete(val);
        print(list);
    }

    private static void print(LinkedList list){
        list.print();
    }

    private static void length(LinkedList list){
        System.out.println("Length:" + list.length());
    }

}
