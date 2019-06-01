package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Huffman {


    void fillList(List<Node> lista) throws FileNotFoundException {
        File file = new File("tekst.txt");
        Scanner scan = new Scanner(file);

        String word;
        int amountOfLetters = 0;
        boolean hasList = false;

        while (scan.hasNext()) {
            word = scan.next();
            for(amountOfLetters=0; amountOfLetters<word.length(); amountOfLetters++) {
                if (lista.isEmpty()) {
                    lista.add(new Node(1, word.charAt(amountOfLetters)));
                    continue;
                }
                for (Node node : lista) {
                    if (word.charAt(amountOfLetters) == node.sign) {
                        node.numberOfOcc++;
                        hasList = true;
                    }
                }
                if(!hasList){
                    lista.add(new Node(1, word.charAt(amountOfLetters)));
                    hasList = false;
                }
                hasList = false;
            }

        }
    }

    void sortList(List<Node> lista, String sign){
        for(int i=0; i<lista.size(); i++){
            for(int j=0; j<lista.size(); j++){
                if(sign.equals("rosnąco")){
                    if(lista.get(j).numberOfOcc > lista.get(i).numberOfOcc)
                        Collections.swap(lista,i,j);
                } else if(sign.equals("malejąco")){
                    if(lista.get(j).numberOfOcc < lista.get(i).numberOfOcc)
                        Collections.swap(lista,i,j);
                }
            }
        }
    }

    Node createHuffman(List<Node> list){
        Node mainRoot = new Node();
        Huffman s1 = new Huffman();

        while(list.size() > 1){
            Node leftLeaf = list.get(0);
            list.remove(list.get(0));

            Node rightLeaf = list.get(0);
            list.remove(list.get(0));

            Node parentNode = new Node(leftLeaf.numberOfOcc + rightLeaf.numberOfOcc,'-');
            parentNode.leftNode = leftLeaf;
            parentNode.rightNode = rightLeaf;

            mainRoot = parentNode;

            list.add(mainRoot);
            s1.sortList(list,"rosnąco");

        }
        return mainRoot;
    }

    void saveHuffman(Node node, String code, List<Node> list){
        if(node.leftNode == null && node.rightNode == null){
            node.code = code;
            list.add(node);
            return;
        }

        if(node.leftNode != null)
        saveHuffman(node.leftNode, code + "0",list);
        if(node.rightNode != null)
        saveHuffman(node.rightNode, code + "1",list);
    }


    public static void main(String[] args) throws FileNotFoundException {
        List<Node> list = new ArrayList<>();
        List<Node> result = new ArrayList<>();
        Huffman s1 = new Huffman();
        Node nodes = new Node();


        s1.fillList(list);
        s1.sortList(list,"rosnąco");
        nodes = s1.createHuffman(list);
        s1.saveHuffman(nodes,"",result);
        s1.sortList(result,"malejąco");


        System.out.println("-------------------------------------");
        System.out.println("| znak  | czestosc |  kod Huffmana  |");
        System.out.println("-------------------------------------");

        for( Node node : result){
            System.out.println("|   " + node.sign + "   |   " + node.numberOfOcc + "   |    " + node.code );
        }

        System.out.println("------------------------------------");

    }
}
