package Array.SlidingWindow.Count;

import java.util.HashMap;
import java.util.Map;

public class Count_of_SubArrays_With_Exactly_K_Distinct_Elements {
    // Count of subArrays with Exactly k distinct elements is equal to the difference of the
    // count of SubArrays with At Most K distinct elements and the count of SubArrays with
    // At Most (K - 1) distinct elements.

    // 1. HashTable for smaller constraints +ves only
    public int countOfSubArraysWithExactlyKDistinctElements_Table(int[] nums,int k){
        return AtMostK_Table(nums,k)-AtMostK_Table(nums,k-1);
    }

    // 2. HashMap for larger constraints including -ves
    public int countOfSubArraysWithExactlyKDistinctElements_Map(int[] nums,int k){
        return AtMostK_Map(nums,k)-AtMostK_Map(nums,k-1);
    }

    private int AtMostK_Table(int[] nums,int k){
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
    private int AtMostK_Map(int[] nums,int k){
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
