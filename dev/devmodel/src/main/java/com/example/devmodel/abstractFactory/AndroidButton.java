package com.example.devmodel.abstractFactory;

import android.util.Log;

public class AndroidButton extends Button{
    @Override
    public void display() {
        Log.e(TAG, "display: androidbutton");
    }
}
