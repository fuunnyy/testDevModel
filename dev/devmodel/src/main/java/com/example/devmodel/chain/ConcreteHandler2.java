package com.example.devmodel.chain;

import android.util.Log;

public class ConcreteHandler2 extends Handler{
    @Override
    protected boolean canHandle(int request) {
        return request >= 10 && request <20;
    }

    @Override
    protected void handle(int request) {
        Log.e("chain", "handle: concreteHandler2 handle");
    }
}
