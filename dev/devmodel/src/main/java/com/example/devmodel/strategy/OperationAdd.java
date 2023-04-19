package com.example.devmodel.strategy;

import android.util.Log;

public class OperationAdd implements Strategy{
    @Override
    public void doOperation(int num1, int num2) {
        Log.e("strategy", "doOperation: add:" + (num1 + num2));
    }
}
