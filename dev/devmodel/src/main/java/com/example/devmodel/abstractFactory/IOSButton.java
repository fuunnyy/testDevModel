package com.example.devmodel.abstractFactory;

import android.util.Log;

public class IOSButton extends Button{
    @Override
    public void display() {
        Log.e(TAG, "display: ios button");
    }
}
