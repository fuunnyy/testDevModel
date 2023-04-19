package com.example.devmodel.channel;

import android.util.Log;

public class Circle extends Shape{

    private int x, y, radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        Log.e("channel: ", "draw: "+ color.getColor() + " circle at: "+ x + " y: " + y);
    }
}
