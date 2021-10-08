package com.company.myCompany.InterviewCamp.GraphAdjacencyList;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    List<Node> neighbours;
    State state;
    public Node(int data) {
        super();
        this.state = State.UNVISITED;
        this.data = data;
        this.neighbours = new ArrayList<Node>();
    }

    public Node(int data, List<Node> neighbours) {
        super();
        this.state = State.UNVISITED;
        this.data = data;
        this.neighbours = neighbours;
    }

    public int getData() {
        return data;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }
    public void addNeighbours(Node node) {
        this.neighbours.add(node);
    }
    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }
}
    enum State{
        UNVISITED,
        VISITED,
        VISITING;
    }