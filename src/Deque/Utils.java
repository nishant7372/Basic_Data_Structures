package Deque;
import Deque.Utilities.*;
public class Utils {
    private final Sliding_Window_Maximum slidingWindowMaximum;
    private final Sliding_Window_Minimum slidingWindowMinimum;
    public Utils(){
        this.slidingWindowMaximum = new Sliding_Window_Maximum();
        this.slidingWindowMinimum = new Sliding_Window_Minimum();
    }

    public int[] slidingWindowMaximum(int[] arr,int k){
        return slidingWindowMaximum.slidingWindowMaximum(arr,k);
    }

    public int[] slidingWindowMinimum(int[] arr,int k){
        return slidingWindowMinimum.slidingWindowMinimum(arr,k);
    }

}
