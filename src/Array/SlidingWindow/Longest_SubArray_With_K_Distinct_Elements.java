package Array.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_SubArray_With_K_Distinct_Elements {

    // if 0<=nums[i]<=10^5
    // Use HashTable
    public int lengthOfLongestSubArrayWithKDistinctElements(int[] nums,int k) {
        int[] freq = new int[nums.length]; //0 <= nums[i] < nums.length
        int j=0, max=0, unique=0;
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]++==0)
                unique++;

            while(unique>k){
                if(freq[nums[j++]]--==1)
                    unique--;
            }
            if(unique==k)
               max=Math.max(max,i-j+1);
        }
        return max;
    }

    public int[] longestSubArrayWithKDistinctElements(int[] nums,int k) {
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
            if(unique==k && i-j+1>max){
                right=i;
                left=j;
                max=i-j+1;
            }
        }
        return max==0? new int[]{} : Arrays.copyOfRange(nums, left, right+1);
    }

    // nums[i]<0 || nums[i]>10^5
    // Use HashMap
    public int lengthOfLongestSubArrayWithKDistinctElements2(int[] nums,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int j=0, max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.keySet().size()>k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0)
                    map.remove(nums[j]);
                j++;
            }
            if(map.keySet().size()==k)
               max=Math.max(max,i-j+1);
        }
        return max;
    }

    public int[] longestSubArrayWithKDistinctElements2(int[] nums,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int j=0, max=0;
        int left=0, right=0;
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.keySet().size() > k) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0)
                    map.remove(nums[j]);
                j++;
            }
            if (map.keySet().size()==k && i - j + 1 > max) {
                right=i;
                left=j;
                max = i - j + 1;
            }
        }
        return max==0? new int[]{} : Arrays.copyOfRange(nums, left, right+1);
    }
}
