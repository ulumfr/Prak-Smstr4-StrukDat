class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

public class NyobaKeg2{
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node nodeBaru = new Node(data);
        if (head == null){
            head = nodeBaru;
            tail = nodeBaru;

        }else{
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
    }

    public void addNode(int[] data) {
        for (int i = 0; i < data.length; i++) {
            addNode(data[i]);
        }
    }

    public void sort() {
        Node current = head, index = null;
        int temp;
 
        if (head == null) {
            return;
        }
        else {
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

    public void display() {
        Node current = head;
        System.out.println("Original list: ");
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        sort();

        System.out.println("\n");
        System.out.println("Sorted list: ");

        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {2,9,8,0};
        NyobaKeg2 sList = new NyobaKeg2();
        sList.addNode(arr);
        sList.addNode(5);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(1);
        sList.addNode(6);
        sList.addNode(7);
        sList.display();
 
    }
}