package Stack;

public class Stack {
    Integer[] st;
    int top;

    public Stack(int size){
        this.st = new Integer[size];
        this.top = -1;
    }
    public void push(int val){
        if(!isFull())
            st[++top]=val;
    }

    public Integer pop(){
        if(!isEmpty()){
            return st[top--];
        }
        return null;
    }

    public Integer peek(){
        if(!isEmpty()){
            return st[top];
        }
        return null;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==st.length-1;
    }

    public void print() {
        for(int i=Math.max(top,Math.min(st.length-1,5));i>=0;i--) {
            if(i>top)
                System.out.println("|           |");
            else {
                int len = 9-length(st[i]+"");
                int[] space = new int[2];
                if(len%2==0){
                    space[0]=space[1]=len/2;
                }
                else{
                    space[0]=len/2;
                    space[1]=(len/2)+1;
                }
                System.out.println("| "+" ".repeat(space[0]) + st[i] + " ".repeat(space[1]) + " |");
            }
            System.out.println("|-----------|");
        }
    }

    private int length(String s){
        return s.length();
    }
}
