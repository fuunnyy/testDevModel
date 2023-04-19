package com.example.devmodel.state;

import android.util.Log;

public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        Log.e("state", "handle: concreteB handling ...");
        context.setState(new ConcreteStateA());
    }
}
