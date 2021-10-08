package com.company.myCompany.InterviewCamp.GraphAdjacencyList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Node n1 =  new Node(1);
        Node n2 =  new Node(2);
        n1.addNeighbours(n2);
        Node n3 =  new Node(3);
        n1.addNeighbours(n3);
        Node n4 =  new Node(4);
        n2.addNeighbours(n4);
        n3.addNeighbours(n4);
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        int target = 2;
        Graph graph = new Graph(nodes);
        System.out.println(dfs(graph, target));
    }
    public static boolean dfs(Graph graph, int target) {
        for (Node node : graph.getNodes()) {
            if(node.getState() == State.UNVISITED && dfsVisit(node, target))
                return true;
        }
        return false;
    }
    public static boolean dfsVisit(Node node, int target) {
        node.setState(State.VISITING);

        if (node.data == target) return true;

        for(Node currentNodeNeighbour : node.getNeighbours()) {
            if (currentNodeNeighbour.getState() == State.UNVISITED && dfsVisit(currentNodeNeighbour, target))
                return true;
        }
        node.setState(State.VISITED);
        return false;
    }
}
