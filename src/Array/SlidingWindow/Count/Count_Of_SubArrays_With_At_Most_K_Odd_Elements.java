package Array.SlidingWindow.Count;

public class Count_Of_SubArrays_With_At_Most_K_Odd_Elements {
    public int countOfSubArraysWithAtMostKOddElements(int[] nums,int k){
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
