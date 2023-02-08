package Array.SlidingWindow.MaxLength_AND_MaxSubArray;

import java.util.Arrays;

public class Longest_SubArray_With_At_Most_K_Odd_Elements {

    // a. Max Length
    public int lengthOfLongestSubArrayAtMostKOddNumbers(int[] nums,int k){
        int j=0, odd=0, maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
                odd++;

            while(odd>k){
                if(nums[j++]%2==1)
                    odd--;
            }
            maxLength = Math.max(maxLength,i-j+1);
        }
        return maxLength;
    }

    // b. Max Length SubArray
    public int[] longestSubArrayWithAtMostKOddNumbers(int[] nums,int k){
        int j=0, odd=0, maxLength=0;
        int left=0, right=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
                odd++;

            while(odd>k){
                if(nums[j++]%2==1)
                    odd--;
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
