package Stack.Utilities;

import java.util.Stack;

public class Previous_Greater_Element {
    public Integer[] previousGreaterElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] previousGreater = new Integer[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                previousGreater[st.pop()]=arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            previousGreater[st.pop()]=null;
        }
        return previousGreater;
    }

    public Integer[] previousGreaterElementIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] previousGreater = new Integer[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                previousGreater[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            previousGreater[st.pop()]=null;
        }
        return previousGreater;
    }
}
