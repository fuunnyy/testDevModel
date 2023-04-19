package com.example.devmodel.clone;

public class AndroidWidget implements Prototype{

    private String type;
    private int size;

    public AndroidWidget(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Prototype clone() {
        return new AndroidWidget(type, size);
    }
}
