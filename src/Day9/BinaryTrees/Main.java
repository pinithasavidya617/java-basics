package Day9.BinaryTrees;


public class Main {

    public static void main(String[] args) {

        BinarySearchTrees bst = new BinarySearchTrees();

        bst.insert(40);
        bst.insert(30);
        bst.insert(60);
        bst.insert(15);
        bst.insert(35);
        bst.insert(80);
        bst.insert(50);
        bst.insert(45);
        bst.insert(70);

        bst.inOrder();
        System.out.println("_____________________");
        bst.preOrder();
        System.out.println("_____________________");
        bst.postOrder();
    }
}