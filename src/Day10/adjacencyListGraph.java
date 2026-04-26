package Day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class adjacencyListGraph {

    ArrayList<LinkedList<Node>> adjacencyList ;

    adjacencyListGraph () {
        adjacencyList = new ArrayList<>();
    }

    public void addNode (Node node) {

        // for each unique node we should create a new linked list
        // add the node to the linked list
        // then add the linked list to the adjacency list

        LinkedList<Node> newList = new LinkedList<>();
        newList.add(node);
        adjacencyList.add(newList);
    }

    public void addEdge (int src , int dst) {

        LinkedList<Node> currentList = adjacencyList.get(src);
        Node dstNode = adjacencyList.get(dst).getFirst();
        currentList.add(dstNode);
    }

    public boolean checkEdge (int src , int dst) {

        LinkedList<Node> currentList = adjacencyList.get(src);
        Node dstNode = adjacencyList.get(dst).getFirst();

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }
}