package com.example.devmodel.chain;

import android.util.Log;

public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(int request){
        if (canHandle(request)){
            handle(request);
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            Log.e("chain", "handleRequest: no handler can handle");
        }
    }

    protected abstract boolean canHandle(int request);
    protected abstract void handle(int request);
}
