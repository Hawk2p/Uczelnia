package sample;

public class Main {
    public static void main(String[] args){
        TaylorSum tay = new TaylorSum(-0.98,20);
        tay.fillArray();
        tay.printArray();
        System.out.println(tay.sumArrayForward());
        System.out.println(tay.sumArrayBackward());
    }
}
