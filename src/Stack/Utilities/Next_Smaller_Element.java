package Stack.Utilities;

import java.util.Stack;

public class Next_Smaller_Element {
    public Integer[] nextSmallerElement(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] nextSmaller = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nextSmaller[st.pop()]=arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nextSmaller[st.pop()]=null;
        }
        return nextSmaller;
    }

    public Integer[] nextSmallerElementIndex(int[] arr){
        Stack<Integer> st = new Stack<>();
        Integer[] nextSmaller = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nextSmaller[st.pop()]=i;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            nextSmaller[st.pop()]=-1;
        }
        return nextSmaller;
    }
}
