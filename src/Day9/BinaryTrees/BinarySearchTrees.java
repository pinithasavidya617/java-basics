package Day9.BinaryTrees;


public class BinarySearchTrees {

    private Node root;

    public BinarySearchTrees() {

        this.root = null;
    }

    public void insert(int value) {

        if (root == null) {
            root = new Node(value);

        }else {
            if (root.data > value) {
                root.left = new Node(value);

            }else if(root.data < value) {
                root.right = new Node(value);
            }
        }

    }
}