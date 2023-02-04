package Stack;

import Stack.Utilities.* ;
public class Utils {
    private final Next_Greater_Element nextGreaterElement;
    private final Next_Smaller_Element nextSmallerElement;
    private final Previous_Greater_Element previousGreaterElement;
    private final Previous_Smaller_Element previousSmallerElement;

    public Utils(){
        nextGreaterElement = new Next_Greater_Element();
        nextSmallerElement = new Next_Smaller_Element();
        previousGreaterElement = new Previous_Greater_Element();
        previousSmallerElement = new Previous_Smaller_Element();
    }

    public Integer[] nextGreaterElement(int[] arr){
        return nextGreaterElement.nextGreaterElement(arr);
    }

    public Integer[] nextGreaterElementIndex(int[] arr){
        return nextGreaterElement.nextGreaterElementIndex(arr);
    }

    public Integer[] previousGreaterElement(int[] arr){
        return previousGreaterElement.previousGreaterElement(arr);
    }

    public Integer[] previousGreaterElementIndex(int[] arr){
        return previousGreaterElement.previousGreaterElementIndex(arr);
    }

    public Integer[] nextSmallerElement(int[] arr){
        return nextSmallerElement.nextSmallerElement(arr);
    }

    public Integer[] nextSmallerElementIndex(int[] arr){
        return nextSmallerElement.nextSmallerElementIndex(arr);
    }

    public Integer[] previousSmallerElement(int[] arr){
        return previousSmallerElement.previousSmallerElement(arr);
    }

    public Integer[] previousSmallerElementIndex(int[] arr){
        return previousSmallerElement.previousSmallerElementIndex(arr);
    }

}
