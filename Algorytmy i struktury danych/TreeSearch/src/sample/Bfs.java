package sample;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    private ArrayList<Node> tree;
    private Queue<Node> que;

    public Bfs(){
        this.tree = new ArrayList<>();
        this.que = new LinkedList<>();
    }

    public String file(String fileName) throws IOException {
        String text="";
        FileReader inputStream = new FileReader(fileName);
        int c;
        while ((c=inputStream.read()) != -1){
            text += (char)c;
        } return text;

    }


    public int createMatrix(String file){
        int nodeNumber = 0;
        StringBuilder macierz= new StringBuilder();
        int amountOfElements = ((int)file.charAt(0)-48);

        /* dodawanie wierzchołków */
        for (int i=0; i < amountOfElements; i++){
            tree.add(new Node((char)(48+i)));
        }

        /* string sąsiedztw */
        for(int i = 3; i < file.length();i++) {
            if(file.charAt(i) != 10 && file.charAt(i) != 13) {
                macierz.append(file.charAt(i));
            }

        }

        /* lista sąsiedztw */
        for(int i = 1; i < macierz.length(); i+=1) {
            if(i%amountOfElements == 0) {
                nodeNumber++;
                continue;
            }
            if(macierz.charAt(i) == '1')
                this.tree.get(nodeNumber).addNode(this.tree.get(i%amountOfElements));

        }
        return amountOfElements;
    }

    public void search(int amountOfElemenets) {
        /*ustawianie wartości elementów */
        for(int i=0; i<tree.size(); i++){
            tree.get(i).setLast(null);
            tree.get(i).setColor("w");
        }
        String edges = "";
        while(findWhite(amountOfElemenets) != -1){
            que.add(tree.get(findWhite(amountOfElemenets)));
            while (!que.isEmpty()){
                Node queNode = que.remove();
                System.out.println(queNode.getSign() + " ");
                for(Node node : queNode.getLinkedNodes()){
                    if(node.getColor() == "w"){
                        node.setColor("g");
                        node.setLast(queNode);
                        edges += "(" + node.getLast().getSign() + ", " + node.getSign() +"), ";
                        que.add(node);
                    }
                }
                queNode.setColor("b");
            }

        }
        System.out.println("\n" + edges);

    }

    public int findWhite(int amountOfElements){
        for(int i=0; i<amountOfElements; i++){
            if(tree.get(i).getColor() == "w"){
                return i;
            }
        }
        return -1;
    }

}
