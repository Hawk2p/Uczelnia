package pod;

public class Substring {

    private String subOne;
    private String subTwo;
    private int[][] arr;
    private char[][] arrChar;

    Substring(String subOne, String subTwo){
        this.subOne = subOne;
        this.subTwo = subTwo;
        this.arr = new int[subOne.length()+1][subTwo.length()+1];
        this.arrChar = new char[subOne.length()+1][subTwo.length()+1];
    }

    private void fillNull(){
        for(int i=0; i<=getSubOne().length(); i++){
            arr[i][0] = 0;
        }
        for(int i=0; i<=getSubTwo().length(); i++){
            arr[0][i] = 0;
        }
    }

    void longestSubstring(){
        fillNull();
        int lenOne = getSubOne().length();
        int lenTwo = getSubTwo().length();

        for(int i=1; i<=lenOne; i++) {
            for (int j = 1; j <= lenTwo; j++) {
                if (subOne.charAt(i - 1) == subTwo.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                    arrChar[i][j] = '/';
                } else if (arr[i - 1][j] > arr[i][j - 1]) {
                    arr[i][j] = arr[i - 1][j];
                    arrChar[i][j] = '|';
                } else {
                    arr[i][j] = arr[i][j - 1];
                    arrChar[i][j] = '-';
                }
            }
        }
        System.out.println(arr[lenOne][lenTwo]);
    }

    void printLS(){
        for(int i=0; i<=getSubOne().length(); i++){
            for(int j=0; j<=getSubTwo().length(); j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void printLSC(){
        for(int i=0; i<=getSubOne().length(); i++){
            for(int j=0; j<=getSubTwo().length(); j++){
                System.out.print(arrChar[i][j] + " ");
            }
            System.out.println();
        }

    }

    void printSub(int i, int j){
        if(i==0 || j==0){
            System.out.print(subOne.charAt(i));
            return ;
        }
        if(arrChar[i][j] == '/'){
            printSub(i-1,j-1);
            System.out.print(subOne.charAt(i));
        } else if(arrChar[i][j] == '|') printSub(i-1,j);
        else printSub(i,j-1);
    }

    String getSubOne() {
        return subOne;
    }

    String getSubTwo() {
        return subTwo;
    }


}
