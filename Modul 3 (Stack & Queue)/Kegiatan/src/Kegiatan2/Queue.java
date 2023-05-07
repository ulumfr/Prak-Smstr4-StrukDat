package Kegiatan2;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    Node head, tail;

    public Queue() {
        head = tail = null;
    }

    void enqueue(String data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void dequeue() {
        if (head == null){
            return;
        }

        head = head.next;

        if (head == null){
            tail = null;
        }
    }

    String peek() {
        if (head == null)
            return "Queue is empty";
        return head.data;
    }

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}