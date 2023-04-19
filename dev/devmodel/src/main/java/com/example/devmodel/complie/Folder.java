package com.example.devmodel.complie;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<File>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }
}
