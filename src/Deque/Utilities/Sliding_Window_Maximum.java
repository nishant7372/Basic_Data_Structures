package Deque.Utilities;

import java.util.ArrayDeque;
import java.util.Deque;

// We maintain a queue where each element is smaller than the previous element,
// and the first element always corresponds to the maximum element inside the window.
// After each window move, we remove elements from the end of the queue until
// the last queue element is greater than the new window element, or the queue becomes empty.
// We also remove the first queue element if it is not inside the window anymore.
// Finally, we add the new window element to the end of the queue.
public class Sliding_Window_Maximum {
    public int[] slidingWindowMaximum(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0;i<k;i++){
            // remove elements smaller than nums[i] from the end of queue
            while(!queue.isEmpty() && queue.getLast()<nums[i]){
                queue.removeLast();
            }
            queue.add(nums[i]); // add nums[i] to queue
        }
        res[0]=queue.getFirst();
        for(int i=k;i<nums.length;i++){
            if(queue.getFirst()==nums[i-k]){
                queue.removeFirst();
            }
            // remove elements smaller than nums[i] from the end of queue
            while(!queue.isEmpty() && queue.getLast()<nums[i]){
                queue.removeLast();
            }
            queue.add(nums[i]); // add nums[i] to queue
            res[i-k+1]=queue.getFirst();
        }
        return res;
    }
}
