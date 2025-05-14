package com.example.rechner.StratOperatoren;

public class Div implements IOperatoren{

    @Override
    public double calc(double a, double b) {
        //durch 0 nicht erlaub Exception

        if(b == 0)
        {
            throw new ArithmeticException("Teilen durch 0");
        }
        return a / b;
    }
}
