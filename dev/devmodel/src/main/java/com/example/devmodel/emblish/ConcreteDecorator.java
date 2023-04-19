package com.example.devmodel.emblish;

import android.util.Log;

public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior() {
        Log.e("emblish", "addBehavior:  ConcreteDecorator");
    }
}
