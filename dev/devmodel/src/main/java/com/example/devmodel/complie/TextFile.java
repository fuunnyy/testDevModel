package com.example.devmodel.complie;

import android.util.Log;

public class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        Log.e("compile", "display: textfile" + getName());
    }
}
