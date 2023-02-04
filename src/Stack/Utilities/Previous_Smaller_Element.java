package Stack.Utilities;

import java.util.Stack;

public class Previous_Smaller_Element {
    public Integer[] previousSmallerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] previousSmaller = new Integer[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                previousSmaller[st.pop()]=arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            previousSmaller[st.pop()]=null;
        }
        return previousSmaller;
    }

    public Integer[] previousSmallerElementIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] previousSmaller = new Integer[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                previousSmaller[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            previousSmaller[st.pop()]=null;
        }
        return previousSmaller;
    }
}
