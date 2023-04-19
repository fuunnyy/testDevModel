package com.example.devmodel.factory;

public class Factory {
    public static Product createProduct(String type) {
        switch (type){
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return null;
        }
    }
}
