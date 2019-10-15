package sample;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        String filePath = "E:\\Uczelnia\\Github\\Algorytmy i struktury danych\\TreeSearch\\src\\drugamacierz.txt";
        String filePathTwo = "E:\\Uczelnia\\Github\\Algorytmy i struktury danych\\TreeSearch\\src\\macierz.txt";


        Bfs bfs = new Bfs();
        int amountOfElements = bfs.createMatrix(bfs.file(filePath));
        bfs.search(amountOfElements);
    }

}
