package Array.SlidingWindow.Count;

public class Count_Of_SubArrays_With_Exactly_K_Even_Elements {

    // Count of subArrays with exactly k Even elements is equal to the difference of the
    // count of SubArrays with at most K Even elements and the count of SubArrays with
    // at most (K - 1) Even elements.
    public int countOfSubArraysWithExactlyKEvenElements(int[] nums, int k) {
        return AtMostKEven(nums,k) - AtMostKEven(nums,k-1);
    }

    private int AtMostKEven(int[] nums,int k){
        int i=0, j=0, even=0, count=0; // i->left , j->right
        while(j<nums.length)
        {
            if(nums[j]%2==0)
                even++;

            while(even>k){
                if(nums[i++]%2==0)
                    even--;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}
