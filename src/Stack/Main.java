package Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    Press - :
                    1. Stack Operations
                    2. Utils
                    3. Exit""");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> stack();
                case 2 -> utils();
                case 3 -> flag = false;
            }
        }
    }

    private static void stack(){
        System.out.println("Enter Size:");
        int size = scan.nextInt();
        Stack stack = new Stack(size);
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    Press - :
                    1. Push
                    2. Pop
                    3. Peek
                    4. IsEmpty
                    5. IsFull
                    6. Print Stack
                    7. Exit""");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> push(stack);
                case 2 -> pop(stack);
                case 3 -> peek(stack);
                case 4 -> isEmpty(stack);
                case 5 -> isFull(stack);
                case 6 -> printStack(stack);
                case 7 -> flag = false;
            }
        }
    }

    private static void utils() {
        Utils utils = new Utils();
        int[] arr = inputArray();
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    Press - :
                    1. Next Greater Element
                    2. Previous Greater Element
                    3. Next Smaller Element
                    4. Previous Smaller Element
                    5. Exit""");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> nextGreaterElement(utils,arr);
                case 2 -> previousGreaterElement(utils,arr);
                case 3 -> nextSmallerElement(utils,arr);
                case 4 -> previousSmallerElement(utils,arr);
                case 5 -> flag = false;
            }
        }
    }

    private static void push(Stack stack){
        System.out.println("Enter data:");
        int data = scan.nextInt();
        if(!stack.push(data))
            System.out.println("Can't Push. Stack is Full.");
        printStack(stack);
    }

    private static void pop(Stack stack){
        Integer poppedItem = stack.pop();
        System.out.println("Popped Item: "+ poppedItem);
        if(poppedItem==null)
            System.out.println("Stack is Empty");
        printStack(stack);
    }

    private static void peek(Stack stack){
        Integer topItem = stack.peek();
        System.out.println("Top Item: "+ topItem);
        if(topItem==null)
            System.out.println("Stack is Empty");
    }

    private static void isEmpty(Stack stack){
        System.out.println("Stack is Empty? : "+ stack.isEmpty());
    }

    private static void isFull(Stack stack){
        System.out.println("Stack is Full? : "+ stack.isFull());
    }

    private static void printStack(Stack stack){
        stack.print();
    }

    private static int[] inputArray(){
        System.out.println("Input Array:");
        System.out.println("Enter Size:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        return arr;
    }

    private static void nextGreaterElement(Utils utils,int[] arr){
        Integer[] nextGreaterElement = utils.nextGreaterElement(arr);
        Integer[] nextGreaterElementIndex = utils.nextGreaterElementIndex(arr);
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreaterElement));
        System.out.println("Next Greater Element Indexes: " + Arrays.toString(nextGreaterElementIndex));
    }

    private static void previousGreaterElement(Utils utils,int[] arr){
        Integer[] previousGreaterElement = utils.previousGreaterElement(arr);
        Integer[] previousGreaterElementIndex = utils.previousGreaterElementIndex(arr);
        System.out.println("Previous Greater Elements: " + Arrays.toString(previousGreaterElement));
        System.out.println("Previous Greater Element Indexes: " + Arrays.toString(previousGreaterElementIndex));
    }

    private static void nextSmallerElement(Utils utils,int[] arr){
        Integer[] nextSmallerElement = utils.nextSmallerElement(arr);
        Integer[] nextSmallerElementIndex = utils.nextSmallerElementIndex(arr);
        System.out.println("Next Smaller Elements: " + Arrays.toString(nextSmallerElement));
        System.out.println("Next Smaller Element Indexes: " + Arrays.toString(nextSmallerElementIndex));
    }

    private static void previousSmallerElement(Utils utils,int[] arr){
        Integer[] previousSmallerElement = utils.previousSmallerElement(arr);
        Integer[] previousSmallerElementIndex = utils.previousSmallerElementIndex(arr);
        System.out.println("Previous Smaller Elements: " + Arrays.toString(previousSmallerElement));
        System.out.println("Previous Smaller Element Indexes: " + Arrays.toString(previousSmallerElementIndex));
    }
}