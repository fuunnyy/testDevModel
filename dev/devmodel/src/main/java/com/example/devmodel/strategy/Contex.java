package com.example.devmodel.strategy;

public class Contex {
    private Strategy strategy;

    public Contex(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2) {
        strategy.doOperation(num1, num2);
    }
}
