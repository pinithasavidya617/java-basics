package Day8;


import Day6.Node;

public class Activity01 {

    public static void main(String[] args) {

        Node n = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n.next = n2;
        n2.next = n3;
        System.out.println(n.next.next.data);
    }

}
