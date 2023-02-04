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
                    1. Utils
                    2. Exit""");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> utils();
                case 2 -> flag = false;
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