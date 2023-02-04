package Stack.Utilities;

import java.util.Stack;

public class Next_Greater_Element {

    public Integer[] nextGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] nextGreater = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                nextGreater[st.pop()]=arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nextGreater[st.pop()]=null;
        }
        return nextGreater;
    }

    public Integer[] nextGreaterElementIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] nextGreater = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                nextGreater[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nextGreater[st.pop()]=null;
        }
        return nextGreater;
    }
}
