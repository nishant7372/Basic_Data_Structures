package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList list = new LinkedList("Nishant");
        boolean flag = true;
        System.out.println("""
                Press - :
                0. Print
                1. Append Array
                2. Append Data
                3. Rotate Right by k
                4. Exit""");
        while(flag){
            int ch = scan.nextInt();
            switch (ch){
                case 0 -> print(list);
                case 1 -> appendArray(list);
                case 2 -> appendData(list);
                case 3 -> rotateRight(list); //61. Rotate List
                case 4 -> flag=false;
            }
        }
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

    private static void rotateRight(LinkedList list){
        System.out.println("Enter k:");
        int k = scan.nextInt();
        list.rotateRight(k);
        print(list);
    }

    private static void print(LinkedList list){
        System.out.println(list.toString());
    }
}
