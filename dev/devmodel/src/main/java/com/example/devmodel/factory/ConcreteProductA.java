package com.example.devmodel.factory;

import android.util.Log;

public class ConcreteProductA extends Product{
    @Override
    public void operation() {
        Log.e("factory", "operation: concreteProductA", null);
    }
}
