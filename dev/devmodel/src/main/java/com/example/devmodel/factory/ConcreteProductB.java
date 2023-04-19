package com.example.devmodel.factory;

import android.util.Log;

public class ConcreteProductB extends Product{
    @Override
    public void operation() {
        Log.e("factory", "operation: concreteProductB", null);
    }
}
