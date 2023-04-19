package com.example.devmodel.complie;

import android.util.Log;

public class ImageFile extends File{
    @Override
    public void display() {
        Log.e("compile", "display: imageFile " + getName());
    }

    public ImageFile(String name) {
        super(name);
    }
}
