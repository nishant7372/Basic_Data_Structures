package Array;

import java.util.Arrays;
import java.util.Scanner;
import Array.SlidingWindow.*;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static Longest_SubArray_With_K_Distinct_Elements l = new Longest_SubArray_With_K_Distinct_Elements();
    static Longest_SubArray_With_At_Most_K_Distinct_Elements l2 = new Longest_SubArray_With_At_Most_K_Distinct_Elements();
    public static void main(String[] args) {
        longestSubArrayWithKDistinctElements();
    }
    public static int[] inputArray(){
        System.out.println("Enter size:");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++)
            nums[i] =scan.nextInt();
        return nums;
    }

    private static void longestSubArrayWithKDistinctElements(){
        int[] nums = inputArray();
        boolean flag = false;
        for(int x:nums){
            if(x>=nums.length || x<0) {
                flag = true;
                break;
            }
        }
        System.out.println("Enter k:");
        int k = scan.nextInt();
        int len, len1;
        int[] res, res1;
        if(!flag) {
            len = l.lengthOfLongestSubArrayWithKDistinctElements(nums, k);
            res = l.longestSubArrayWithKDistinctElements(nums, k);
            len1 = l2.lengthOfLongestSubArrayWithAtMostKDistinctElements(nums, k);
            res1= l2.longestSubArrayWithAtMostKDistinctElements(nums, k);
        }
        else{
            len = l.lengthOfLongestSubArrayWithKDistinctElements2(nums, k);
            res = l.longestSubArrayWithKDistinctElements2(nums, k);
            len1 = l2.lengthOfLongestSubArrayWithAtMostKDistinctElements2(nums, k);
            res1 = l2.longestSubArrayWithAtMostKDistinctElements2(nums, k);
        }
        System.out.println("Length: "+ len+", SubArray: "+ Arrays.toString(res));
        System.out.println("Length: "+ len1+", SubArray: "+ Arrays.toString(res1));
    }
}
