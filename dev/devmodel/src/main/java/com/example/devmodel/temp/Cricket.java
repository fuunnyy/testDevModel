package com.example.devmodel.temp;

import android.util.Log;

public class Cricket extends Game{
    @Override
    void initialize() {
        Log.e("temp", "initialize: ");
    }

    @Override
    void startPlay() {
        Log.e("temp", "startplay: ");
    }

    @Override
    void endPlay() {
        Log.e("temp", "endplay: ");
    }
}
