package com.example.devmodel.observer;

import android.util.Log;

public class ConcreteObserver implements Observer{

    private int state;

    @Override
    public void update(int value) {
        state = value;
        Log.e("observer", "update: "+state);
    }
}
