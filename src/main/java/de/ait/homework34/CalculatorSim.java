package de.ait.homework34;

public class CalculatorSim {

    public int add(int a, int b){
        int first = a;
        int second = b;
        return first+second;
    }

    private int subtract (int a, int b){
        return a-b;
    }

    public int multyply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        if(b == 0){
            System.out.println("Divide by 0!!!!");
            return -1;
        }
        else {
            //Indication for calculating division in double format
            return (double) a/b;
        }
    }

}
