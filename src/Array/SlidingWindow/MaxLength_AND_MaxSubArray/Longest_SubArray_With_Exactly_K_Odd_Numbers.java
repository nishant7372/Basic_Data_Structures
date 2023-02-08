package Array.SlidingWindow.MaxLength_AND_MaxSubArray;

import java.util.Arrays;

public class Longest_SubArray_With_Exactly_K_Odd_Numbers {

    // a. Max Length
    public int lengthOfLongestSubArrayWithExactlyKOddNumbers(int[] nums,int k){
        int j=0, odd=0, maxLength=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
                odd++;

            while(odd>k){
                if(nums[j++]%2==1)
                    odd--;
            }
            if(odd==k) {
                maxLength = Math.max(maxLength,i-j+1);
            }
        }
        return maxLength;
    }

    // b. Max Length SubArray
    public int[] longestSubArrayWithExactlyKOddNumbers(int[] nums,int k){
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
            if(odd==k && i-j+1>maxLength) {
                right = j;
                left = i;
                maxLength = i-j+1;
            }
        }
        return maxLength==0? new int[]{} : Arrays.copyOfRange(nums, left, right+1);
    }
}
