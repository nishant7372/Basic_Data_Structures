package Array.SlidingWindow.Count;

public class Count_Of_SubArrays_With_At_Most_K_Even_Elements {
    public int countOfSubArraysWithAtMostKEvenElements(int[] nums,int k){
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
