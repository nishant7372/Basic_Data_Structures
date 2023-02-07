package Array.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Count_of_SubArrays_With_k_Distinct_Elements {
    // Count of subArrays with exactly k distinct elements is equal to the difference of the
    // count of SubArrays with at most K distinct elements and the count of SubArrays with
    // at most (K - 1) distinct elements.

    public int countOfSubArraysWithKDistinctElements(int[] nums,int k){
        return countOfSubArraysWithAtMostKDistinctElements(nums,k)-countOfSubArraysWithAtMostKDistinctElements(nums,k-1);
    }

    public int countOfSubArraysWithKDistinctElements2(int[] nums,int k){
        return countOfSubArraysWithAtMostKDistinctElements2(nums,k)-countOfSubArraysWithAtMostKDistinctElements2(nums,k-1);
    }

    private int countOfSubArraysWithAtMostKDistinctElements(int[] nums,int k){
        int[] freq = new int[nums.length]; //0 <= nums[i] < nums.length
        int j=0, count=0, unique=0;
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]++==0)
                unique++;

            while(unique>k) {
                if (freq[nums[j++]]-- == 1)
                    unique--;
            }
            count+=i-j+1;
        }
        return count;
    }
    private int countOfSubArraysWithAtMostKDistinctElements2(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int j=0, count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            while(map.size()>k) {
                map.put(nums[j], map.get(nums[j]) - 1);
                if (map.get(nums[j]) == 0)
                    map.remove(nums[j]);
                j++;
            }
            count+=i-j+1;
        }
        return count;
    }
}
