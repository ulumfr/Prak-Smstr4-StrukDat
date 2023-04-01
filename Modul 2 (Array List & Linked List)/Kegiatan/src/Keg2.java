class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node awal;
    Node akhir;

    public LinkedList() {
        awal = null;
        akhir = null;
    }

    public void tambahNode(int data) {
        Node nodeBaru = new Node(data);

        if (awal == null) {
            awal = nodeBaru;
            akhir = nodeBaru;
        } else {
            akhir.next = nodeBaru;
            akhir = nodeBaru;
        }
    }

    public void urutNode() {
        Node current = awal, index = null;
        int temp;

        if (awal == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void displayOutput() {
        Node current = awal;

        if (awal == null) {
            System.out.println("List tidak ada");
            return;
        }

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

        list.tambahNode(7);
        list.tambahNode(1);
        list.tambahNode(4);
        list.tambahNode(6);
        list.tambahNode(2);
        list.tambahNode(3);

        System.out.print("Before\t: ");
        list.displayOutput();

        list.urutNode();

        System.out.print("After\t: ");
        list.displayOutput();
    }
}
