package BitWise;

import java.util.Scanner;

public class Main {
    static Scanner scan= new Scanner(System.in);

    static Bitwise bitwise = new Bitwise();
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            System.out.println("""
                    1. Set Bits count
                    2. is Even?
                    3. is Odd?
                    4. is Power of Two?
                    5. Convert to Binary
                    6. Reverse Bits
                    7. is kth bit set?
                    8. Power - pow(x,n)""");
            System.out.println("Enter choice:");
            int ch = scan.nextInt();
            switch (ch) {
                case 1 -> setBits();
                case 2 -> isEven();
                case 3 -> isOdd();
                case 4 -> isPowerOfTwo();
                case 5 -> convertToBinary();
                case 6 -> reverseBits();
                case 7 -> isKthBitSet();
                case 8 -> pow();
            }
        }
    }

    private static void setBits(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.setBits(n));
    }

    private static void isPowerOfTwo(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.isPowerOfTwo(n));
    }

    private static void isEven(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.isEven(n));
    }

    private static void isOdd(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.isOdd(n));
    }

    private static void convertToBinary(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.convertToBinary(n));
    }

    private static void reverseBits(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println(bitwise.reverseBits(n));
    }

    private static void isKthBitSet(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter k:");
        int k = scan.nextInt();
        System.out.println(bitwise.isKthBitSet(n,k));
    }

    private static void pow(){
        System.out.println("Enter No.:");
        double x = scan.nextInt();
        System.out.println("Enter Power:");
        int n = scan.nextInt();
        System.out.println(bitwise.pow(x,n));
    }
}
