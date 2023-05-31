import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> kiri;
    Node<T> kanan;

    public Node(T data) {
        this.data = data;
        kiri = kanan = null;
    }
}

class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(T data) {
        root = insertNode(root, data);
    }

    private Node<T> insertNode(Node<T> node, T data) {
        if (node == null) {
            return new Node<>(data);
        }

        if (data.toString().compareTo(node.data.toString()) < 0) {
            node.kiri = insertNode(node.kiri, data);
        } else if (data.toString().compareTo(node.data.toString()) >= 0){
            node.kanan = insertNode(node.kanan, data);
        }
        return node;
    }
    
    private void preOrderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.kiri);
            preOrderTraversal(node.kanan);
        }
    }

    public void preOrder() {
        System.out.print("\nPre Order Traversal\t: ");
        preOrderTraversal(root);
        System.out.println();
    }

    private void inOrderTraversal(Node<T> node) {
        if (node != null) {
            inOrderTraversal(node.kiri);
            System.out.print(node.data + " ");
            inOrderTraversal(node.kanan);
        }
    }

    public void inOrder() {
        System.out.print("In Order Traversal\t: ");
        inOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(Node<T> node) {
        if (node != null) {
            postOrderTraversal(node.kiri);
            postOrderTraversal(node.kanan);
            System.out.print(node.data + " ");
        }
    }

    public void postOrder() {
        System.out.print("Post Order Traversal\t: ");
        postOrderTraversal(root);
        System.out.println();
    }

    public void gambar() {
        System.out.println("\n=== Binary Tree ===\n");
        gambarPohon(root, 0);
    }

    private void gambarPohon(Node<T> node, int level) {
        if (node == null) {
            printSpace(level);
            System.out.println(" ");
            return;
        }

        gambarPohon(node.kanan, level + 1);
        printSpace(level);
        System.out.println(node.data);
        gambarPohon(node.kiri, level + 1);
    }

    private void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
    }
}

public class Kegiatan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinaryTree<String> binaryTree = new BinaryTree<>();

        System.out.println("==== KEGIATAN 2 (Tree) ====");
        System.out.print("Data Loker, Kombinasi (Angka atau Huruf) : ");

        String inputLine = input.nextLine();
        String[] values = inputLine.split(" ");
        for (String kombinasi : values) {
            binaryTree.insert(kombinasi);
        }

        binaryTree.gambar();

        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();

        input.close();
    }
}
