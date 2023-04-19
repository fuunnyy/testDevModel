package com.example.devmodel.state;

import android.util.Log;

public class ConcreteStateA extends State{
    @Override
    public void handle(Context context) {
        Log.e("state", "handle: concreteA handling ...");
        context.setState(new ConcreteStateB());
    }
}
