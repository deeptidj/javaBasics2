package com.company.myCompany.InterviewCamp.GraphAdjacencyList;

import java.util.List;

public class Graph {
    List<Node> nodes;

    public Graph(List<Node> nodes) {
        super();
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode(Node node){
        nodes.add(node);
    }
}
