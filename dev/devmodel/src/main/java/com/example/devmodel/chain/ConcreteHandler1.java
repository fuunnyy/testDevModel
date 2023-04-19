package com.example.devmodel.chain;

import android.util.Log;

public class ConcreteHandler1 extends Handler{

    @Override
    protected boolean canHandle(int request) {
        return request >=0 && request < 10;
    }

    @Override
    protected void handle(int request) {
        Log.e("chain", "handle: in concrete handler1");
    }
}
