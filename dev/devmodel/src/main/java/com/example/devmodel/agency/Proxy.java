package com.example.devmodel.agency;

import android.util.Log;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    private void beforeRequest() {
        Log.e("agency", "Before request.");
    }

    private void afterRequest() {
        Log.e("agency", "After request.");
    }
}
