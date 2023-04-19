package com.example.devmodel.abstractFactory;

public class AndroidFactory extends AbstractFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextField createTextField() {
        return new AndroidTextField();
    }
}
