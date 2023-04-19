package com.example.devmodel.strategy;

import android.util.Log;

public class OperationSubstract implements Strategy{
    @Override
    public void doOperation(int num1, int num2) {
        Log.e("strategy", "doOperation: substract:" + (num1 - num2));
    }
}
