package sample;


public class Node{
    int numberOfOcc;
    char sign;
    Node rightNode;
    Node leftNode;
    String code;

    public Node(int numberOfOcc, char sign){
        this.numberOfOcc = numberOfOcc;
        this.sign = sign;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Node() {}


}
