package sample;


import java.util.ArrayList;

public class TaylorSum {

    private double arg;
    private int numberOfElements;
    private ArrayList<Double> result = new ArrayList<>();

    TaylorSum(double arg, int numberOfElements) {
        this.arg = arg;
        this.numberOfElements = numberOfElements;
    }


    void fillArray(){
        for(int i=1; i<=numberOfElements; i++){
            if((i+1)%2 == 0){
                double sum = (1.0 / i) * myPow(arg,i);
                result.add(sum);
            } else {
                double sum = (-1.0 / i) * myPow(arg,i);
                result.add(sum);
            }
        }
    }

    private double myPow(double x, long n){
        for(int i=0; i<n; i++){
            x*=x;
        }
        return x;
    }

    void printArray(){
        for(int i=0; i<numberOfElements; i++){
            System.out.println(result.get(i));
        }
    }

    double sumArrayForward(){
        double res=0;
        for(int i=0; i<numberOfElements; i++){
            res+=result.get(i);
        }
        return res;
    }

    double sumArrayBackward(){
        double res=0;
        for(int i = numberOfElements-1; i>=0; i--){
            res+=result.get(i);
        }
        return res;
    }

    public double getArg() {
        return arg;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public ArrayList<Double> getResult() {
        return result;
    }
}
