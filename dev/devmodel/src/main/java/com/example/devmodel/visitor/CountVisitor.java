package com.example.devmodel.visitor;

public class CountVisitor implements Visitor {

    private int fileCount;
    private int directoryCount;

    @Override
    public void visit(File file) {
        fileCount++;
    }

    @Override
    public void visit(Dictory dictionary) {
        directoryCount++;
        for (Element element :
                dictionary.getElements()) {
            element.accept(this);
        }
    }

    public int getFileCount() {
        return fileCount;
    }

    public int getDirectoryCount() {
        return directoryCount;
    }
}
