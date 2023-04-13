package Latihan1;

class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int a) {
        maxSize = 5;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isPull() {
        return (top == maxSize - 1);
    }
}

public class NoLibStack {
    public static void main(String[] args) {
        Stack stk = new Stack(10);
        stk.push(9);
        stk.push(10);
        stk.push(39);
        stk.push(19);

        while(!stk.isEmpty()){
            long value = stk.pop();
            System.out.println(value);
            System.out.println(" ");
        }

        System.out.println("");
    }
}
