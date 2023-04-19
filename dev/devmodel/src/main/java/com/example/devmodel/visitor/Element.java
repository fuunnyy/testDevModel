package com.example.devmodel.visitor;

public interface Element {
    void accept(Visitor visitor);
}
