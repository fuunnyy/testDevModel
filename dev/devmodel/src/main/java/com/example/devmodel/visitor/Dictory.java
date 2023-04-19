package com.example.devmodel.visitor;

import java.util.List;

public class Dictory implements Element{

    private final List<Element> elements;

    public Dictory(List<Element> elements) {
        this.elements = elements;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
