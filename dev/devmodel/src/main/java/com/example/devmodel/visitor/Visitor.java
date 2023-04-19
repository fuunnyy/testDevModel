package com.example.devmodel.visitor;

public interface Visitor {
    void visit(File file);
    void visit(Dictory dictionary);
}
