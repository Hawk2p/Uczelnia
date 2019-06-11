package sample;

import java.util.ArrayList;

public class Node {
    private char sign;
    private ArrayList<Node> linkedNodes = new ArrayList<>();
    private Node last;
    private String color;

    public Node(char sign){
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public ArrayList<Node> getLinkedNodes() {
        return linkedNodes;
    }

    public void setLinkedNodes(ArrayList<Node> linkedNodes) {
        this.linkedNodes = linkedNodes;
    }

    public void addNode(Node node){
        linkedNodes.add(node);
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
