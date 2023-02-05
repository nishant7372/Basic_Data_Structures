package Deque;

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
                    1. Sliding Window Maximum
                    2. Sliding Window Minimum
                    3. Exit""");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> slidingWindowMaximum(utils,arr);
                case 2 -> slidingWindowMinimum(utils,arr);
                case 3 -> flag = false;
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

    private static void slidingWindowMaximum(Utils utils,int[] arr){
        System.out.println("Enter k:");
        int k = scan.nextInt();
        int[] slidingWindowMaximum = utils.slidingWindowMaximum(arr,k);
        System.out.println("Sliding Window Maximum: " + Arrays.toString(slidingWindowMaximum));
    }

    private static void slidingWindowMinimum(Utils utils,int[] arr){
        System.out.println("Enter k:");
        int k = scan.nextInt();
        int[] slidingWindowMinimum = utils.slidingWindowMinimum(arr,k);
        System.out.println("Sliding Window Minimum: " + Arrays.toString(slidingWindowMinimum));
    }
}
