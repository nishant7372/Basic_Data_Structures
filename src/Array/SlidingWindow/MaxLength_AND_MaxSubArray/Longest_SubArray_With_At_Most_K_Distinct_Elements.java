package Array.SlidingWindow.MaxLength_AND_MaxSubArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_SubArray_With_At_Most_K_Distinct_Elements {

    // 1. HashTable if 0<=nums[i]<=10^5

    //a. Max Length
    public int lengthOfLongestSubArrayWithAtMostKDistinctElements_Table(int[] nums,int k) {
        int[] freq = new int[nums.length]; //0 <= nums[i] < nums.length
        int j=0, max=0, unique=0;
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]++==0)
                unique++;

            while(unique>k) {
                if (freq[nums[j++]]-- == 1)
                    unique--;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }

    //b. Max Length SubArray
    public int[] longestSubArrayWithAtMostKDistinctElements_Table(int[] nums,int k) {
        int[] freq = new int[nums.length]; //0 <= nums[i] < nums.length
        int j=0, max=0, unique=0;
        int left=0, right=0;
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]++==0)
                unique++;

            while(unique>k){
                if(freq[nums[j++]]--==1)
                    unique--;
            }
            if(i-j+1>max){
                right=i;
                left=j;
                max=i-j+1;
            }
        }
        return Arrays.copyOfRange(nums, left, right+1);
    }

    // 2. HashMap if nums[i]<0 || nums[i]>10^5

    //a. Max Length
    public int lengthOfLongestSubArrayWithAtMostKDistinctElements_Map(int[] nums,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int j=0, max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.size()>k) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0)
                    map.remove(nums[j]);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }

    // b. Max Length SubArray
    public int[] longestSubArrayWithAtMostKDistinctElements_Map(int[] nums,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int j=0, max=0;
        int left=0, right=0;
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.size() > k) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0)
                    map.remove(nums[j]);
                j++;
            }
            if (i - j + 1 > max) {
                right=i;
                left=j;
                max = i - j + 1;
            }
        }
        return Arrays.copyOfRange(nums, left, right+1);
    }
}
