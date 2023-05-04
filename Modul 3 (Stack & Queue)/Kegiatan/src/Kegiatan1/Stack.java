package Kegiatan1;

public class Stack {
    private int size;
    private char[] data;
    private int top;

    public Stack(int temp) {
        size = temp;
        data = new char[size];
        top = -1;
    }

    public void push(char tempData) {
        if (!isFull()) {
            data[++top] = tempData;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Stack kosong!");
            return ' ';
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack kosong!");
            return ' ';
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}
