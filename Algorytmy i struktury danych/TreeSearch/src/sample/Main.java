package sample;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\Hawk2p\\IdeaProjects\\TreeSearch\\src\\macierz.txt";
        String filePathTwo = "C:\\Users\\Hawk2p\\IdeaProjects\\TreeSearch\\src\\drugamacierz.txt";


        Bfs bfs = new Bfs();
        int amountOfElements = bfs.createMatrix(bfs.file(filePathTwo));
        bfs.search(amountOfElements);
    }

}
