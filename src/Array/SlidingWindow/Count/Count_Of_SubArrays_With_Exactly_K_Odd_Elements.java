package Array.SlidingWindow.Count;

public class Count_Of_SubArrays_With_Exactly_K_Odd_Elements {

    // Count of subArrays with exactly k Odd elements is equal to the difference of the
    // count of SubArrays with at most K Odd elements and the count of SubArrays with
    // at most (K - 1) Odd elements.
    public int countOfSubArraysWithExactlyKOddElements(int[] nums, int k) {
        return AtMostKOdd(nums,k) - AtMostKOdd(nums,k-1);
    }

    private int AtMostKOdd(int[] nums,int k){
        int i=0, j=0, odd=0, count=0;   // i->left , j->right
        while(j<nums.length)
        {
            if(nums[j]%2==1)
                odd++;

            while(odd>k){
                if(nums[i++]%2==1)
                    odd--;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}
