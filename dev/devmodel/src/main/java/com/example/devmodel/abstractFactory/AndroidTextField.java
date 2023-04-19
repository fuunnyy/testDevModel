package com.example.devmodel.abstractFactory;

import android.util.Log;

public class AndroidTextField extends TextField{
    @Override
    public void display() {
        Log.e(TAG, "display: android textfield");
    }
}
