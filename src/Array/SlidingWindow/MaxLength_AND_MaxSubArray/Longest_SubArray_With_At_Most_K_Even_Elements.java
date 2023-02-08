package Array.SlidingWindow.MaxLength_AND_MaxSubArray;

import java.util.Arrays;

public class Longest_SubArray_With_At_Most_K_Even_Elements {

    // a. Max Length
    public int lengthOfLongestSubArrayAtMostKEvenNumbers(int[] nums,int k){
        int j=0, even=0, maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                even++;

            while(even>k) {
                if (nums[j++] % 2 == 0)
                    even--;
            }
            maxLength = Math.max(maxLength,i-j+1);
        }
        return maxLength;
    }

    // b. Max Length SubArray
    public int[] longestSubArrayWithAtMostKEvenNumbers(int[] nums,int k){
        int j=0, even=0, maxLength=0;
        int left=0, right=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
                even++;

            while(even>k){
                if(nums[j++]%2==0)
                    even--;
            }
            if(i-j+1>maxLength) {
                right = j;
                left = i;
                maxLength = i-j+1;
            }
        }
        return Arrays.copyOfRange(nums, left, right+1);
    }
}
