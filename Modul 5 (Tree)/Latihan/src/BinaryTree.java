class Node {
    int data;
    Node left;
    Node right;

    public Node (int data){
        this.data = data;
    }
}

public class BinaryTree {
    Node root;
    
    public void NewNode (int data){
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root, Node newData){
        if (root == null){
            root = newData;
            return root;
        }
        if (newData.data < root.data){
            root.left = NewNode(root.left, newData);
        }else{
            root.right = NewNode(root.right, newData);
        }
        return root;
    }

    public void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if (node != null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        System.out.print("\nPre Order\t: ");
        tree.preOrder(tree.root);
        System.out.print("\nIn Order\t: ");
        tree.inOrder(tree.root);
        System.out.print("\nPost Order\t: ");
        tree.postOrder(tree.root);
    }
}
