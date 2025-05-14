package com.example.rechner.StratOperatoren;

// add wird mit IOperatoren erweitert und muss die methode nutzen
public class Add implements IOperatoren{

    @Override
    public double calc(double a, double b) {
        return a + b;
    }
}
