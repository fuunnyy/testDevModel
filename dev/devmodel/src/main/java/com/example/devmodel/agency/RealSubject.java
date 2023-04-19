package com.example.devmodel.agency;

import android.util.Log;

public class RealSubject implements Subject{
    @Override
    public void request() {
        Log.e("agency", "request: real subject");
    }
}
