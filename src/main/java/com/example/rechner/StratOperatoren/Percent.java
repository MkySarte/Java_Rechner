package com.example.rechner.StratOperatoren;

public class Percent implements IOperatoren{

    @Override
    public double calc(double a, double b) {
        //G  x pSatz / 100
        return a * (b /100);
    }
}
