package Day9.BinaryTrees;


public class BinarySearchTrees {

    private Node root;

    public BinarySearchTrees() {

        this.root = null;
    }

    // without recursive mode
//    public void insert(int value) {
//
//        if (root == null) {
//            this.root = new Node(value);
//        }
//
//        if (root.data > value) {
//            root.left = new Node(value);
//        }
//
//        if(root.data < value) {
//            root.right = new Node(value);
//        }
//    }


    // recursive mode
    public void insert(int value) {

        root = insertHelper(root , value);
    }

    private Node insertHelper(Node node , int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insertHelper(node.left , value);

        }else if (value > node.data) {
            node.right = insertHelper(node.right , value);
        }

        return node;
    }

    public void inOrder () {
        inOrderHelper(root);
    }

    public void inOrderHelper (Node node) {

        if (node == null) {
            return;
        }

        inOrderHelper(node.left);
        System.out.println(node.data + " ");
        inOrderHelper(node.right);
    }

    public void preOrder() {
        preOrderHelper(root);
    }

    public void preOrderHelper (Node node) {

        if (node == null) {
            return;
        }

        System.out.println(node.data + " ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }

    public void postOrder() {
        postOrderHelper(root);
    }

    public void postOrderHelper (Node node) {

        if (node == null) {
            return;
        }

        postOrderHelper(node.left);
        postOrderHelper(node.right);
        System.out.println(node.data + " ");
    }
}