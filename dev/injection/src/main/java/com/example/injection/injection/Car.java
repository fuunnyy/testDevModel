package com.example.injection.injection;

import android.util.Log;

import javax.inject.Inject;

public final class Car {
    private String tyre;
    private String engine;

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Inject
    public Car() {
        Log.e("injection", "Car:");
    }

    public void drive(){
        Log.e("injection", "drive: "+tyre + "  引擎： " + engine);
    }
}
