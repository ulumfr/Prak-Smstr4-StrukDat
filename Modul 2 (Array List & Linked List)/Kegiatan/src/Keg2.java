class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
 
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void sortList() {

        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node min = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (innerCurrent.data < min.data) {
                    min = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Keg2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(7);
        list.addNode(1);
        list.addNode(4);
        list.addNode(6);
        list.addNode(2);
        list.addNode(3);

        System.out.print("Original: ");
        list.printList();

        list.sortList();

        System.out.print("Sorting: ");
        list.printList();
    }
}
